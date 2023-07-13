package org.example;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProjectTest {
    InputValidator inputValidator = new InputValidator();
    @Test
    public void fullNameValidTest(){
        String fullName = "vyPz''Y''CHJjj'T'i''";
        boolean isValid = inputValidator.validateFullName(fullName);
        assertTrue(isValid);
    }
    @Test
    public void phoneNumberValidTest(){
        String phoneNumber = "372 173-5849";
        boolean isValid = inputValidator.validatePhoneNumber(phoneNumber);
        assertTrue(isValid);
    }

    @Test
    public void addressValidTest(){
        String address = "ObxvMtqoiCsciAsNKd";
        boolean isValid = inputValidator.validateAddress(address);
        assertTrue(isValid);
    }

    @Test
    public void cityValidTest(){
        String city = ",,EMnW)vA-(";
        boolean isValid = inputValidator.validateCity(city);
        assertTrue(isValid);
    }

    @Test
    public void postalCodeValidTest(){
        String postalCode = "h5y 8N5";
        boolean isValid = inputValidator.validatePostalCode(postalCode);
        assertTrue(isValid);
    }

    @Test
    public void visaCardValidTest(){
        String cardNumber = "4614411336338";
        boolean isValid = inputValidator.validateVisaCard(cardNumber);
        assertTrue(isValid);
    }

    @Test
    public void fullNameInvalidTest(){
        String fullName = "123";
        boolean isValid = inputValidator.validateFullName(fullName);
        assertFalse(isValid);
    }
    @Test
    public void phoneNumberInvalidTest(){
        String phoneNumber = "adh 173-5849";
        boolean isValid = inputValidator.validatePhoneNumber(phoneNumber);
        assertFalse(isValid);
    }

    @Test
    public void addressInvalidTest(){
        String address = "123";
        boolean isValid = inputValidator.validateAddress(address);
        assertFalse(isValid);
    }

    @Test
    public void cityInvalidTest(){
        String city = "1";
        boolean isValid = inputValidator.validateCity(city);
        assertFalse(isValid);
    }

    @Test
    public void postalCodeInvalidTest(){
        String postalCode = "5h5 V5V";
        boolean isValid = inputValidator.validatePostalCode(postalCode);
        assertFalse(isValid);
    }

    @Test
    public void visaCardInvalidTest(){
        String cardNumber = "a614411336338";
        boolean isValid = inputValidator.validateVisaCard(cardNumber);
        assertFalse(isValid);
    }
}
