//As a User need to enter a valid First Name.
//First name starts with Cap and has minimum 3 characters.

import java.util.Scanner;

public class UserRegistrationUC1 {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name");
        String firstName = sc.nextLine();
        String regex = "^[A-Z][a-z]{3,}$";
        boolean result = firstName.matches(regex);
        if (result)
            System.out.println("First name is valid");
        else
            System.out.println("First name is Invalid");
    }
}



