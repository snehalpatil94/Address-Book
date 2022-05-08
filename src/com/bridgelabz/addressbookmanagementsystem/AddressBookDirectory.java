package com.bridgelabz.addressbookmanagementsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Address book Directory functions
 *
 * @author : Snehal Patil
 */

public class AddressBookDirectory {

    static Map<String, AddressBook> addressBookDirctoryMap = new HashMap<>();

    AddressBookDirectory addressBookDirectory = new AddressBookDirectory();

    // Getter and Setter for Address Book Directory
    public static Map<String, AddressBook> getAddressBookMap() {
        return addressBookDirctoryMap;
    }

    public static void setAddressBookMap(Map<String, AddressBook> addressBookMap) {
        AddressBookDirectory.addressBookDirctoryMap = addressBookMap;
    }

    static Scanner sc = new Scanner(System.in);

    // Method to add Address Book in Directory
    public static void addNewAddressBook() {
        System.out.println("Enter the Address Book Name :");
        String addressbookName = sc.next();
        if (addressBookDirctoryMap.containsKey(addressbookName)) {
            System.out.println("This AddressBook is Already Available !");
        } else {
            AddressBook addressBook = new AddressBook();
            addressBookDirctoryMap.put(addressbookName, addressBook);
        }
    }

    // Method to Display Address Books present in Directory
    public static void displayAddressBooks() {
        System.out.println("\n***** Address Books in Directory ***** ");
        for (String key : addressBookDirctoryMap.keySet()) {
            System.out.println(key);
        }
        System.out.println("---------------------------------------");
    }

    // Method to Edit Address Book
    public static void editAddressBook() {
        displayAddressBooks();
        System.out.println("\nEnter the Address Book Name :");
        String addressbookName = sc.next();
        if (addressBookDirctoryMap.containsKey(addressbookName)) {
            addressBookDirctoryMap.get(addressbookName).addressBookMenu(addressBookDirctoryMap.get(addressbookName));
        } else {
            System.out.println("Entered Address Book Name is Invalid !");
        }
    }

    // Method to Delete Address Book
    public static void deleteAddressBook() {
        displayAddressBooks();
        System.out.println("Enter the Address Book Name :");
        String addressbookName = sc.next();
        if (addressBookDirctoryMap.containsKey(addressbookName)) {
            addressBookDirctoryMap.remove(addressbookName);
            System.out.println("Address Book is Deleted !");
        } else {
            System.out.println("Entered Address Book Name is Invalid !");
        }
    }
}