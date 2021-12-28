package com.bridgelabz.csvAndJson;

/**
 * Address Book System!
 *
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddressBookSystem {
public static void main(String[] args) {
	System.out.println("Welcome to Address Book Program");
	createContact();
}
public static List<Contact> createContact(){
	List<Contact> contacts = new ArrayList<Contact>();
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter First Name: ");
    String firstName = scanner.next();
    System.out.println("Enter Last Name: ");
    String lastName = scanner.next();
    System.out.println("Enter address:");
    String address=scanner.next();
    System.out.println("Enter city:");
    String city=scanner.next();
    System.out.println("Enter state:");
    String state=scanner.next();
    System.out.println("Enter zip:");
    String zip=scanner.next();
    System.out.println("Enter phone Number:");
    String phoneNumber=scanner.next();
    System.out.println("Enter email:");
    String email=scanner.next();
    contacts.add(new Contact(firstName, lastName, address, city,state,zip,phoneNumber,email));
    System.out.println(contacts);
    
//    // Printing elements one by one
//    for (int i = 0; i < contacts.size(); i++)
//        System.out.print(contacts.get(i) + " ");
return contacts;
}

}