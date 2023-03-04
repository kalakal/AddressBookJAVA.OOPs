package com.bridgelab.addressbook;

import java.util.Scanner;

class AddressBookMain {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to Address Book Program");

            AddAddressBook obj=new AddAddressBook();
            int option;
            boolean condition=true;

            while(condition) {
                System.out.println("1.ADD CONTACT \n2.DISPLAY CONTACT \n3.EDIT CONTACT \n4.DELETE CONTACT");
                System.out.println("Enter the Option Number");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        obj.addContact();
                        break;
                    case 2:
                        obj.display();
                        break;
                    case 3:
                        obj.editContacts();
                        break;
                    case 4:
                        obj.deleteContact();
                        break;
                    default:
                        condition=false;
                        break;
                }

            }
        }

    }

}
