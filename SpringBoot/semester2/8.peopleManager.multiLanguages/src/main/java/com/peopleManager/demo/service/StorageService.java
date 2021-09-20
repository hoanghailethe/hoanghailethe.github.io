package com.peopleManager.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.peopleManager.demo.exception.StorageException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class StorageService {
  @Value("${upload.path}")
  private String path;

  public void uploadFile(MultipartFile file, int idPerson) {
    if (file.isEmpty()) {
      throw new StorageException("Failed to store empty file");
    }

    try {
      var is = file.getInputStream();
      Files.copy(is, Paths.get(path + idPerson +".jpg"), StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException e) {
      var msg = String.format("Failed to store photo");
      throw new StorageException(msg, e);
    }
  }
}
