package com.bridgelabz.addressbookmanagementsystem;

/**
 * Ability to add multiple person details to Address Book
 *1
 * @author : Snehal Patil
 */

public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("------------------ Welcome to Address Book Management System !-------------------");
        System.out.println();

        AddressBook addressBook = new AddressBook();

        // Calling addressBookMenu to perform various operations in address book
        addressBook.addressBookMenu();
    }
}