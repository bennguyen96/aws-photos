package com.bennguyen96.photos.service;

import com.bennguyen96.photos.datastore.FakeDataStore;
import com.bennguyen96.photos.filestore.FileStore;
import com.bennguyen96.photos.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ImageServiceImpl implements ImageService {

//    FileStore fileStore;
//
//    @Autowired
//    public ImageServiceImpl(FileStore fileStore) {
//        this.fileStore = fileStore;
//    }
    FakeDataStore fakeDataStore;

    @Autowired
    public ImageServiceImpl(FakeDataStore fakeDataStore) {
        this.fakeDataStore = fakeDataStore;
    }

    @Override
    public Optional<Image> getImageByID(UUID uuid) {
        return fakeDataStore.getImageByID(uuid);
    }

    @Override
    public List<Image> getImages() {
        return fakeDataStore.getImages();
    }

    @Override
    public void uploadImage(MultipartFile file) {
        return;
    }
}
