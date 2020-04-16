package com.louay.projects.model.chains.communications.group;

import com.louay.projects.model.chains.communications.GroupPost;

import java.sql.Blob;

public class GroupImgPost extends GroupPost {
    private java.sql.Blob image;
    private String fileName;

    public GroupImgPost() {
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return super.toString()+", GroupImgPost{" +
                "image=" + image +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}