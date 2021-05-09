package com.userregistration;

import java.util.Scanner;
/**
 * @description create class for Defining the User Registration program
 *
 */
public class UserRegistration {
    //constant
    private static final Scanner sc = new Scanner(System.in);
    /**
     * @description create method for name Validation
     *
     */
    private void nameValidation () {
        String name = sc.nextLine();
        String regex = "^[A-Z][a-zA-Z]{3,}$";   //Regex Pattern
        //Matching the given name with regular expression
        boolean result = name.matches(regex);
        if (result) { //Verifying whether given name is valid
            System.out.println("Valid Name");
        } else {
            System.out.println("Name Not Valid. Try using Conditions");
        }
    }
    /**
     * @description create method for Email Address
     *
     */
    private void eMailAddress () {
        System.out.println("Enter the Email Address");
        String eMailAddress = sc.nextLine();
        String regex = "^[a-z0-9]+(([.+-_][a-z0-9])?)+(@[a-z0-9]{1})+(.[a-z]{3,4})+((.[a-z]{2})?)$";//Regex Pattern
        //Matching the given eMailAddress with regular expression
        boolean eMail = eMailAddress.matches(regex);
        if (eMail) { //Verifying whether given eMailAddress is valid
            System.out.println("Valid EMail Address");
        } else {
            System.out.println("EMail Address Not Valid. Try using Conditions");
        }
    }
    //Explaining how to Implement the Computation
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        System.out.println("Enter the First Name");
        UserRegistration firstName = new UserRegistration(); //creating firstname object
        firstName.nameValidation();
        System.out.println("Enter the Last Name");
        UserRegistration lastName = new UserRegistration(); //creating lastname object
        lastName.nameValidation();
        UserRegistration eMailAddress = new UserRegistration(); //creating eMailAddress object
        eMailAddress.eMailAddress();
    }
}
