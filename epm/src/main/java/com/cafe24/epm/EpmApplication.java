package com.cafe24.epm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cafe24.epm.service.StorageService;

@SpringBootApplication
public class EpmApplication {

	public static void main(String[] args) {
		SpringApplication.run(EpmApplication.class, args);
	}
	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			//파일 업로드 없을 경우 폴더 생성
			storageService.init();
		};
	}
}
