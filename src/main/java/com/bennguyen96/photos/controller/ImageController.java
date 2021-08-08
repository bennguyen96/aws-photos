package com.bennguyen96.photos.controller;

import com.bennguyen96.photos.model.Image;
import com.bennguyen96.photos.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("photos")
@CrossOrigin("*")
public class ImageController {

    ImageService imageService;

    @Autowired
    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping("/all")
    public List<Image> getImages() {
        return imageService.getImages();
    }

    @GetMapping("/{id}")
    public Optional<Image> getByID(@PathVariable("id") UUID uuid) {
        return imageService.getImageByID(uuid);
    }

    @PostMapping(path = "/upload",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void uploadImage(@RequestParam("image") MultipartFile file) {
        imageService.uploadImage(file);
    }
}
