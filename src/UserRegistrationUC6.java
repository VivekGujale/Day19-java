//Should have at least 1 Upper case.

import java.util.Scanner;

public class UserRegistrationUC6 {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Password");
        String password = sc.nextLine();
        String regex = "[A-Z][a-z]{7,}";
        boolean result = password.matches(regex);
        if (result)
            System.out.println("Password is valid");
        else
            System.out.println("Password is Invalid");
    }
}
