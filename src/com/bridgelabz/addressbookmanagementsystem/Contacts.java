package com.bridgelabz.addressbookmanagementsystem;

public class Contacts {
    private String firstName, lastName, email, mobileNumber;
    Address address;

    // Getter and Setter Methods
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getmobileNumber() {
        return mobileNumber;
    }

    public void setmobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Contact [First Name=" + firstName + ", Last Name=" + lastName + ", Email=" + email + ", Mobile Number="
                + mobileNumber + " , " + address + "]";
    }
}