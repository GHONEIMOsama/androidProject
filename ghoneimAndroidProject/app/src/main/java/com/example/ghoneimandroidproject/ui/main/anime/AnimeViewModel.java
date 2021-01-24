package com.example.ghoneimandroidproject.ui.main.anime;

import java.util.UUID;

public class AnimeViewModel {

    private String uuid;
    private String title;
    private String createdAt;
    private String description;
    private String imageUrl;
    private Double rating;

    public AnimeViewModel(String title, String createdAt, String description, String imageUrl, Double rating) {
        this.title = title;
        this.createdAt = createdAt;
        this.description = description;
        this.imageUrl = imageUrl;
        this.rating = rating;
        this.uuid = UUID.randomUUID().toString();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
