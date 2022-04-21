package com.bridgelabz.addressbookmanagementsystem;

/**
 * Ability to add a new Contact to Address Book
 *
 * @author : Snehal Patil
 */

public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("------------------Welcome to Address Book Management System !---------------------");
        System.out.println();

        AddressBook addressBook = new AddressBook();

        // Calling addContact and displayContact method
        addressBook.addContact();
        addressBook.displayContact();

    }
}