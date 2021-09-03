package com.addressbooksystem;
import java.util.Scanner;
import java.io.Console;

public class AddressBook {
    public static void main(String[] args){
        System.out.println("Welcome to Address Book System.");
        personDetail();
        contactNewPerson();
    }
    public static void personDetail()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the person:");
        System.out.println("Enter the name of the address:");
        System.out.println("Enter the name of the City:");
        System.out.println("Enter the name of the State:");
        System.out.println("Enter the name of the Contact Number:");
        System.out.println("Enter the name of the email id:");
        String name = sc.nextLine();
        System.out.println("Name of the person is:"+name);
        String address = sc.nextLine();
        System.out.println("Address of the person is:"+address);
        String city = sc.nextLine();
        System.out.println("City of the person is:"+city);
        String state = sc.nextLine();
        System.out.println("State of the person is:"+state);
        int ph_no=sc.nextInt();
        System.out.println("Phone number is:"+ph_no);
        String email_id = sc.nextLine();
        System.out.println("Email id is:"+email_id);
    }
    public static void contactNewPerson()
    {
        Scanner sc=new Scanner(System.in);
        Console c=System.console();
        System.out.println("Enter your name: ");
        String n=c.readLine();
        System.out.println("Welcome "+n);
        System.out.println("Enter your address: ");
        String address=c.readLine();
        System.out.println("Your address is: "+address);
        System.out.println("Enter your state: ");
        String state=c.readLine();
        System.out.println("Your State is: "+state);
        System.out.println("Enter your city: ");
        String city=c.readLine();
        System.out.println("Your city is: "+city);
        int ph_no=sc.nextInt();
        System.out.println("Contact no: is:"+ph_no);
        System.out.println("Enter your email:");
        String email=c.readLine();
        System.out.println("Your email is: "+email);
    }
}
