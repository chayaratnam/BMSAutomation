package tests;

import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void validLoginTest() {
        System.out.println("Simulated valid login test for mobile number: 8919622544");
    }

    @Test
    public void invalidLoginTest() {
        System.out.println("Simulated invalid login test for mobile number: 098765");
    }
}
