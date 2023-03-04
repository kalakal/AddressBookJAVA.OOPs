package com.bridgelab.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddAddressBook {
    Scanner scanner = new Scanner(System.in);
    Contacts contact=new Contacts();
    ArrayList<Contacts> bookList = new ArrayList<Contacts>();
    public void addContact() {
        System.out.println("Enter the First name");
        String firstName = scanner.nextLine();

        System.out.println("Enter the Last name");
        String lastName = scanner.nextLine();
        System.out.println("Enter the Address");
        String address = scanner.nextLine();

        System.out.println("Enter the City name");
        String city = scanner.nextLine();

        System.out.println("Enter the State");
        String state = scanner.nextLine();

        System.out.println("Enter the Pin");
        String zip = scanner.nextLine();

        System.out.println("Enter the Mobile Number");
        String mobileNumber = scanner.nextLine();

        System.out.println("Enter the Email Id");
        String email = scanner.nextLine();

        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setMobileNumber(mobileNumber);
        contact.setEmail(email);

        bookList.add(contact);
    }

    public void display() {System.out.println("Enter first name to diplay the contact details");
        String personName = scanner.next();

        if (bookList.size() > 0) {
            for (int i = 0; i < bookList.size(); i++) {
                if (bookList.get(i).getFirstName().equalsIgnoreCase(personName)) {

                    System.out.println("Name : " + bookList.get(i).getFirstName() + " " + bookList.get(i).getLastName());
                    System.out.println("Address : " + bookList.get(i).getAddress());
                    System.out.println("City and State : " + bookList.get(i).getCity() + ", " + bookList.get(i).getState());
                    System.out.println("Zip : " + bookList.get(i).getZip());
                    System.out.println("Phone Number : " + bookList.get(i).getMobileNumber());
                    System.out.println("Mail id : " + bookList.get(i).getEmail() + "\n");
                    break;

                }
            }
        }
    }

}

