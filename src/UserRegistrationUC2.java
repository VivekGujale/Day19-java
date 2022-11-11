//As a User need to enter a valid Last Name.
//Last name starts with Cap and has minimum 3 characters.

import java.util.Scanner;

public class UserRegistrationUC2 {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Last Name");
        String lastName = sc.nextLine();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        boolean result = lastName.matches(regex);
        if (result)
            System.out.println("Last name is valid");
        else
            System.out.println("Last name is Invalid");
    }
}
