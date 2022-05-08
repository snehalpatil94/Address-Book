package com.bridgelabz.addressbookmanagementsystem;

import java.util.Scanner;

/**
 * Ability to ensure there is no Duplicate Entry of the same Person in a particular Address Book
 *
 * @author : Snehal Patil
 */

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("-----------------Welcome to Address Book Program --------------------");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        String choice;
        boolean check = false;
        do {
            System.out.println(" ADDRESS BOOK SYSTEM MENU : ");
            System.out.println("1. ADD NEW ADDRESSBOOK \n2. EDIT ADDRESSBOOK \n3. DELETE ADDRESSBOOK" +
                    "\n4. DISPLAY ADDRESSBOOKS \n5. EXIT");
            System.out.println("Please Select the Operation Number : ");
            choice = sc.next();

            switch (choice) {
                case "1":
                    AddressBookDirectory.addNewAddressBook();
                    break;
                case "2":
                    AddressBookDirectory.editAddressBook();
                    break;
                case "3":
                    AddressBookDirectory.deleteAddressBook();
                    break;
                case "4":
                    AddressBookDirectory.displayAddressBooks();
                    break;
                case "5":
                    System.out.println("Thank You for using Address Book System.");
                    check = true;
                    break;
                default:
                    System.out.println("Please Select Valid Option");
                    break;
            }
            System.out.println("---------------------------------------------------------------------");
        } while (!check);
    }
}