package com.bridgelabz.addressbookmanagementsystem;

/**
 * Address book of functions
 *
 * @author : Snehal Patil
 */

import java.util.Scanner;

public class AddressBook {
    Contacts contact;
    Scanner sc = new Scanner(System.in);

    /*
     * To take choice of operation from user to perform in address book
     */
    public void option() {
        Scanner sc = new Scanner(System.in);
        int option;
        boolean check = false;
        do {
            System.out.println("Press\n1. To add a new contact \n2. To Display contact \n3. To Edit \n4. To Exit");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    displayContact();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    check = true;
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }
            System.out.println("------------------------------------------------------------------------------");
        }
        while (!check);
    }

    /*
     * Taking input from console to add contact in address book
     */
    public void addContact() {
        contact = new Contacts();

        System.out.println("Enter the first name : ");
        String firstName = this.sc.nextLine();
        System.out.println("Enter the last name : ");
        String lastName = this.sc.nextLine();
        System.out.println("Enter the address : ");
        String address = this.sc.nextLine();
        System.out.println("Enter the city : ");
        String city = this.sc.nextLine();
        System.out.println("Enter the state : ");
        String state = this.sc.nextLine();
        System.out.println("Enter the pincode : ");
        String pinCode = this.sc.nextLine();
        System.out.println("Enter the mobile no : ");
        String mobileNo = this.sc.nextLine();
        System.out.println("Enter Email id : ");
        String email = this.sc.nextLine();

        contact.setfirstName(firstName);
        contact.setlastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setPinCode(pinCode);
        contact.setMobileNo(mobileNo);
        contact.setEmail(email);
        System.out.println(contact);
        System.out.println();
    }

    /*
     * Displaying added contact of address book
     */
    public void displayContact() {
        String firstName1 = contact.getfirstName();
        System.out.println("First Name : " + firstName1);
        String lastName1 = contact.getlastName();
        System.out.println("Last Name : " + lastName1);
        String address1 = contact.getAddress();
        System.out.println("Address : " + address1);
        String city1 = contact.getCity();
        System.out.println("City : " + city1);
        String state1 = contact.getState();
        System.out.println("State : " + state1);
        String pinCode1 = contact.getPinCode();
        System.out.println("Pin Code : " + pinCode1);
        String mobileNo1 = contact.getMobileNo();
        System.out.println("Mobile No : " + mobileNo1);
        String email1 = contact.getEmail();
        System.out.println("Email id : " + email1);
        System.out.println();
    }

    /*
     * Method to edit contacts of address book
     */
    public void editContact() {
        System.out.println("Please Enter original first name to edit : ");
        String editName = sc.nextLine();

        if (editName.equalsIgnoreCase(contact.getfirstName())) {
            addContact();
        } else {
            System.out.println("Invalid first name");
            System.out.println("Please Enter valid first name");
            System.out.println();
            editContact();
        }
    }
}