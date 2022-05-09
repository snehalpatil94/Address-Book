package com.bridgelabz.addressbookmanagementsystem;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/* *
 * Address book functions
 *
 * @auther : Snehal Patil
 */

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    public Map<String, Contacts> ContactsList = new HashMap<String, Contacts>();
    public static HashMap<String, ArrayList<Contacts>> city = new HashMap<String, ArrayList<Contacts>>();
    public static HashMap<String, ArrayList<Contacts>> state = new HashMap<String, ArrayList<Contacts>>();
    public String addressBookName;
    public boolean isPresent = false;

    // Getter and Setter for Address Book
    public String getAddressBookName() {
        return addressBookName;
    }

    public void setAddressBookName(String addressBookName) {

        this.addressBookName = addressBookName;
    }

    public ArrayList<Contacts> getContacts() {

        return new ArrayList<Contacts>(ContactsList.values());
    }

    /*
     * This method take user choice of operation to perform in Address Book
     */
    public void addressBookMenu() {
        boolean change = false;
        do {
            System.out.println("\n***** Address Book operation menu :***** ");
            System.out.println("1.Add Contacts To Address Book\n2.Edit Existing Contacts\n3.Delete Contacts\n4.Display" +
                    " Address book Contacts list \n5.Sort Address Book Alphabetically \n6.Exit Address book ");
            System.out.println("\nEnter your choice : ");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addContacts();
                    break;
                case "2":
                    editPerson();
                    break;
                case "3":
                    deletePerson();
                    break;
                case "4":
                    displayContents();
                    break;
                case "5":
                    sortAddressBook();
                    break;
                case "6":
                    System.out.println("Thank you for using Address Book ! \nExiting Address Book: " + this.getAddressBookName() + " !");
                    change = true;
                    break;
                default:
                    System.out.println("Please Enter Valid Option");
                    break;
            }
            System.out.println("--------------------------------------------------------------------------------------------------------------");
        } while (!change);
    }

    /*
     *This is checks if contact is already present in Address Book if not the add contact
     */
    public void addContacts() {
        Contacts person = new Contacts();
        Address address = new Address();

        System.out.println("Enter first name: ");
        final String firstName = sc.next();
        ContactsList.entrySet().stream().forEach(new Consumer<Entry<String, Contacts>>() {
            @Override
            public void accept(Entry<String, Contacts> entry) {
                if (entry.getKey().equals(firstName.toLowerCase())) {
                    System.out.println("Contacts already exist.");
                    isPresent = true;
                    return;
                }
            }
        });
        if (isPresent == false) {
            System.out.println("Enter last name : ");
            String lastName = sc.next();
            System.out.println("Enter Mobile number :");
            String mobileNumber = sc.next();
            System.out.println("Enter Email ID: ");
            String email = sc.next();
            System.out.println("Enter city :");
            String city = sc.next();
            System.out.println("Enter state: ");
            String state = sc.next();
            System.out.println("Enter Pin-Code: ");
            String pinCode = sc.next();

            person.setFirstName(firstName);
            person.setLastName(lastName);
            person.setmobileNumber(mobileNumber);
            person.setEmail(email);
            address.setCity(city);
            address.setState(state);
            address.setpinCode(pinCode);
            person.setAddress(address);
            addPersonToCity(person);
            addPersonToState(person);
            ContactsList.put(firstName.toLowerCase(), person);
        }
        System.out.println("Contact added successfully !");
    }

    /*
     *  This Method Display contacts of Address book
     */
    public void displayContents() {
        System.out.println("***** Contents of the Address Book : " + this.getAddressBookName() + " ******");
        for (String eachContacts : ContactsList.keySet()) {
            Contacts Contacts = ContactsList.get(eachContacts);
            System.out.println(Contacts);
        }
    }

    /*
     *  This Method First verifies if Contact exist or not if exist then perform user choice of edition in contact
     */
    public void editPerson() {
        Contacts person = new Contacts();
        System.out.println("Enter First name for Verification : ");
        String firstName = sc.next();
        if (ContactsList.containsKey(firstName)) {
            person = ContactsList.get(firstName);
            Address address = person.getAddress();
            System.out.println("Choose you want to change : ");
            System.out.println("1.First Name\n2.Last Name\n3.Phone Number\n4.Email\n5.City\n6.State\n7.pinCodeCode");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter the correct First Name :");
                    String newFirstName = sc.next();
                    person.setFirstName(newFirstName);
                    break;
                case 2:
                    System.out.println("Enter the correct Last Name :");
                    String lastName = sc.next();
                    person.setLastName(lastName);
                    break;
                case 3:
                    System.out.println("Enter the correct Phone Number :");
                    String mobileNumber = sc.next();
                    person.setmobileNumber(mobileNumber);
                    break;
                case 4:
                    System.out.println("Enter the correct Email Address :");
                    String email = sc.next();
                    person.setEmail(email);
                    break;
                case 5:
                    System.out.println("Enter the correct City :");
                    String city = sc.next();
                    address.setCity(city);
                    break;
                case 6:
                    System.out.println("Enter the correct State :");
                    String state = sc.next();
                    address.setState(state);
                    break;
                case 7:
                    System.out.println("Enter the correct pinCode :");
                    String pinCode = sc.next();
                    address.setpinCode(pinCode);
                    break;
            }
            System.out.println("Contact Edited Successfully !");
        } else {
            System.out.println(" Contact does not exist.");
        }
    }

    /*
     * This Method First verifies if Contact exist or not if exist then delete it.
     */
    public void deletePerson() {
        System.out.println("Enter first name of person to delete : ");
        String firstName = sc.next();
        if (ContactsList.containsKey(firstName)) {
            ContactsList.remove(firstName);
            System.out.println("Contact Successfully deleted !");
        } else {
            System.out.println("Contacts not found.");
        }
    }

    /*
     *  This Method to Add Contact According to city
     */
    public void addPersonToCity(Contacts Contacts) {
        if (city.containsKey(Contacts.getAddress().getCity())) {
            city.get(Contacts.getAddress().getCity()).add(Contacts);
        } else {
            ArrayList<Contacts> cityList = new ArrayList<Contacts>();
            cityList.add(Contacts);
            city.put(Contacts.getAddress().getCity(), cityList);
        }
    }

    /*
     * This Method to Add Contact according to State
     */
    public void addPersonToState(Contacts Contacts) {
        if (state.containsKey(Contacts.getAddress().getState())) {
            state.get(Contacts.getAddress().getState()).add(Contacts);
        } else {
            ArrayList<Contacts> stateList = new ArrayList<Contacts>();
            stateList.add(Contacts);
            state.put(Contacts.getAddress().getState(), stateList);
        }
    }

    /*
     * This method to sort alphabetically
     */
    public void sortAddressBook() {
        List<Contacts> sortedContactList;
        sortedContactList = ContactsList.values().stream().sorted((firstPerson, secondPerson) -> firstPerson.getFirstName().compareTo(secondPerson.getFirstName())).collect(Collectors.toList());
        printSortedList(sortedContactList);
    }

    /*
     *This method is tp print sorted Address Book
     */
    public void printSortedList(List<Contacts> sortedContactList) {
        System.out.println("\n****** Sorted address book " + this.getAddressBookName() + " *******");
        Iterator iterator = sortedContactList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println();
        }
    }
}
