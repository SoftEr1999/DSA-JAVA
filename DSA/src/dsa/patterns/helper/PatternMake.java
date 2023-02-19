package dsa.patterns.helper;

public class PatternMake {

	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - SQUARE STAR PATTERN
	 * @patternno - 1
	 */
	public static void squareStar(int n) {
		/*
		 *  		*****
		 *  		*****
		 *  		*****
		 *  		*****
		 *  		*****
		 */

		for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	

	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - RIGHT TRIANGLE STAR PATTERN
	 * @patternno - 2
	 */
	public static void rightTriangleStar(int n) {
		/*
		 * 		*
		 * 		**
		 * 		***
		 * 		****
		 * 		*****
		 */
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - RIGHT TRIANGLE NUMBER BY COLUMN PATTERN
	 * @patternno - 3
	 */
	public static void rightTriangleNumberCol(int n) {
		/*
		 * 		1
		 * 		12
		 * 		123
		 * 		1234
		 * 		12345
		 */
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - RIGHT TRIANGLE NUMBER BY RAW PATTERN
	 * @patternno - 4
	 */
	public static void rightTriangleNumberRaw(int n) {
		/*
		 * 		1
		 * 		22
		 * 		333
		 * 		4444
		 * 		55555
		 */

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns 
	 * @pattern - DOWNWARD TRIANGLE STAR PATTERN
	 * @patternno - 5
	 */
	public static void downwardTriangleStar(int n) {
		/*
		 * 		*****
		 * 		****
		 * 		***
		 * 		**
		 * 		*
		 */
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - DOWNWARD TRIANGLE NUMBER PATTERN
	 * @patternno - 6
	 */
	public static void downwardTriangleNumber(int n) {
		/*
		 * 		12345
		 * 		1234
		 * 		123
		 * 		12
		 * 		1
		 */
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
		}
	}
	
	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - PYRAMID STAR PATTERN
	 * @patternno - 7
	 */
	public static void pyramidStar(int n) {
		/*
		 *			*
		 *		   ***
	 			  *****
	 			 *******
	 			*********
		 */
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}

	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - DOWNWARD PYRAMID STAR PATTERN
	 * @patternno - 8
	 */
	public static void downwardPyramidStar(int n) {
		/*
		 *			*********
		 *		     *******
	 			      *****
	 			       ***
	 			        *
		 */
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=2*(n-i)+1;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}
	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - DIAMOND SHAPE STAR PATTERN
	 * @patternno - 9
	 */
	public static void diamondWithStar(int n) {
		
		/*
		 * 			*
		 *		   ***
	 			  *****
	 			 *******
	 			*********
	 			*********
		 *		 *******
	 			  *****
	 			   ***
	 			    *
		 */
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=2*(n-i)+1;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			for(int k=1;k<=8-2*i;k++)
			{
				System.out.print(" ");
			}
			
			for(int l=0;l<=i;l++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}
	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - RIGHT PASCAL STAR PATTERN
	 * @patternno - 10
	 */
	public static void rightPascalTriangle(int n) {
		/*
		 * 			*
		 * 			**
		 * 			***
		 * 			****
		 * 			*****
		 * 			****
		 * 			***
		 * 			**
		 * 			*
		 */
				
		//First half later
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<=i;j++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
				
		//Second half layer
				for(int i=0;i<n-1;i++)
				{
					for(int j=1;j<n-i;j++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
				
				
		

	}
	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns 
	 * @pattern - RIGHT TRIANGLE 0/1 PATTERN
	 * @patternno - 11
	 */
	public static void right01Triangle(int n) {
		
		/**
		 * 	1
		 * 	01
		 * 	101
		 *  0101
		 *  10101
		 */
		int count = 1;
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				
				System.out.print(count);
				if(count==1)
					count=0;
				else
					count=1;
				
				
			}
			count = i%2;
			
			System.out.println();
		}
	}
	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - NUMBER DOUBLE TRIANGLE PATTERN
	 * @patternno - 12
	 */
	public static void doubleNumberTriangle(int n) {
		/*
		 *    1      1
		 *    12    21
		 *    123  321
		 *    12344321
		 */
		for(int i=1;i<=n;i++)
		{
			//first half triangle
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
			//for spaces
			for(int k=1;k<=n*2-2*i;k++)
			{
				System.out.print(" ");
			}
			
			//for second half triangle
			for(int l=i;l>=1;l--)
			{
				System.out.print(l);
			}
			
			System.out.println();
		}
		
	}
	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - RIGHT TRIANGLE NUMBER PATTERN
	 * @patternno - 13
	 */
	public static void rightTriangleNumber(int n) {
		/*
		 * 		1
		 * 		23
		 * 		456
		 * 		78910
		 * 		1112131415
		 */
		int count =1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - RIGHT TRIANGLE CHARACTER'S PATTERN
	 * @patternno - 14
	 */
	public static void rightTriangleCharacter(int n) {
		/*
		 * 		A
		 * 		AB
		 * 		ABC
		 * 		ABCD
		 * 		ABCDE
		 */
		for(int i='A';i<=(char)65+n;i++)
		{
			for(int j='A';j<=i;j++)
			{
				System.out.print((char)j);
			}
			System.out.println();
		}
		
		
	}
	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - DOWNWARD TRIANGLE CHARACTER'S PATTERN
	 * @patternno - 15
	 */
	public static void downwardTriangleCharacter(int n) {
		/*
		 * 		ABCDE
		 * 		ABCD
		 * 		ABC
		 * 		AB
		 * 		A
		 */
		for(int i=1;i<=n;i++)
		{
			int alpha=65;
			for(int j=1;j<=n+1-i;j++)
			{
				System.out.print((char)alpha++);
			}
			System.out.println();
		}
		

	}
	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - DOWNWARD TRIANGLE CHARACTER'S RAW PATTERN
	 * @patternno - 16
	 */
	public static void downwardCharacterRaw(int n) {
		/*
		 * 		A
		 * 		BB
		 * 		CCC
		 * 		DDDD
		 * 		EEEEE
		 */

		for(int i='A';i<=(char)65+n;i++)
		{
			for(int j='A';j<=i;j++)
			{
				System.out.print((char)i);
			}
			System.out.println();
		}
		
		
	}
	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - PYRAMID CHARACTER'S PATTERN
	 * @patternno - 17
	 */
	public static void pyramidCharacter(int n) {
		/*
		 * 			A
		 * 		   ABA
		 * 		  ABCBA
		 * 		 ABCDCBA
		 * 		ABCDEDCBA
		 */
		
		for(int i=1;i<=n;i++)
		{
			int val = 65;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print((char)val++);
			}
			
			for(int l=2;l<=i;l++)
			{
				
				System.out.print((char)(val-2));
				val--;
			}
			
			System.out.println();
		}
		
		for(int i=0; i<=4;i++)
		{
			int val = 69-i;
			for(char j=0;j<=i;j++)
			{
				System.out.print((char)val++);
			}
			System.out.println();
		}
		
	}
	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - RIGHT TRIANGLE CHARACTER'S REVERSE PATTERN
	 * @patternno - 18
	 */
	public static void rightTriangleCharacterReverse(int n) {
		/*
		 * 		E
		 * 		DE
		 * 		CDE
		 * 		BCDE
		 * 		ABCDE
		 */
		for(int i=65+n; i>=65;i--)
		{
			int count = i;
			for(int j=i;j<=65+n;j++)
			{
				System.out.print((char)count);
				count++;
			}
			System.out.println();
		}
	}
	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - DIAMOND STAR AND SPACE PATTERN
	 * @patternno - 19
	 */
	public static void diamondStarAndSpace(int n) {
		/*
		 * 		**********
		 		****  ****
		 		***    ***
		 		**      **
		 		*        *
		 		*        *
		 		**      **
		 		***    ***
		 		****  ****
		 		**********
		 */
		for(int i=0;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
			
			for(int k=1;k<=2*i;k++)
			{
				System.out.print(" ");
			}
			
			for(int l=n;l>=i;l--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			for(int k=1;k<=2*n-2*i;k++)
			{
				System.out.print(" ");
			}
			
			for(int l=0;l<=i;l++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - BUTTERFLY USING STAR
	 * @patternno - 20
	 */
	public static void butterflyUsingStar(int n) {
		/*
		 	*        *
		 	**      **
		 	***    ***
		 	****  ****
		 	**********
		 	**********
		 	****  ****
		 	***    ***
		 	**      **
		 	*        *
		 */
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			for(int k=1;k<=2*n-2*i;k++)
			{
				System.out.print(" ");
			}
			
			for(int l=0;l<=i;l++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=n;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			for(int k=1;k<=2*(n-i);k++)
			{
				System.out.print(" ");
			}
			
			for(int l=0;l<=i;l++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns 
	 * @pattern - SQUARE PATTERN WITH SPACE
	 * @patternno - 21
	 */
	public static void squarePatternWithSpace(int n) {
		/*
		 		****
		 		*  *
		 		*  *
		 		*  *
		 		****
		 */
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-1;j++)
			{
				if(i==1&&j<=n-1||j==1&&i<=n||i==n&&j<=n-1||j==n-1&&j<=n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}
	}
	/**
	 * @author - Satyam Choudhary
	 * @desc - Helper class to create patterns
	 * @pattern - SQUARE PATTERN WITH NUMBER
	 * @patternno - 22
	 */
	public static void squarePatternNumber(int n) {
		/*
		 		4 4 4 4 4 4 4 
				4 3 3 3 3 3 4 
				4 3 2 2 2 3 4 
				4 3 2 1 2 3 4 
				4 3 2 2 2 3 4 
				4 3 3 3 3 3 4 
				4 4 4 4 4 4 4 
		 */
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(i==1&&j<=7||i==7&&j<=7||j==1&&i<=7||j==7&&i<=7)
				{
					System.out.print("4 ");
				}
				
				else if(i==2&&j>=2&&j<=6||i==6&&j>=2&&j<=6||j==2&&i>=2&&i<=6||j==6&&i>=2&&i<=6)
				{
					System.out.print("3 ");
				}
				
				else if(i==3&&j>=3&&j<=5||i==5&&j>=3&&j<=5||j==3&&i>=3&&i<=5||j==5&&i>=3&&i<=5)
				{
					System.out.print("2 ");
				}
				
				else if(i==4&&j==4)
				{
					System.out.print("1 ");
				}
			}
			
			System.out.println();
		}
	}
}
