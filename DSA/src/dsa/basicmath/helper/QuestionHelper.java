package dsa.basicmath.helper;

import java.util.Scanner;


public class QuestionHelper {

	static Scanner in = new Scanner(System.in);

	/**
	 * @author Satyam Choudhary
	 * @description a program to count number of digits in a number
	 */
	public static void ques01() {
		System.out.println("Enter number of your choice!!");
		long num = in.nextInt();
		long n = num;
		int digit = 0;
		while (n > 0) {
			n = n / 10;
			digit++;
		}

		System.out.println("There are " + digit + " digits in given(" + num + ") number");

	}

	/**
	 * @author Satyam Choudhary
	 * @description a program to reverse a number
	 */
	public static void ques02() {
		System.out.println("Enter a number of your choice!!");
		long actualNum = in.nextInt();
		long n = actualNum;
		long revNum = 0;
		while (n > 0) {
			revNum = revNum * 10 + (n % 10);
			n = n / 10;
		}
		System.out.println("Number (" + actualNum + ") After Reverse is" + revNum);
	}

	/**
	 * @author Satyam Choudhary
	 * @description a program to check a palindrome number
	 */
	public static void ques03() {
		System.out.println("Enter a number of your choice!!");
		long actualNum = in.nextInt();
		long n = actualNum;
		long revNum = 0;
		while (n > 0) {
			revNum = revNum * 10 + (n % 10);
			n = n / 10;
		}
		if (revNum == actualNum) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not a Palindrome Number");
		}
	}

	/**
	 * @author Satyam Choudhary
	 * @description a program to find Highest Common Factor
	 */
	public static void ques04() {
		System.out.println("Enter first number of your choice!!");
		long firstNum = in.nextInt();
		System.out.println("Enter Second Number of your choice!!");
		long secondNum = in.nextInt();

		long smallNum = firstNum < secondNum ? firstNum : secondNum;
		long i;
		for (i = smallNum; i <= firstNum * secondNum; i++) {
			if (firstNum % i == 0 && secondNum % i == 0) {
				break;
			}
		}
		System.out.println("HCF of " + firstNum + " and " + secondNum + " is " + i);
	}
	/**
	 * @author Satyam Choudhary
	 * @description a program to check armstrong number
	 */

	public static void ques05() {
		System.out.println("Enter a number of your choice!!");
		long actualNum = in.nextInt();
		long n = actualNum;
		long armSum = 0;
		int digits = 0;
		while (n > 0) {
			n = n / 10;
			digits++;
		}
		n = actualNum;
		while (n > 0) {

			armSum = (long) (armSum + Math.pow(n % 10, digits));
			n = n / 10;
		}
		if (actualNum == armSum) {
			System.out.println("Given Number is armStrong Number");
		} else {
			System.out.println("Not a ArmStrong Number");
		}

	}
	/**
	 * @author Satyam Choudhary
	 * @description a program to print all the divisors of a number
	 */
	public static void ques06() {
		System.out.println("Enter number of your choice!!");
		long num = in.nextInt();
		System.out.println("All divisors of number "+num+" is:\n");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		
	}
	/**
	 * @author Satyam Choudhary
	 * @description a program to check Prime Number
	 */
	public static void ques07() {
		System.out.println("Enter number of your choice!!");
		int num = in.nextInt();
		if(num==1||num==0||num<0)
			System.out.println("Not a Prime Number");
		int i;
		int m=num/2;
		for(i=2;i<=m;i++) {
			if(num%i==0) {
				System.out.print("Not a Prime Number");
				break;
			}
		}
		if(m==(--i)) {
			System.out.println("It's a Prime Number");
		}
		
	}
	

}
