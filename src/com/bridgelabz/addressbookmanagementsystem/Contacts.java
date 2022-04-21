package com.bridgelabz.addressbookmanagementsystem;

/**
 * contact details of person
 *
 * @author : Snehal Patil
 */

public class Contacts {
    // Variable
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String pinCode;
    private String mobileNo;
    private String email;

    // Constructor
    public Contacts() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.mobileNo = mobileNo;
        this.email = email;
    }

    // Getter and Setter methods
    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String eMail) {
        this.email = eMail;
    }

    @Override
    public String toString() {
        return "Contact{" + "\n FirstName : " + firstName + ", LastName : " + lastName + " \n Address : " + address + ", City : " + city + ", State : " + state + "\n Mobile No : " + mobileNo + ", Pin-Code : " + pinCode + ", \n Email : " + email + '}';
    }
}
