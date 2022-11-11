//Rule4 – Has exactly 1 Special Character and all rules must be passed.

import java.util.Scanner;

public class UserRegistrationUC8 {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Password");
        String password = sc.nextLine();
        String regex = "[A-Z][a-z]{4,}[0-9]{1,}[!@#^%&*]";
        boolean result = password.matches(regex);
        if (result)
            System.out.println("Password is valid");
        else
            System.out.println("Password is Invalid");
    }
}
