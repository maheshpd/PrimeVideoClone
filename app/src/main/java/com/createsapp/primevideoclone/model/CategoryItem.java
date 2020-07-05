package com.createsapp.primevideoclone.model;

public class CategoryItem {
    Integer id;
    String moviesName;
    String imageUrl;
    String fileUrl;

    public CategoryItem(Integer id, String moviesName, String imageUrl, String fileUrl) {
        this.id = id;
        this.moviesName = moviesName;
        this.imageUrl = imageUrl;
        this.fileUrl = fileUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMoviesName() {
        return moviesName;
    }

    public void setMoviesName(String moviesName) {
        this.moviesName = moviesName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
}
