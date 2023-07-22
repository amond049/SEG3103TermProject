package org.example;

import nl.flotsam.xeger.Xeger;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class InputSpacePartitioning {
    public static void main(String[] args){
        String fullNameRegex = "[a-zA-Z\\s-.']{20,50}";
        String phoneNumberRegex = "([0-9]{3}[- ]?){2}[0-9]{4}";
        String addressRegex = "[A-Za-z]{10,60}";
        String cityRegex = "[A-Za-z'-.]{10,50}";
        String postalCodeRegex = "[A-Za-z]{1}[0-9]{1}[A-Za-z]{1} [0-9]{1}[A-Za-z]{1}[0-9]{1}";
        String visaCardNumberRegex = "[4][0-9]{12}";

        Xeger fullNameGenerator = new Xeger(fullNameRegex);
        Xeger phoneNumberGenerator = new Xeger(phoneNumberRegex);
        Xeger addressGenerator = new Xeger(addressRegex);
        Xeger cityGenerator = new Xeger(cityRegex);
        Xeger postalCodeGenerator = new Xeger(postalCodeRegex);
        Xeger visaCardNumberGenerator = new Xeger(visaCardNumberRegex);

        String randomFullName;
        String randomPhoneNumber;
        String randomAddress;
        String randomCity;
        String randomPostalCode;
        String randomCardNumber;

        try {
            File fullNameFile = new File("C:\\Users\\meeky\\Desktop\\Universities\\Second Year\\Summer Semester\\SEG 3103\\Final_Project\\SEG3103TermProject\\SEG3103TermProject\\src\\main\\java\\org\\example\\ValidFullName.txt");
            File phoneNumberFile = new File("C:\\Users\\meeky\\Desktop\\Universities\\Second Year\\Summer Semester\\SEG 3103\\Final_Project\\SEG3103TermProject\\SEG3103TermProject\\src\\main\\java\\org\\example\\ValidPhoneNumber.txt");
            File addressFile = new File("C:\\Users\\meeky\\Desktop\\Universities\\Second Year\\Summer Semester\\SEG 3103\\Final_Project\\SEG3103TermProject\\SEG3103TermProject\\src\\main\\java\\org\\example\\ValidAddress.txt");
            File cityFile = new File("C:\\Users\\meeky\\Desktop\\Universities\\Second Year\\Summer Semester\\SEG 3103\\Final_Project\\SEG3103TermProject\\SEG3103TermProject\\src\\main\\java\\org\\example\\ValidCity.txt");
            File postalCodeFile = new File("C:\\Users\\meeky\\Desktop\\Universities\\Second Year\\Summer Semester\\SEG 3103\\Final_Project\\SEG3103TermProject\\SEG3103TermProject\\src\\main\\java\\org\\example\\ValidPostalCode.txt");
            File cardFile = new File("C:\\Users\\meeky\\Desktop\\Universities\\Second Year\\Summer Semester\\SEG 3103\\Final_Project\\SEG3103TermProject\\SEG3103TermProject\\src\\main\\java\\org\\example\\ValidCardNumber.txt");

            BufferedWriter fullNameWriter = new BufferedWriter(new FileWriter(fullNameFile));
            BufferedWriter phoneNumberWriter = new BufferedWriter(new FileWriter(phoneNumberFile));
            BufferedWriter addressWriter = new BufferedWriter(new FileWriter(addressFile));
            BufferedWriter cityWriter = new BufferedWriter(new FileWriter(cityFile));
            BufferedWriter postalCodeWriter = new BufferedWriter(new FileWriter(postalCodeFile));
            BufferedWriter cardWriter = new BufferedWriter(new FileWriter(cardFile));

            for (int i = 0; i < 100; i++){
                randomFullName = fullNameGenerator.generate();
                randomPhoneNumber = phoneNumberGenerator.generate();
                randomAddress = addressGenerator.generate();
                randomCity = cityGenerator.generate();
                randomPostalCode = postalCodeGenerator.generate();
                randomCardNumber = visaCardNumberGenerator.generate();

                fullNameWriter.write(randomFullName + "\n");
                phoneNumberWriter.write(randomPhoneNumber + "\n");
                addressWriter.write(randomAddress + "\n");
                cityWriter.write(randomCity + "\n");
                postalCodeWriter.write(randomPostalCode + "\n");
                cardWriter.write(randomCardNumber + "\n");
            }

            fullNameWriter.close();
            phoneNumberWriter.close();
            addressWriter.close();
            cityWriter.close();
            postalCodeWriter.close();
            cardWriter.close();

        } catch (Exception e){
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }
}
