package coreJavaAndFunctions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        String Year;
        System.out.println("Enter A Year: " );
        Scanner Sc = new Scanner(System.in);
        Year = Sc.nextLine();

        if (Year.length() == 4) {
            int leapYear = Integer.parseInt(Year);
            System.out.println("Entered Year is:" +leapYear);

            if((leapYear % 4) == 0 && (leapYear % 100) != 0 || (leapYear % 400) == 0){
                System.out.println("Entered Year Is Leap Year");
            }
            else {
                System.out.println("Entered Year Is Not A Leap Year");
            }
        }
        else {
            System.out.println("Invalid No! Enter A 4 Digit Number");
        }
    }
}
