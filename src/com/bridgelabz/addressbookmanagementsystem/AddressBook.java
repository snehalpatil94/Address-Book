package com.bridgelabz.addressbookmanagementsystem;

/**
 * Address book of functions
 *
 * @author : Snehal Patil
 */

import java.util.Scanner;

public class AddressBook {
    Contacts contacts;
    Scanner sc = new Scanner(System.in);

    // Method to add new contact in address book
    public void addContact() {
        contacts = new Contacts();
        System.out.println("Enter the first name : ");
        String firstName = sc.nextLine();
        System.out.println("Enter the last name : ");
        String lastName = sc.nextLine();
        System.out.println("Enter the address : ");
        String address = sc.nextLine();
        System.out.println("Enter the city : ");
        String city = sc.nextLine();
        System.out.println("Enter the state : ");
        String state = sc.nextLine();
        System.out.println("Enter the pincode : ");
        String pinCode = sc.nextLine();
        System.out.println("Enter the mobile no : ");
        String mobileNo = sc.nextLine();
        System.out.println("Enter Email id : ");
        String email = sc.nextLine();

        contacts.setfirstName(firstName);
        contacts.setlastName(lastName);
        contacts.setAddress(address);
        contacts.setCity(city);
        contacts.setState(state);
        contacts.setPinCode(pinCode);
        contacts.setMobileNo(mobileNo);
        contacts.setEmail(email);
        System.out.println(contacts);
    }

    // Displaying added contact in Address Book
    public void displayContact() {
        System.out.println("Your contact details are : ");
        String firstName1 = contacts.getfirstName();
        System.out.println("First Name : " + firstName1);
        String lastName1 = contacts.getlastName();
        System.out.println("Last Name : " + lastName1);
        String address1 = contacts.getAddress();
        System.out.println("Address : " + address1);
        String city1 = contacts.getCity();
        System.out.println("City : " + city1);
        String state1 = contacts.getState();
        System.out.println("State : " + state1);
        String pinCode1 = contacts.getPinCode();
        System.out.println("Pin Code : " + pinCode1);
        String mobileNo1 = contacts.getMobileNo();
        System.out.println("Mobile No : " + mobileNo1);
        String email1 = contacts.getEmail();
        System.out.println("Email id : " + email1);
    }
}
