package com.example.lotbot;

public class Spaceship {
    private String licensePlate;
    private String color;

    public Spaceship(String licensePlate, String color) {
        this.licensePlate = licensePlate;
        this.color = color;
    }

    public String getShipId() {
        return licensePlate;
    }

    public void setShipId(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
