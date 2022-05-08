package com.bridgelabz.addressbookmanagementsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/* *
 * Address book functions
 *
 * @auther : Snehal Patil
 */

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<Contacts> contactList = new ArrayList<Contacts>();
    HashMap<String, Contacts> contactService = new HashMap<>();

    // Method to add contacts in address book
    public void addContact() {
        boolean found = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String firstName = scanner.next();

        //checked duplicate name in the address book
        for (int j = 0; j < contactList.size(); j++) {

            List<String> names = contactList.stream().map(Contacts::getFirstName).collect(Collectors.toList());

            for (int k = 0; k < names.size(); k++) {
                if (names.get(j).equals(firstName)) {
                    found = true;
                    break;
                }
            }
        }
        if (found == true) {
            System.out.println("Person Name is already in the address book!");
        } else {
            //System.out.println("Enter the first name : ");
            //firstName = sc.next();
            System.out.println("Enter the last name : ");
            String lastName = sc.next();
            System.out.println("Enter the phone no : ");
            String mobileNumber = sc.next();
            System.out.println("Enter the city : ");
            String city = sc.next();
            System.out.println("Enter the state : ");
            String state = sc.next();
            System.out.println("Enter the Pin-Code : ");
            String pincode = sc.next();
            System.out.println("Enter Email id : ");
            String email = sc.next();

            contactList.add(new Contacts(firstName, lastName, mobileNumber, city, state, pincode, email));
            System.out.println(contactList);
            System.out.println("Contact added successfully");
        }
    }

    // Method to display contacts from address book
    public void displayContact() {
        System.out.println("Number of contacts : " + contactList.size());
        if (contactList.isEmpty()) {
            System.out.println("There is no contact");
        } else {
            for (int i = 0; i < contactList.size(); i++) {
                System.out.println(contactList.get(i));
            }
        }
    }

    // Method To edit contacts
    public void editContact() {
        System.out.println("Please Enter original first name for verification : ");
        String editName = sc.next();
        if (contactList.isEmpty()) {
            System.out.println("Contact list is empty");
        } else {
            for (int i = 0; i < contactList.size(); i++) {
                String name = contactList.get(i).getFirstName();
                if (editName.equalsIgnoreCase(name)) {
                    System.out.println("Enter the first name : ");
                    String firstName = sc.next();
                    System.out.println("Enter the last name : ");
                    String lastName = sc.next();
                    System.out.println("Enter the phone no : ");
                    String mobileNumber = sc.next();
                    System.out.println("Enter the city : ");
                    String city = sc.next();
                    System.out.println("Enter the state : ");
                    String state = sc.next();
                    System.out.println("Enter the pincode : ");
                    String pinCode = sc.next();
                    System.out.println("Enter Email id : ");
                    String email = sc.next();
                    contactList.get(i).setFirstName(firstName);
                    contactList.get(i).setLastName(lastName);
                    contactList.get(i).setmobileNumber(mobileNumber);
                    contactList.get(i).setCity(city);
                    contactList.get(i).setState(state);
                    contactList.get(i).setPinCode(pinCode);
                    contactList.get(i).setEmail(email);
                } else {
                    System.out.println("Invalid first name");
                    System.out.println("Please Enter valid first name");
                }
            }
            System.out.println(contactList);
            System.out.println("Contact edited successfully");
        }
    }

    // Method to delete contacts from address book
    public void deleteContact() {
        System.out.println("Enter original first name for verification:");
        String deleteName = sc.next();

        if (contactList.isEmpty()) {
            System.out.println("Contact list is empty");
        } else {
            for (int i = 0; i < contactList.size(); i++) {
                String name = contactList.get(i).getFirstName();
                if (deleteName.equalsIgnoreCase(name)) {
                    contactList.remove(i);
                    System.out.println("Contact deleted successfully");
                } else {
                    System.out.println("Invalid first name");
                    System.out.println("Please Enter valid first name");
                }
            }
            System.out.println(contactList);
        }
    }

    // Function to take user's choice of operation
    public void addressBookMenu(AddressBook Addressbook) {
        System.out.println("\nMenu of Address Book : ");
        boolean check = false;
        do {
            System.out.println("Enter your choice \n 1. Add contact \n 2. Edit contact \n 3. Delete contact \n 4. Display \n 5. Exit");
            String option = sc.next();
            switch (option) {
                case "1":
                    addContact();
                    break;
                case "2":
                    editContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    displayContact();
                    break;
                case "5":
                    System.out.println("Thank You !!");
                    check = true;
                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }
            System.out.println("---------------------------------------------------------------------");
        } while (!check);
    }
}