package com.cafe24.epm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.http.HttpServletRequest;

@Service
public class StorageService {
	
	@Autowired private HttpServletRequest request;
	
	@Value("${service.file.uploadurl}")
	private String fileUploadPath;
	
	/**
	 * 파일 업로드
	 * @param file
	 */
	public void store(MultipartFile file) {
		String filename = StringUtils.cleanPath(file.getOriginalFilename());
		try {
			InputStream inputStream = file.getInputStream();
			Files.copy(inputStream, getPath().resolve(filename),
					StandardCopyOption.REPLACE_EXISTING);
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 파일 다운로드 
	 * @param filename
	 * @return
	 */
	public Resource loadAsResource(String filename) {
		try {
			Path file = getPath().resolve(filename);
			Resource resource = new UrlResource(file.toUri());
			if (resource.exists() || resource.isReadable()) {
				return resource;
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 업로드 폴더 없을 경우 생성
	 */
	public void init() {
		try {
			Files.createDirectories(getPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 패스 객체 반환
	 * @return
	 */
	private Path getPath() {
		return Paths.get(fileUploadPath);
	}

}
