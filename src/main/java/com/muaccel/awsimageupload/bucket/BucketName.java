package com.muaccel.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("muaccel-image-upload-101");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
