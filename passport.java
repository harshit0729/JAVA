package hj;
import java.util.Scanner;

public class passport{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter your age:");
        int age = sc.nextInt();


        System.out.println("Do you have a criminal record? (yes/no):");
        String criminalRecord = sc.next();


        System.out.println("Are all your documents valid? (yes/no):");
        String documentsValid = sc.next();

        
        if (age >= 18) {
            if (criminalRecord.equalsIgnoreCase("no")) {
                if (documentsValid.equalsIgnoreCase("yes")) {
                    System.out.println("You are eligible for a passport.");
                } else {
                    System.out.println("You are not eligible for a passport: Invalid documents.");
                }
            } else {
                System.out.println("You are not eligible for a passport: Criminal record found.");
            }
        } else {
            System.out.println("You are not eligible for a passport: Age must be 18 or above.");
        }

        sc.close(); 
    }
}
