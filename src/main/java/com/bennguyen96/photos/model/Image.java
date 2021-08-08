package com.bennguyen96.photos.model;

import java.util.Objects;
import java.util.UUID;

public class Image {
    private UUID uuid;
    private String imageLink;
    private String description;

    public Image(UUID uuid, String imageLink, String description) {
        this.uuid = uuid;
        this.imageLink = imageLink;
        this.description = description;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return Objects.equals(uuid, image.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, imageLink, description);
    }

    @Override
    public String toString() {
        return "Image{" +
                "uuid=" + uuid +
                ", imageLink='" + imageLink + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
