package com.example.android.thekanpurguide;

public class Restaurant {

    private String coordinates, name, cuizine, address, phone, price, openHours;
    private int imageId;
    private float rating;

    public Restaurant(String coordinates, String name, String cuizine, String address, String phone, String price,
                      String openHours, int imageId, float rating) {
        this.coordinates = coordinates;
        this.name = name;
        this.cuizine = cuizine;
        this.address = address;
        this.phone = phone;
        this.price = price;
        this.openHours = openHours;
        this.imageId = imageId;
        this.rating = rating;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public int getImageId() {
        return imageId;
    }

    public float getRating() {
        return rating;
    }

    public String getAddress() {
        return address;
    }

    public String getCuizine() {
        return cuizine;
    }

    public String getNames() {
        return name;
    }

    public String getOpenHours() {
        return openHours;
    }

    public String getPhones() {
        return phone;
    }

    public String getPrice() {
        return price;
    }

}
