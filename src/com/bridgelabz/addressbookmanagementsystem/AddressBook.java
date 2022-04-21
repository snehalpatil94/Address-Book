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
}
