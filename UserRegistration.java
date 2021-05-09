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
            System.out.println("Your EMail Address is inValid. Try using Conditions");
        }
    }
    /**
     * @description create method for Mobile Number
     *
     */
    private void mobileFormat () {
        System.out.println("Enter the Mobile Number");
        String mobileNumber = sc.nextLine();
        String regex = "^[1-9]{2} [1-9][0-9]{9}$";   //Regex Pattern
        //Matching the given Mobile Number with regular expression
        boolean mobile = mobileNumber.matches(regex);
        if (mobile){  //Verifying whether given Number is valid
            System.out.println("Valid Number");
        } else {
            System.out.println("Your Mobile Number is inValid,please try again with condition");
        }
    }
    /**
     * @description create method for Password
     *
     */
    private void password () {
        System.out.println("Enter the Your Password");
        String password = sc.nextLine();
        String regex = "^[A-Z0-9a-z]{8,}$";   //Regex Pattern
        //Matching the given password with regular expression
        boolean passcode = password.matches(regex);
        if (passcode){  //Verifying whether given Password is valid
            System.out.println("Valid Password");
        } else {
            System.out.println("Your Password is inValid,please try again with condition");
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
        UserRegistration mobileNumber = new UserRegistration(); //creating mobileNumber object
        mobileNumber.mobileFormat();
        UserRegistration password = new UserRegistration(); //creating password object
        password.password();
    }
}
