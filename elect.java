package hj;

import java.util.Scanner;

public class elect {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        
        if (age < 18) {
            System.out.println("You are not eligible for elections: Age must be 18 or above.");
        } else if (age < 21) {
            System.out.println("You are not eligible for elections: Minimum age is 21.");
        } else {

            System.out.println("Have you passed 12th grade? (true/false):");
            boolean is12thPass = sc.nextBoolean();

            
            System.out.println("Do you have a criminal record? (true/false):");
            boolean hasCriminalRecord = sc.nextBoolean();


            if (is12thPass) {
                if (!hasCriminalRecord) {
                    System.out.println("You are eligible for elections.");
                } else {
                    System.out.println("You are not eligible for elections: Criminal record found.");
                }
            } else {
                System.out.println("You are not eligible for elections: Must be 12th pass.");
            }
        }

//        sc.close(); 
    }
}
