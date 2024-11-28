package hj;
import java.util.Scanner;

public class election {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your age:");

        int age = sc.nextInt(); 

        if (age < 18) {
            System.out.println("Not eligible");
        } else if (age >= 18 && age <= 21) {
            System.out.println("Go for study");
        } else if (age > 21 && age <= 60) {
            System.out.println("Eligible");
        } else {
            System.out.println("Age out of range");
        }

        sc.close(); 
    }
}
