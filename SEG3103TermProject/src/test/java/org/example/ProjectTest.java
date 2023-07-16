package org.example;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProjectTest {
    InputValidator inputValidator = new InputValidator();
    @Test
    public void fullNameValidTest1(){
        String fullName = "vyPz''Y''CHJjj'T'i''";
        boolean isValid = inputValidator.validateFullName(fullName);
        assertTrue(isValid);
    }
    @Test
    public void fullNameValidTest2(){
        String fullName = "Z''pc'Zc'H''Z'v''EN'AG";
        boolean isValid = inputValidator.validateFullName(fullName);
        assertTrue(isValid);
    }
    @Test
    public void fullNameValidTest3(){
        String fullName = "'M'''oSmyu'GPr'DPeXG'W's'XL";
        boolean isValid = inputValidator.validateFullName(fullName);
        assertTrue(isValid);
    }

    @Test
    public void fullNameValidTest4(){
        String fullName = "E'yldQ'''us'''nI'SK'";
        boolean isValid = inputValidator.validateFullName(fullName);
        assertTrue(isValid);
    }

    @Test
    public void fullNameValidTest5(){
        String fullName = "Q''I''HK'f'xFlotwBk'''";
        boolean isValid = inputValidator.validateFullName(fullName);
        assertTrue(isValid);
    }

    @Test
    public void phoneNumberValidTest1(){
        String phoneNumber = "372 173-5849";
        boolean isValid = inputValidator.validatePhoneNumber(phoneNumber);
        assertTrue(isValid);
    }

    @Test
    public void phoneNumberValidTest2(){
        String phoneNumber = "9302116025";
        boolean isValid = inputValidator.validatePhoneNumber(phoneNumber);
        assertTrue(isValid);
    }

    @Test
    public void phoneNumberValidTest3(){
        String phoneNumber = "251 9577093";
        boolean isValid = inputValidator.validatePhoneNumber(phoneNumber);
        assertTrue(isValid);
    }

    @Test
    public void phoneNumberValidTest4(){
        String phoneNumber = "9945821158";
        boolean isValid = inputValidator.validatePhoneNumber(phoneNumber);
        assertTrue(isValid);
    }

    @Test
    public void phoneNumberValidTest5(){
        String phoneNumber = "439 601-2281";
        boolean isValid = inputValidator.validatePhoneNumber(phoneNumber);
        assertTrue(isValid);
    }

    @Test
    public void addressValidTest1(){
        String address = "ObxvMtqoiCsciAsNKd";
        boolean isValid = inputValidator.validateAddress(address);
        assertTrue(isValid);
    }

    @Test
    public void addressValidTest2(){
        String address = "tyHOuIHzyl";
        boolean isValid = inputValidator.validateAddress(address);
        assertTrue(isValid);
    }

    @Test
    public void addressValidTest3(){
        String address = "qZkbIGJBaZ";
        boolean isValid = inputValidator.validateAddress(address);
        assertTrue(isValid);
    }

    @Test
    public void addressValidTest4(){
        String address = "lkMFYdPBEAYY";
        boolean isValid = inputValidator.validateAddress(address);
        assertTrue(isValid);
    }

    @Test
    public void addressValidTest5(){
        String address = "QxAnJyLOXCcflWgHyXYYN";
        boolean isValid = inputValidator.validateAddress(address);
        assertTrue(isValid);
    }
    @Test
    public void cityValidTest1(){
        String city = ",,EMnW)vA-(";
        boolean isValid = inputValidator.validateCity(city);
        assertTrue(isValid);
    }

    @Test
    public void cityValidTest2(){
        String city = "muv,-+d+ja";
        boolean isValid = inputValidator.validateCity(city);
        assertTrue(isValid);
    }

    @Test
    public void cityValidTest3(){
        String city = "tNb+BTl*UjSAEs";
        boolean isValid = inputValidator.validateCity(city);
        assertTrue(isValid);
    }

    @Test
    public void cityValidTest4(){
        String city = "xH(vu.xCI+,-(o";
        boolean isValid = inputValidator.validateCity(city);
        assertTrue(isValid);
    }

    @Test
    public void cityValidTest5(){
        String city = "-v(oOD*F)SPqPlfsG.A";
        boolean isValid = inputValidator.validateCity(city);
        assertTrue(isValid);
    }

    @Test
    public void postalCodeValidTest1(){
        String postalCode = "h5y 8N5";
        boolean isValid = inputValidator.validatePostalCode(postalCode);
        assertTrue(isValid);
    }

    @Test
    public void postalCodeValidTest2(){
        String postalCode = "N3v 6M3";
        boolean isValid = inputValidator.validatePostalCode(postalCode);
        assertTrue(isValid);
    }
    @Test
    public void postalCodeValidTest3(){
        String postalCode = "N3S 1m7";
        boolean isValid = inputValidator.validatePostalCode(postalCode);
        assertTrue(isValid);
    }
    @Test
    public void postalCodeValidTest4(){
        String postalCode = "Y2l 5I6";
        boolean isValid = inputValidator.validatePostalCode(postalCode);
        assertTrue(isValid);
    }
    @Test
    public void postalCodeValidTest5(){
        String postalCode = "H2k 9Q5";
        boolean isValid = inputValidator.validatePostalCode(postalCode);
        assertTrue(isValid);
    }
    @Test
    public void visaCardValidTest1(){
        String cardNumber = "4614411336338";
        boolean isValid = inputValidator.validateVisaCard(cardNumber);
        assertTrue(isValid);
    }
    @Test
    public void visaCardValidTest2(){
        String cardNumber = "4728434526373";
        boolean isValid = inputValidator.validateVisaCard(cardNumber);
        assertTrue(isValid);
    }
    @Test
    public void visaCardValidTest3(){
        String cardNumber = "4699143221149";
        boolean isValid = inputValidator.validateVisaCard(cardNumber);
        assertTrue(isValid);
    }
    @Test
    public void visaCardValidTest4(){
        String cardNumber = "4201195819298";
        boolean isValid = inputValidator.validateVisaCard(cardNumber);
        assertTrue(isValid);
    }
    @Test
    public void visaCardValidTest5(){
        String cardNumber = "4224309943064";
        boolean isValid = inputValidator.validateVisaCard(cardNumber);
        assertTrue(isValid);
    }
    @Test
    public void masterCardValidTest(){
        String cardNumber = "5383928475636475";
        boolean isValid = inputValidator.validateMasterCard(cardNumber);
        assertTrue(isValid);
    }
    @Test
    public void AmexValidTest(){
        String cardNumber = "348472485967583";
        boolean isValid = inputValidator.validateAmexCard(cardNumber);
        assertTrue(isValid);
    }
    @Test
    public void fullNameInvalidTest(){
        String fullName = "123";
        boolean isValid = inputValidator.validateFullName(fullName);
        assertFalse(isValid);
    }

    @Test
    public void fullNameInvalidTestJustSpace(){
        String fullName = "";
        boolean isValid = inputValidator.validateFullName(fullName);
        assertFalse(isValid);
    }

    @Test
    public void fullNameInvalidTestSpecialCharacters(){
        String fullName = "@&#^*@#^@*";
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
    @Test
    public void masterCardInvalidTest(){
        String cardNumber = "6383928475636475";
        boolean isValid = inputValidator.validateMasterCard(cardNumber);
        assertFalse(isValid);
    }
    @Test
    public void AmexInvalidTest(){
        String cardNumber = "399573849589987";
        boolean isValid = inputValidator.validateAmexCard(cardNumber);
        assertFalse(isValid);
    }
}
