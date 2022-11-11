//As a User need to enter a valid email
//E.g. abc.xyz@bl.co.in
// Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions


import java.util.Scanner;

public class UserRegistrationUC3 {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email ID");
        String emailID = sc.nextLine();

        //Here abc, bl & co are mandatory parts E.g. abc.xyz@bl.co.in
        String regex = "[abc]{3}(.?[a-z0-9]{2,})?@[bl]{2}.[a-z]{2,}(.?[a-z]{2,})?";
        boolean result = emailID.matches(regex);
        if (result)
            System.out.println("Email ID is valid");
        else
            System.out.println("Email ID is Invalid");
    }


}


