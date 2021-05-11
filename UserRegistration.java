package com.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @description create class for Defining the User Registration program
 *
 */
public class UserRegistration {
    //constant
    private static final Scanner sc = new Scanner(System.in);
    //Regex Patterns
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-zA-Z]{3,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-zA-Z]{3,}$";
    private static final String EMAIL_ADDRESS = "^[a-z0-9]+(([.+-_][a-z0-9])?)+(@[a-z0-9]{1})+(.[a-z]{3,4})+((.[a-z]{2})?)$";
    private static final String MOBILE_FORMAT = "^[1-9]{2} [1-9][0-9]{9}$";
    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@~#$%^&*()]).{8,}$";
    /**
     * @description create method for Validating the FirstName
     */
    public boolean firstNameValidation(String firstName) {
        //Matching the given FirstName with regular expression
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        boolean result = pattern.matcher(firstName).matches();
        if (result) { //Verifying whether given firstName is valid
            System.out.println("Your First Name is Proper And Valid");
            return true;
        } else {
            System.out.println("Your First Name is inValid,Please try again with condition");
            return false;
        }
    }

    /**
     * @description create Method for Validating the LastName
     *
     */
    public boolean lastNameValidation(String lastName) {
        //Matching the given LastName with regular expression
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        boolean result = pattern.matcher(lastName).matches();
        if (result) { //Verifying whether given lastName is valid
            System.out.println("Your Last Name is Proper And Valid");
            return true;
        } else {
            System.out.println("Your Last Name is inValid,Please try again with condition");
            return false;
        }
    }

    /**
     * @description create method for Email Address
     */
    public boolean eMailAddress(String email) {
        //Matching the given eMailAddress with regular expression
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS);
        boolean result = pattern.matcher(email).matches();
        if (result) { //Verifying whether given eMailAddress is valid
            System.out.println("Your Email Address is Proper And Valid");
            return true;
        } else {
            System.out.println("Your Email Address is inValid,please try again with condition");
            return false;
        }
    }

    /**
     * @description create method for Mobile Number
     *
     */
    public boolean mobileFormat (String mobileNumber) {
        //Matching the given Mobile Number with regular expression
        Pattern pattern = Pattern.compile(MOBILE_FORMAT);
        boolean result = pattern.matcher(mobileNumber).matches();
        if (result){  //Verifying whether given Number is valid
            System.out.println("Your Mobile Number is Proper And Valid");
            return true;
        } else {
            System.out.println("Your Mobile Number is inValid,please try again with condition");
            return false;
        }
    }

    /**
     * @description create method for Password
     *
     */
    public boolean password (String password) {
        //Matching the given password with regular expression
        Pattern pattern = Pattern.compile(PASSWORD);
        boolean result = pattern.matcher(password).matches();
        if (result){  //Verifying whether given password is valid
            System.out.println("Your Password is Proper And Valid");
            return true;
        } else {
            System.out.println("Your password is inValid,please try again with condition");
            return false;
        }
    }

    //Explaining how to Implement the Computation
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        System.out.println("Enter the First Name");
        UserRegistration firstName = new UserRegistration(); //creating firstname object
        firstName.firstNameValidation(sc.nextLine());
        System.out.println("Enter the Last Name");
        UserRegistration lastName = new UserRegistration(); //creating lastname object
        lastName.lastNameValidation(sc.nextLine());
        System.out.println("Enter the Email Address");
        UserRegistration eMailAddress = new UserRegistration(); //creating eMailAddress object
        eMailAddress.eMailAddress(sc.nextLine());
        System.out.println("Enter the Mobile Number");
        UserRegistration mobileNumber = new UserRegistration(); //creating mobileNumber object
        mobileNumber.mobileFormat(sc.nextLine());
        System.out.println("Enter the Your Password");
        UserRegistration password = new UserRegistration(); //creating password object
        password.password(sc.nextLine());
    }
}
