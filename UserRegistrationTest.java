package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description create class for Testing the User Registration program
 *
 */
public class UserRegistrationTest {
    UserRegistration validation = new UserRegistration();  //Creating Object for User Registration Test

    /**
     * @description create Method for Testing the Valid FirstName
     *
     */
    @Test
    public void givenFirstName_WhenValid_ShouldReturnHappy () {
        boolean result = validation.firstNameValidation("AVESh");
        Assertions.assertTrue(result);           //verifying the Result Using AssertTrue
        boolean result1 = validation.firstNameValidation("SRefR");
        Assertions.assertTrue(result1);
        boolean result2 = validation.firstNameValidation("SriRam");
        Assertions.assertTrue(result2);
    }

    /**
     * @description create Method for Testing the Invalid FirstName
     *
     */
    @Test
    public void givenFirstName_WhenNotValid_ShouldReturnSad () {
        boolean result = validation.firstNameValidation("rEsHTed");
        Assertions.assertFalse(result);          //verifying the Result Using AssertFalse
        boolean result1 = validation.firstNameValidation("saTya");
        Assertions.assertFalse(result1);
        boolean result2 = validation.firstNameValidation("lakSHmI");
        Assertions.assertFalse(result2);
    }

    /**
     * @description create Method for Testing the Valid LastName
     *
     */
    @Test
    public void givenLastName_WhenValid_ShouldReturnHappy () {
        boolean result = validation.lastNameValidation("KriSh");
        Assertions.assertTrue(result);           //verifying the Result Using AssertTrue
        boolean result1 = validation.lastNameValidation("BaLAR");
        Assertions.assertTrue(result1);
        boolean result2 = validation.lastNameValidation("GaNaPathI");
        Assertions.assertTrue(result2);
    }

    /**
     * @description create Method for Testing the Valid LastName
     *
     */
    @Test
    public void givenLastName_WhenNotValid_ShouldReturnSad () {
        boolean result = validation.lastNameValidation("kRiSh");
        Assertions.assertFalse(result);          //verifying the Result Using AssertFalse
        boolean result1 = validation.lastNameValidation("rAmesH");
        Assertions.assertFalse(result1);
        boolean result2 = validation.lastNameValidation("soWMitH");
        Assertions.assertFalse(result2);
    }

    /**
     * @description create Method for Testing the Valid EmailAddress
     *
     */
    @Test
    public void givenEmailAddress_WhenValid_ShouldReturnHappy () {
        boolean result = validation.eMailAddress("maddimsetti143@gmail.com");
        Assertions.assertTrue(result);           //verifying the Result Using AssertTrue
        boolean result1 = validation.eMailAddress("abc@gmail.com.in");
        Assertions.assertTrue(result1);
        boolean result2 = validation.eMailAddress("krishna917@gmail.com");
        Assertions.assertTrue(result2);
    }

    /**
     * @description create Method for Testing the Invalid EmailAddress
     *
     */
    @Test
    public void givenEmailAddress_WhenNotValid_ShouldReturnSad () {
        boolean result = validation.eMailAddress("Maddimsetti143@gmail.com");
        Assertions.assertFalse(result);          //verifying the Result Using AssertFalse
        boolean result1 = validation.eMailAddress("#abc@gmail.com.in");
        Assertions.assertFalse(result1);
        boolean result2 = validation.eMailAddress("abc&def@gmail.com.in");
        Assertions.assertFalse(result2);
    }

    /**
     * @description create Method for Testing the Valid MobileNumber
     *
     */
    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnHappy () {
        boolean result = validation.mobileFormat ("91 9667914789");
        Assertions.assertTrue(result);           //verifying the Result Using AssertTrue
        boolean result1 = validation.mobileFormat("91 9617648433");
        Assertions.assertTrue(result1);
        boolean result2 = validation.mobileFormat("51 9843566100");
        Assertions.assertTrue(result2);
    }

    /**
     * @description create Method for Testing the Invalid MobileNumber
     *
     */
    @Test
    public void givenMobileNumber_WhenNotValid_ShouldReturnSad () {
        boolean result = validation.mobileFormat("91 984685248");
        Assertions.assertFalse(result);          //verifying the Result Using AssertFalse
        boolean result1 = validation.mobileFormat("98 45758234609");
        Assertions.assertFalse(result1);
        boolean result2 = validation.mobileFormat("11 457582349");
        Assertions.assertFalse(result2);
    }

    /**
     * @description create Method for Testing the Valid Password
     *
     */
    @Test
    public void givenPassword_WhenValid_ShouldReturnHappy () {
        boolean result = validation.password("P@ssWorD123");
        Assertions.assertTrue(result);           //verifying the Result Using AssertTrue
        boolean result1 = validation.password("PassW@rD32");
        Assertions.assertTrue(result1);
        boolean result2 = validation.password("SowM!tH32");
        Assertions.assertTrue(result2);
    }

    /**
     * @description create Method for Testing the InValid Password
     *
     */
    @Test
    public void givenPassword_WhenNotValid_ShouldReturnSad () {
        boolean result = validation.password("PassWo@rd");
        Assertions.assertFalse(result);          //verifying the Result Using AssertFalse
        boolean result1 = validation.password("p@ssword12");
        Assertions.assertFalse(result1);
        boolean result2 = validation.password("PaLLaVi12");
        Assertions.assertFalse(result2);
    }
}
