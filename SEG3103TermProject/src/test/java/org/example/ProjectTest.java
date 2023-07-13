package org.example;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
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
}
