package com.bridgelabz.addressbookmanagementsystem;

/**
 * Program to view Persons by City or State
 *
 * @author : Snehal Patil
 */

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("-----------------Welcome to address book  Program --------------------");
        System.out.println();

        // Calling directoryMenu method to perform user choice of operation
        AddressBookDirectory addressBookDirectory = new AddressBookDirectory();
        addressBookDirectory.directoryMenu();
    }
}
