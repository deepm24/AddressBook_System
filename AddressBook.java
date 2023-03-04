package org.example;
import java.util.Scanner;
public class AddressBook {
    public static void main(String[] args) {
        System.out.println("** Welcome To AddressBook System **");

        System.out.println("--Enter person Details--");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First name");
        String firstName = sc.nextLine();

        System.out.println("Enter the Last name");
        String lastName = sc.nextLine();

        System.out.println("Enter the Address");
        String address = sc.nextLine();

        System.out.println("Enter the City");
        String city = sc.nextLine();

        System.out.println("Enter the State");
        String state = sc.nextLine();

        System.out.println("Enter the Email");
        String email = sc.nextLine();

        System.out.println("Enter the zipCode");
        String zip = sc.nextLine();

        System.out.println("Enter the phone Number");
        String phoneNumber = sc.nextLine();

        System.out.println("Firstname: " + firstName);
        System.out.println("Lastname: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Email: " + email);
        System.out.println("Zipcode: " + zip);
        System.out.println("phoneNumber: " + phoneNumber);
    }

    }

