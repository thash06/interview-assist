package com.interview.assist.repository;

import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class FileRepositoryImpl implements FileRepository{

    @Override
    public String readFile(String filePath) throws Exception {

        try {
            Path _filePath = Paths.get(filePath).normalize().toAbsolutePath();
            return Files.readString(_filePath);
        } catch (Exception e) {
            throw new Exception("Failed to store file.", e);
        }
    }
}
