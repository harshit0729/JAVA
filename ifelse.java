package hj;
import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your age:");
        
        int age = sc.nextInt(); 
        
        if (age >= 18) { 
            System.out.println("adult");
        } else {
            System.out.println("kid");
        }
        
        sc.close(); 
    }
}
