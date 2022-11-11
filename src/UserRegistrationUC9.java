//Should clear all email samples provided separately.
//abc@yahoo.com, //abc-100@yahoo.com, //abc.100@yahoo.com // abc111@abc.com,
// abc-100@abc.net, // abc.100@abc.com.au //abc@1.com, // abc+100@gmail.com

import java.util.Scanner;

public class UserRegistrationUC9 {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email ID");
        String emailID = sc.nextLine();
        String regex = "[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.,-]+";
        boolean result = emailID.matches(regex);
        if (result)
            System.out.println("Email ID is valid");
        else
            System.out.println("Email ID is Invalid");
    }
}
