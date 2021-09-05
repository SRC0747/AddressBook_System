package com.addressbooksystem;
import java.util.Scanner;
import java.io.Console;
import java.util.*;
import java.util.stream.Collectors;

class MultipleDetail{
    String name,address,city,state,phno,email;
    public MultipleDetail(String name, String address, String city, String state, String phno, String email) {
        this.name = name;
        this.address = address;
        this.city = city ;
        this.state = state;
        this.phno = phno;
        this.email = email;
    }
}
public class AddressBook {
    public static void main(String[] args){
        System.out.println("Welcome to Address Book System.");
        personDetail();
        contactNewPerson();
        editContactDetail();
        clearConsole();
        multiplePersonDetail();
        multiDetailAddressBook();
        System.out.println(equals(AddressBook obj));

        List<MultipleDetail> details = new ArrayList<MultipleDetail>();
        //Adding Details
        details.add(new MultipleDetail("Rakesh Jaiswal","Amhastreet","Kolkata","WestBengal","9632457896","rjsrc@gmail.com"));
        details.add(new MultipleDetail("Abhishek""Baguihati","Kolkata","WestBengal","7044589936","abhi37@gmail.com"));
        details.add(new MultipleDetail("Sampriti","Belepole","Howrah","WestBengal","7044585321","srcsrk0747@gmail.com"));
        details.stream().filter(details -> details.city == "Kolkata" && details -> details.state == "WestBengal").forEach(details -> System.out.println(details.name));

        //Dictionary of City and Person.
        HashTable <City,Person> mydict_1 = new  Hashtable<City,Person>();
        //put method() to print output.
        mydict_1.put("Kolkata","Rakesh");
        mydict_1.put("Howrah","Sampriti");
        //get method() to take input.
        System.out.println("\nPerson at Kolkata is:"+mydict_1.get("Kolkata"));
        System.out.println("\nPerson at Howrah is:"+mydict_1.get("Howrah"));


        //Dictionary of State and Person.
        HashTable <State,Person> mydict_1 = new  Hashtable<State, Person>();
        //put method() to print output.
        mydict_1.put("West Bengal","Rakesh");
        mydict_1.put(Mumbai","Sampriti");
                //get method() to take input.
                System.out.println("\n Person at West Bengal is:"+mydict_1.get("West Bengal"));
        System.out.println("\n Person at Mumbai is:"+mydict_1.get("Mumbai"));

        //Using Java Stream to count City to get person's contact.
        long count = Stream.of("Kolkata","Howrah")
                .collect(Collectors.counting());
        System.out.printf("There are %d persons in the stream %n", count);
        //Using Java Stream to count State to get person's contact.
        long count = Stream.of("WestBengal","Mumbai")
                .collect(Collectors.counting());
        System.out.printf("There are %d persons in the stream %n", count);

        //Sort the Persons name in alphabetic order using console.
        // Unsorted string array
        String[] strArray = { "Rakesh","Abhishek","Sampriti" };

        // Sorting the strings
        strArray = Stream.of(strArray)
                .sorted()
                .toArray(String[]::new);
        // Sorted array
        System.out.println("Sorted : " + Arrays.toString(strArray));

        String[] name = {"Rakesh", "Sampriti", "Abhishek"}.toCharArray();
        String[] city = {"Kolkata", "Howrah"}.toCharArray();
        SortByPattern(name, city);
        System.out.println(String.valueOf(name));
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
    public static void editContactDetail()
    {
        System.out.println("After Editing the Existed Contact The list of details are given below:");
        contactNewPerson();
    }
    public static void clearConsole()
    {
        try
        {
            final String name_person = System.getProperty("name_person.name");
            if (name_person.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
        }
        catch (final Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void multiplePersonDetail()
    {
        List<String> langs = new ArrayList<>();

        langs.add("Samppriti");
        langs.add("Santragachi Station");
        langs.add("kolkata");
        langs.add("West Bengal");
        langs.add("96748523145");
        langs.add("sampritirc@hmail.com");

        for (String lang : langs) {

            System.out.printf("%s ", lang);
        }

        System.out.println();
    }
    public static void multiDetailAddressBook()
    {
        // creating a My HashTable Dictionary
        Hashtable<String, String> my_dict = new Hashtable<String, String>();

        // Using a few dictionary Class methods
        // using put method
        my_dict.put("01", "Rakesh Jaiswal");
        my_dict.put("02", "Amhastreet");
        my_dict.put("03", "Kolkata");
        my_dict.put("04", "West Bengal");
        my_dict.put("05", "7859632145");
        my_dict.put("06", "srcrj0747@gmail.com");


        // using get() method
        System.out.println("\nValue at key = 01 : " + my_dict.get("01"));
        System.out.println("Value at key = 02 : " + my_dict.get("02"));
        System.out.println("Value at key = 03 : " + my_dict.get("03"));
        System.out.println("Value at key = 04 : " + my_dict.get("04"));
        System.out.println("Value at key = 05 : " + my_dict.get("05"));
        System.out.println("Value at key = 06 : " + my_dict.get("06"));


        System.out.println("\nSize of my_dict : " + my_dict.size());
    }
    @Override
    public boolean equals(AddressBook obj) {
        boolean result;
        String name,address,city,state,phno,email;
        if((obj == null) || (getClass() != obj.getClass())){
            result = false;
        } // end if
        else{
            AddressBook otherdetail = (AddressBook) obj;
            result = name.equals(obj.name) &&  address.equals(obj.address) && city.equals(obj.city) &&  state.equals(obj.state) && phno.equals(obj.phno) && email.equals(obj.email);
        } // end else
        return super.equals(obj);
    }

    //Displaying Person's nName alphabetically Sorting Cities.
    public static void SortByPattern(String name, String city) {
        String[] name = {"Rakesh", "Sampriti", "Abhishek"};
        String[] city = {"Kolkata", "Howrah"};
        static int MAX_CHAR = 26;

        // Sort str according to the order defined by pattern.
        static void sortByPattern ( char[] name, char[] city)
        {
            // Create a count array stor
            // count of characters in str.
            int count[] = new int[MAX_CHAR];

            // Count number of occurrences of
            // each character in str.
            for (int i = 0; i < name.length; i++) {
                count[name[i] - 'a']++;
            }
            // Traverse the pattern and print every characters
            // same number of times as it appears in str. This
            // loop takes O(m + n) time where m is length of
            // pattern and n is length of str.
            int index = 0;
            for (int i = 0; i < city.length; i++) {
                for (int j = 0; j < count[city[i] - 'a']; j++) {
                    name[index++] = city[i];
                }
            }
        }
    }
