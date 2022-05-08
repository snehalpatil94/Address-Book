package com.bridgelabz.addressbookmanagementsystem;

public class Contacts {
    // Variable
    private String firstName;

    public Contacts() {
    }

    private String lastName;
    private String mobileNumber;
    private String email;
    private String city;
    private String state;
    private String pinCode;

    // Constructor
    public Contacts(String firstName, String lastName, String mobileNumber, String city, String state, String pinCode, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.email = email;
    }

    // Getter and Setter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumberNumber() {
        return mobileNumber;
    }

    public void setmobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pincode) {
        this.pinCode = pincode;
    }

    @Override
    public String toString() {
        return "Contact[" + "First Name='" + firstName + '\'' + ", Last Name='" + lastName + '\'' + ", Mobile Number='"
                + mobileNumber + '\'' + ", Email='" + email + '\'' + ", City='" + city + '\'' + ", State='" + state
                + '\'' + ", Pincode='" + pinCode + '\'' + ']';
    }
}
