package com.addressbooksystem;
import java.util.Scanner;
import java.io.Console;

public class AddressBook {
    public static void main(String[] args){
        System.out.println("Welcome to Address Book System.");
        personDetail();
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
}
