package com.example.recyclerviewatoz;

public class FoodModel {

    int image;
    String name,like ;

    public FoodModel() {
    }

    public FoodModel(int image, String name, String like) {
        this.image = image;
        this.name = name;

    }

    public  int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
