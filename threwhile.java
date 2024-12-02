package hj;
import java.util.Scanner;

public class threwhile {

	public static void main(String[] args) {
		System.out.println("enter number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int  rem , sum=0;
		while(num>0) {
			rem = num%10;
			sum = sum*10+rem;
			num = num/10;
		}
		System.out.println(sum);
		

	}

}






