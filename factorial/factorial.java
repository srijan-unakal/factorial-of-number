package factorial;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("This program prints factorial of given number ");
		while (true) {
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		int fact=1;
		if (a<0) {
			System.out.println("Factorial of negative number is not possible !");
		}
		else {
		for (int i =1;i<=a;i++) {
			fact=fact*i;
		}
		System.out.println("The factorial of the number is : "+fact);
		}
		System.out.println("Do you want to continue : Y/N  ");
		char b = Character.toUpperCase(sc.next().charAt(0));
		if (b=='N') {
			System.out.println("Thank you  ");
			break;
		}
		}
		sc.close();

	}

}
