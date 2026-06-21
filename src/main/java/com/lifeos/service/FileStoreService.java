package com.lifeos.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileStoreService {
	String storeFile(MultipartFile file);
}
