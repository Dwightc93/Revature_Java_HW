package JavaCoreHW.Q17SimpleInterest;

import java.util.ArrayList;
import java.util.Scanner;


public class Q17SimpleInterest {

    public static void main(String[] args) {

        ArrayList<String> person = scanForData();

        double rate = Double.parseDouble(person.get(0));
        double principal = Double.parseDouble(person.get(1));
        int time = Integer.parseInt(person.get(2));

        double interest = principal * rate * time;

        System.out.println("Total Interest: $" + interest);

    }

    public static ArrayList<String> scanForData() {
        double interest;
        double principal;
        int numYears;

        ArrayList<String> person = new ArrayList<>();

        //this is to make sure you have correct input for interest by user
        Scanner one = new Scanner(System.in);
        System.out.println("Enter your Rate of Interest:" );
        while (true) {
            try {
                interest = Double.parseDouble(one.next());
                break; // will only get to here if input was a double
            } catch (NumberFormatException ignore) {
                System.out.println("Invalid input, Please enter numeric value");
            }
        }
        String interestString = Double.toString(interest);
        person.add(interestString);// Allows a person to enter rate of interest



        Scanner two = new Scanner(System.in);
        System.out.println("Enter your principal:" );
        while (true) {
            try {
                principal = Double.parseDouble(two.next());
                break; // will only get to here if input was a double
            } catch (NumberFormatException ignore) {
                System.out.println("Invalid input, Please enter correct numeric value");
            }
        }

//        System.out.println("Principal Entered: $" + principal);
        //convert account number integer to string to convert to store in person string array
        String principalString = Double.toString(principal);
        person.add(principalString);


        Scanner three = new Scanner(System.in);
        System.out.println("Enter the number of years:" );
        while (true) {
//            System.out.println("Type a double-type number:");
            try {
                numYears = Integer.parseInt(three.next());
                break; // will only get to here if input was a double
            } catch (NumberFormatException ignore) {
                System.out.println("Invalid input, Please input the right number of years");
            }
        }
//      System.out.println("Number of Years Entered: " + numYears);
        //convert account number integer to string to convert to store in person string array
        String yearString = Integer.toString(numYears);

        person.add(yearString);

        return person;
    }

}