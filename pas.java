package hj;
import java.util.Scanner;

public class pas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter your age:");
        int age = sc.nextInt();

       
        System.out.println("Do you have a criminal record? (true/false):");
        boolean hasCriminalRecord = sc.nextBoolean();

               System.out.println("Are all your documents valid? (true/false):");
        boolean areDocumentsValid = sc.nextBoolean();

                if (age >= 18) {
            if (!hasCriminalRecord) { 
                if (areDocumentsValid) { 
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
