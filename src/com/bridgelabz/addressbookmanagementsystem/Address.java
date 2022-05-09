package com.bridgelabz.addressbookmanagementsystem;

public class Address {
    private String city, state,pinCode;

    // Getter and Setter methods
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getpinCode() {
        return pinCode;
    }

    public void setpinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "City=" + city + ", State=" + state + ", Pin-Code=" + pinCode;
    }
}