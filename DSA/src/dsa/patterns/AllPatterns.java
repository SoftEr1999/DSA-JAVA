package dsa.patterns;

import java.util.Scanner;

import dsa.patterns.helper.PatterType;
import dsa.patterns.helper.PatternMake;

/**
 * @author Satyam Choudhary
 * @class For Printing different patterns
 * 
 *
 */
public class AllPatterns {

	public static void main(String[] args) {
		System.out.println("------------------Different Patterns Printing Programs---------------------");
		Scanner scan = new Scanner(System.in);
		String con;
		int choice;
		int number;
		do {
			System.out.println("SELECT ONE PATTERN");
			PatterType.patternTypes();
			choice = scan.nextInt();
			System.out.println("ENTER NUMBER LENGTH TO CREATE PATTERN");
			number = scan.nextInt();
			switch (choice) {
			case 1:
				PatternMake.squareStar(number);
				break;
			case 2:
				PatternMake.rightTriangleStar(number);
				break;
			case 3:
				PatternMake.rightTriangleNumberRaw(number);
				break;
			case 4:
				PatternMake.rightTriangleNumberCol(number);
				break;
			case 5:
				PatternMake.downwardTriangleStar(number);
				break;
			case 6:
				PatternMake.downwardTriangleNumber(number);
				break;
			case 7:
				PatternMake.pyramidStar(number);
				break;
			case 8:
				PatternMake.downwardPyramidStar(number);
				break;
			case 9:
				PatternMake.diamondWithStar(number);
				break;
			case 10:
				PatternMake.rightPascalTriangle(number);
				break;
			case 11:
				PatternMake.right01Triangle(number);
				break;
			case 12:
				PatternMake.doubleNumberTriangle(number);
				break;
			case 13:
				PatternMake.rightTriangleNumber(number);
				break;
			case 14:
				PatternMake.rightTriangleCharacter(number);
				break;
			case 15:
				PatternMake.downwardTriangleCharacter(number);
				break;
			case 16:
				PatternMake.downwardCharacterRaw(number);
				break;
			case 17:
				PatternMake.pyramidCharacter(number);
				break;
			case 18:
				PatternMake.rightTriangleCharacterReverse(number);
				break;
			case 19:
				PatternMake.diamondStarAndSpace(number);
				break;
			case 20:
				PatternMake.butterflyUsingStar(number);
				break;
			case 21:
				PatternMake.squarePatternWithSpace(number);
				break;
			case 22:
				PatternMake.squarePatternNumber(number);
				break;

			default:
				System.out.println("Wrong Entry or Program is in Process");
			}
			System.out.println("DO YOU WANT TO CONTINUE PRESS Y/N");
			con = scan.next();

		} while (con.equals("y") || con.equals("Y"));
		scan.close();

	}

}
