package com.bridgelabz.addressbookmanagementsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
/* *
 * Address book Directory functions
 *
 * @auther : Snehal Patil
 */

public class AddressBookDirectory {
    public AddressBook addressBook;
    Scanner sc = new Scanner(System.in);
    Map<String, AddressBook> addressBookDirectory = new HashMap<String, AddressBook>();

    /*
     * Creating switch case to take user choice of operation
     */
    public void directoryMenu() {
        boolean check = false;
        String choice;
        do {
            System.out.println("\n****** Directory option menu :****** ");
            System.out.println(
                    "1.Add an Address Book \n2.Edit Existing Address Book \n3.Display Address book Directory \n4.Search " +
                            "Person By Region \n5.View People By Region \n6.Exit Address book System");
            System.out.println("\nPlease Select the Operation Number : ");
            choice = sc.next();
            switch (choice) {
                case "1":
                    addAddressBook();
                    break;
                case "2":
                    editAddressBook();
                    break;
                case "3":
                    displayDirectoryContents();
                    break;
                case "4":
                    System.out.println("Enter \n1.Search By City\n2.Search By State");
                    int searchChoice = sc.nextInt();
                    if (searchChoice == 1)
                        searchByCity();
                    else
                        searchByState();
                    break;
                case "5":
                System.out.println("Enter \n1.Display By City\n2.Display By State");
                int displayChoice = sc.nextInt();
                if(displayChoice==1)
                    displayPeopleByRegion(AddressBook.city);
                else
                    displayPeopleByRegion(AddressBook.state);
                break;
                case "6":
                    System.out.println("Thank You for using Address Book Directory System !");
                    check = true;
                    break;
                default:
                    System.out.println("Please Enter Valid Option !");
                    break;
            }
            System.out.println("--------------------------------------------------------------------------------------------------------------");
        } while (!check);
    }

    /*
     * Adding new address book in Directory .First checks book is already present in Directory
     * if not then add in Directory
     */
    public void addAddressBook() {

        System.out.println("Enter the name of the Address Book you want to add : ");
        String bookNameToAdd = sc.next();

        if (addressBookDirectory.containsKey(bookNameToAdd)) {
            System.out.println("This Address Book Already Exists");
        } else {
            AddressBook addressBook = new AddressBook();
            addressBook.setAddressBookName(bookNameToAdd);
            addressBookDirectory.put(bookNameToAdd, addressBook);
            System.out.println("Address book added successfully.");
            addressBook.addressBookMenu();
        }
    }

    /*
     * In this method.. calling existing address book and editing them.
     */
    public void editAddressBook() {

        System.out.println("Enter the Name of the Address Book which you want to edit:");
        String addressBookToEdit = sc.next();

        if (addressBookDirectory.containsKey(addressBookToEdit)) {
            addressBook = addressBookDirectory.get(addressBookToEdit);
            addressBook.addressBookMenu();
        } else {
            System.out.println("Book Does Not Exist");
        }
    }

    /*
     * This method to searching person by his/her city name
     */
    public void searchByCity() {

        System.out.println("Enter the name of the City where the Person resides : ");
        String cityName = sc.next();
        System.out.println("Enter the name of the Person : ");
        String personName = sc.next();

        for (AddressBook addressBook : addressBookDirectory.values()) {
            ArrayList<Contacts> ContactsList = addressBook.getContacts();
            ContactsList.stream()
                    .filter(person -> person.getFirstName().equals(personName)
                            && person.getAddress().getCity().equals(cityName))
                    .forEach(person -> System.out.println(person));
        }
    }

    /*
     * This method to searching person by his/her state name
     */
    public void searchByState() {

        System.out.println("Enter the name of the State where the Person resides : ");
        String stateName = sc.next();
        System.out.println("Enter the name of the Person : ");
        String personName = sc.next();

        for (AddressBook addressBook : addressBookDirectory.values()) {
            ArrayList<Contacts> ContactsList = ((AddressBook) addressBook).getContacts();
            ContactsList.stream()
                    .filter(person -> person.getFirstName().equals(personName)
                            && person.getAddress().getState().equals(stateName))
                    .forEach(person -> System.out.println(person));
        }
    }

    /*
     * Method to Displaying person by his/her city or state
     */
    public void displayPeopleByRegion(HashMap<String, ArrayList<Contacts>> listToDisplay) {

        System.out.println("Enter the name of the region :");
        String regionName = sc.next();

        listToDisplay.values().stream()
                .map(region -> region.stream()
                        .filter(person -> person.getAddress().getState().equals(regionName)
                                || person.getAddress().getCity().equals(regionName)))
                .forEach(person -> person.forEach(personDetails -> System.out.println(personDetails)));
    }


    /*
     * This method is to display address Book present in Directory
     */
    public void displayDirectoryContents() {

        System.out.println("***** Contents of the Address Book Directory *****");
        for (String eachBookName : addressBookDirectory.keySet()) {
            System.out.println(eachBookName);
        }
    }
}