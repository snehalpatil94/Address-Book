package com.bridgelabz.addressbookmanagementsystem;

/**
 * Address book of functions to add multiple contact
 *
 * @author : Snehal Patil
 */

import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contacts contact;
    ArrayList<Contacts> contactList = new ArrayList<Contacts>();

    /*
     * To take choice of operation from user to perform in address book
     */
    public void addressBookMenu() {
        boolean check = false;
        do {
            System.out.println("Menu of Address Book operation : ");
            System.out.println("Enter Your Choice \n 1. Add Contact \n 2. Display Contact \n 3. Edit Contact \n 4. Delete Contact \n 5. Exit");
            String option = sc.next();
            System.out.println();
            switch (option) {
                case "1":
                    addContact();
                    break;
                case "2":
                    displayContact();
                    break;
                case "3":
                    editContact();
                    break;
                case "4":
                    deleteContact();
                    break;
                case "5":
                    check = true;
                    System.out.println("Thank You !!");
                    break;
                default:
                    System.out.println("Please enter a valid option");
                    break;
            }
            System.out.println("--------------------------------------------------------------------------------");
        } while (!check);
    }

    // Taking input from console to add contact in address book
    public void addContact() {
        System.out.println("Enter the first name : ");
        String firstName = this.sc.next();
        System.out.println("Enter the last name : ");
        String lastName = this.sc.next();
        System.out.println("Enter the address : ");
        String address = this.sc.next();
        System.out.println("Enter the city : ");
        String city = this.sc.next();
        System.out.println("Enter the state : ");
        String state = this.sc.next();
        System.out.println("Enter the pincode : ");
        String pinCode = this.sc.next();
        System.out.println("Enter the mobile no : ");
        String mobileNo = this.sc.next();
        System.out.println("Enter Email id : ");
        String email = this.sc.next();

        contactList.add(new Contacts(firstName, lastName, address, city, state, pinCode, mobileNo, email));
        System.out.println();
        System.out.println(contactList);
        System.out.println();
        System.out.println("Contact added successfully");
        System.out.println();
    }

    // Method to display contacts of address book
    public void displayContact() {
        System.out.println("Number of contacts : " + contactList.size());
        if (contactList.isEmpty()) {
            System.out.println("There is no contact");
        } else {
            for (int i = 0; i < contactList.size(); i++) {
                System.out.println(contactList.get(i));
                System.out.println();
            }
        }
    }

    // Method to edit contacts of address book
    public void editContact() {
        System.out.println("Please Enter original first name for verification : ");
        String editName = sc.next();
        if (contactList.isEmpty()) {
            System.out.println("Contact list is empty");
        } else {
            for (int i = 0; i < contactList.size(); i++) {
                String name = contactList.get(i).getfirstName();

                if (name.equalsIgnoreCase(editName)) {
                    System.out.println("Enter the first name : ");
                    String firstName = this.sc.next();
                    System.out.println("Enter the last name : ");
                    String lastName = this.sc.next();
                    System.out.println("Enter the address : ");
                    String address = this.sc.next();
                    System.out.println("Enter the city : ");
                    String city = this.sc.next();
                    System.out.println("Enter the state : ");
                    String state = this.sc.next();
                    System.out.println("Enter the pincode : ");
                    String pinCode = this.sc.next();
                    System.out.println("Enter the mobile no : ");
                    String mobileNo = this.sc.next();
                    System.out.println("Enter Email id : ");
                    String email = this.sc.next();

                    contactList.get(i).setfirstName(firstName);
                    contactList.get(i).setlastName(lastName);
                    contactList.get(i).setAddress(address);
                    contactList.get(i).setCity(city);
                    contactList.get(i).setState(state);
                    contactList.get(i).setPinCode(pinCode);
                    contactList.get(i).setMobileNo(mobileNo);
                    contactList.get(i).setEmail(email);

                    System.out.println();
                    System.out.println(contactList.get(i));
                    System.out.println("Contact edited successfully");
                    System.out.println();

                } else {
                    System.out.println("Invalid first name");
                    System.out.println("Please Enter valid first name");
                    System.out.println();
                }
            }
        }
    }

    // To delete certain contact from address book
    public void deleteContact() {
        System.out.println("Enter original first name for verification:");
        String deleteName = sc.next();

        if (contactList.isEmpty()) {
            System.out.println("Contact list is empty");
        } else {
            for (int i = 0; i < contactList.size(); i++) {
                String name = contactList.get(i).getfirstName();
                if (deleteName.equalsIgnoreCase(name)) {
                    contactList.remove(i);
                    System.out.println("Contact deleted successfully");
                    System.out.println();
                    System.out.println("Updated Contact list : ");
                    System.out.println(contactList);
                } else {
                    System.out.println("Invalid first name");
                    System.out.println("Please Enter valid first name");
                }
            }
        }
    }
}
