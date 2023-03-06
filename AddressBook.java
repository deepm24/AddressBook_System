package org.example;

import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {

        System.out.println("** Welcome To AddressBook System **");
        Scanner scan = new Scanner(System.in);

        InsertInformation insertInfo = new InsertInformation();

        int choice =1;
       while (choice != 0) {
            System.out.println("Enter your choice");
            System.out.println("1 : Insert the Contacts");
            System.out.println("2 : Display all address in contact book");
            System.out.println("9 : Terminate the application");

            choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("-*- Enter person Details -*-");
                    String pos =scan.nextLine();

                    System.out.println("Enter the First name");
                    String firstName = scan.nextLine();

                    System.out.println("Enter the Last name");
                    String lastName = scan.nextLine();

                    System.out.println("Enter the Address");
                    String address = scan.nextLine();

                    System.out.println("Enter the City");
                    String city = scan.nextLine();

                    System.out.println("Enter the State");
                    String state = scan.nextLine();

                    System.out.println("Enter the Email");
                    String email = scan.nextLine();

                    System.out.println("Enter the zipCode");
                    String zip = scan.nextLine();

                    System.out.println("Enter the phone Number");
                    String phoneNumber = scan.nextLine();
                    insertInfo.insertData(firstName, lastName, address, city, state, email, zip, phoneNumber);
                    break;

                case 2:
                    insertInfo.display();
                    break;

                case 9:
                    choice = 0;
                    System.out.println("----------------------Thank You For Using This AddressBook System---------------------");
                    break;

                default:
                    System.out.println("-------Invalid Choice-------");

            }
        }


    }
}

