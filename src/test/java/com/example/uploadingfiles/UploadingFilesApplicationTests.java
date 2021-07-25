package com.example.uploadingfiles;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.example.uploadingfiles.storage.StorageProperties;

// https://spring.io/guides/gs/uploading-files/#scratch
@SpringBootTest
@EnableConfigurationProperties(StorageProperties.class)
public class UploadingFilesApplicationTests extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(UploadingFilesApplication.class);
	}

	@Test
	void contextLoads() {
	}
}
