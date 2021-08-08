package com.bennguyen96.photos.service;

import com.bennguyen96.photos.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ImageService {

    public Optional<Image> getImageByID(UUID uuid);

    public List<Image> getImages();

    public void uploadImage(MultipartFile file);
}
