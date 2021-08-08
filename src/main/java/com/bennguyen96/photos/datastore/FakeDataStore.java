package com.bennguyen96.photos.datastore;

import com.bennguyen96.photos.model.Image;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class FakeDataStore {
    private static final List<Image> FAKE_DATA = new ArrayList<>();
    static {
        FAKE_DATA.add(0, new Image(UUID.randomUUID(), "testLink1", "fakeDescription1"));
        FAKE_DATA.add(1, new Image(UUID.randomUUID(), "testLink2", "fakeDescription2"));
    }

    public List<Image> getImages() {
        return FAKE_DATA;
    }

    public Optional<Image> getImageByID(UUID uuid) {
        return Optional.empty();
    }
}
