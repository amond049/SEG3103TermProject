package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class InputValidator {

    // Grammars:
    // Full name (First and Last name): between 1 and 50 characters - DONE
    // Phone Number: between 1 and 20 characters - DONE
    // Address: between 1 and 60 characters and needs to start with a number and then only characters
    // City: between 1 and 50 characters and needs to be only alphabetical characters
    // Postal Code: They do some implicit check in the background to correlate the street address with postal code

    String fullNameRegex = "^[a-zA-Z\\s-.']{1,50}$";
    String phoneNumberRegex = "^([0-9]{3}[-. ]?){2}[0-9]{4}$";
    String addressRegex = "^[A-Za-z]{10,60}$";
    String cityRegex = "^[A-Za-z'-.]{10,50}$";
    String postalCodeRegex = "^[A-Za-z]{1}[0-9]{1}[A-Za-z]{1}\\s[0-9]{1}[A-Za-z]{1}[0-9]{1}$";

    // Card info regex
    String visaCardNumberRegex = "^[4][0-9]{12}";
    String masterCardNumberRegex = "^5[1-5][0-9]{14}";
    String amexCardNumberRegex = "3[47][0-9]{13}";

    Pattern fullNamePattern = Pattern.compile(fullNameRegex);
    Pattern phoneNumberPattern = Pattern.compile(phoneNumberRegex);
    Pattern addressPattern = Pattern.compile(addressRegex);
    Pattern cityPattern = Pattern.compile(cityRegex);
    Pattern postalCodePattern = Pattern.compile(postalCodeRegex);

    // Creating the patterns for the different card providers Amazon accepts
    Pattern visaCardPattern = Pattern.compile(visaCardNumberRegex);
    Pattern masterCardPattern = Pattern.compile(masterCardNumberRegex);
    Pattern amexCardPattern = Pattern.compile(amexCardNumberRegex);

    // Validates fullName
    public boolean validateFullName(String fullName){
        Matcher matcher = fullNamePattern.matcher(fullName);
        return matcher.matches();
    }
    // Validate phoneNumber
    public boolean validatePhoneNumber(String phoneNumber){
        Matcher matcher = phoneNumberPattern.matcher(phoneNumber);
        return matcher.matches();
    }
    // Validates city
    public boolean validateCity(String city){
        Matcher matcher = cityPattern.matcher(city);
        return matcher.matches();
    }
    // Validates address
    public boolean validateAddress(String address){
        Matcher matcher = addressPattern.matcher(address);
        return matcher.matches();
    }
    // Validates postalCode
    public boolean validatePostalCode(String postalCode){
        Matcher matcher = postalCodePattern.matcher(postalCode);
        return matcher.matches();
    }
    // Validates visaCard
    public boolean validateVisaCard(String visaCard){
        Matcher matcher = visaCardPattern.matcher(visaCard);
        return matcher.matches();
    }

    // Validates masterCard
    public boolean validateMasterCard(String masterCard){
        Matcher matcher = masterCardPattern.matcher(masterCard);
        return matcher.matches();
    }
    // Validates amexCard
    public boolean validateAmexCard(String amexCard){
        Matcher matcher = amexCardPattern.matcher(amexCard);
        return matcher.matches();
    }

}