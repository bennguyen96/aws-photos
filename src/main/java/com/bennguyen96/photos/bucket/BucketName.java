package com.bennguyen96.photos.bucket;

public enum BucketName {

    PROFILE_IMAGE("bennguyen96-photos");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
