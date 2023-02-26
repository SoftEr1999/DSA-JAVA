package dsa.basicmath;

import java.util.Scanner;

import dsa.basicmath.helper.QuestionHelper;
import dsa.basicmath.helper.QuestionsList;

/**
 * 
 * @author Satyam Choudhary
 * @description a class to perform all the basic math questions provided by Striver
 *
 */
public class BasicMathQuestions {
	public static void main(String []args) {
		System.out.println("------------------BASIC MATH PROGRAMS QUESTIONS---------------------");
		Scanner scan = new Scanner(System.in);
		String con;
		int choice;
		do {
			System.out.println("SELECT ANY QUESTION");
			QuestionsList.questions();
			choice = scan.nextInt();
			switch (choice) {
			case 1: QuestionHelper.ques01();
			break;
			case 2: QuestionHelper.ques02();
			break;
			case 3: QuestionHelper.ques03();
			break;
			case 4: QuestionHelper.ques04();
			break;
			case 5: QuestionHelper.ques05();
			break;
			case 6: QuestionHelper.ques06();
			break;
			case 7: QuestionHelper.ques07();
			break;
			default:
				System.out.println("Wrong Entry or Program is in Process");
			}
			System.out.println("\nDO YOU WANT TO CONTINUE PRESS Y/N");
			con = scan.next();

		} while (con.equals("y") || con.equals("Y"));
		scan.close();

	}

}
