//Rule3 - Should have at least 1 numeric number in the password


import java.util.Scanner;

public class UserRegistrationUC7 {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Password");
        String password = sc.nextLine();
        String regex = "[A-Z][a-z]{5,}[0-9]{1,}";
        boolean result = password.matches(regex);
        if (result)
            System.out.println("Password is valid");
        else
            System.out.println("Password is Invalid");
    }
}
