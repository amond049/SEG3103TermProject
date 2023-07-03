package org.example;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ProjectTest {
    @Test
    public void fullNameValidTest(){
        InputValidator inputValidator = new InputValidator();
        String fullName = "Charles Hog";
        boolean isValid = inputValidator.validateFullName(fullName);
        assertTrue(isValid);
    }

}
