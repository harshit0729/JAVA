package hj;
import java.util.Scanner;

public class Stringnumber {

    public static void main(String[] args) {

System.out.println("Enter counting digits:");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();

Scanner cs = new Scanner(System.in);
System.out.println("Enter your name:");
String b = cs.nextLine();

System.out.println("Dear " + b + ", here is this counting:");

 int i = 1;
 while (i <= a) {
 System.out.println(i + "        ");
 i++; 
        }
    }
}
