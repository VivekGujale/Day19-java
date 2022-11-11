//As a User need to follow pre-defined Password
// rules1. minimum 8 Characters

import java.util.Scanner;

public class UserRegistrationUC5 {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Password");
        String password = sc.nextLine();
        String regex = "[A-Za-z]{8,}";
        boolean result = password.matches(regex);
        if (result)
            System.out.println("Password is valid");
        else
            System.out.println("Password is Invalid");
    }
}
