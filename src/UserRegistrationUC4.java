//As a User need to follow predefined Mobile Format - E.g. 91 9919819801 -
// Country code follow by space and 10-digit number.


import java.util.Scanner;

public class UserRegistrationUC4 {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mobile number");
        String mobileNumber = sc.nextLine();
        String regex = "[91]{2}[ ][0-9]{10}";
        boolean result = mobileNumber.matches(regex);
        if (result) System.out.println("Email ID is valid");
        else System.out.println("Email ID is Invalid");
    }
}
