/*
	File Name: Shape.java
	Name: Victor Duan
	Class: ICS3U1
	Date: April 3, 2013
	Description:The program asks the user to enter a type of shape to draw and the dimensions
				   The program makes sure that all choices and dimensions are within certain bounds
					The program will then draw the desired shape
					The program will run so long as the user wants to continue
					When the user no longer wishes to continue, the program will output
					the number of times each shape has been drawn
*/

   import java.util.*;

    public class Shape {
       public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);
      
		//reRun is initialized as 'y' to enter the loop at least once
		//must be done since a while loop is being utilized
         int shapeChoice, length, height, width;
			int starNoTri;
			int bottomRowNo, spaceNo, spaceNoOneSide;
         char reRun = 'y';
      
      //keeps track of how many of that shape have been drawn
         int rowCount = 0;
         int columnCount = 0;
         int rightCount = 0;
         int isosCount = 0;
         int recCount = 0;
      
      //constants for number option of drawing
         final int HORI = 1;
         final int VERTI = 2;
         final int RECT = 3;
         final int RIGHT = 4;
         final int ISOS = 5;
      
		//constants for the maximum choices the user can enter
         final int MINCHOICE = 1;
         final int MAXCHOICE = 5;
         final int MINDIMEN = 1;
         final int MAXDIMEN = 20;
		
		//constants for continuing or not, and for characters used to draw
         final char YESLOW = 'y';
         final char YESCAP = 'Y';
         final char NOLOW = 'n';
         final char NOCAP = 'N';
         final char STAR = '*';
			final char SPACE = ' ';
      
		//first welcome message is only displayed once
		//placed outside loop to do so
			System.out.println("Welcome to the Shape Generator:");
			
		//condition for running the drawing portion of the program
         while (reRun == YESLOW || reRun == YESCAP) {
            
			//resets the number of stars for the triangle
			//to the value needed in the first row
			//done at start of loop since this value needs to be reset for both
			//the right and isosceles triangle
				starNoTri = 1;
				
			//prints out options for the user
				System.out.println("\nThis program draws the following shapes:");
            System.out.println("1)  Horizontal Line");
            System.out.println("2)  Vertical Line");
            System.out.println("3)  Rectangle");
            System.out.println("4)  Left slant right angle triangle");
            System.out.println("5)  Isosceles triangle");
        
			//gets user's choice
            System.out.print("Enter you choice (1-5): ");
            shapeChoice = sc.nextInt();
         
			//checks to makes sure the user enters a valid choice\
			//repeats until the user does
            while (shapeChoice < MINCHOICE || shapeChoice > MAXCHOICE) {
               System.out.print("\nInvalid choice! ");
               System.out.println("Your choice must be between 1 and 5.");
               System.out.print("Enter you choice (1-5): ");
               shapeChoice = sc.nextInt();
            }
         
			//creates blank line for visual purposes
				System.out.println("");
				
			//runs when user wants to draw horizontal line
            if (shapeChoice == HORI) {
            
				//gets length of line from user
               System.out.print("Enter the length of the horizontal line (1-20): ");
               length = sc.nextInt();
            
				//makes sure length is valid
               while (length < MINDIMEN || length > MAXDIMEN) {
                  System.out.print("\nInvalid dimension! ");
                  System.out.println("The dimension must be between 1 and 20.");
                  System.out.print("Enter the length of the horizontal line (1-20): ");
                  length = sc.nextInt();
               }
				
					System.out.println("\nHere is the horizontal line:");

				//draws the horizontal line
               for (int i = 0; i < length; i++){
                  System.out.print(STAR);
               }
            
				//creates a space for visual purposes
				//increases the counter for # of horizontal lines drawn
					System.out.println("");
               rowCount++;
            } 
				
			//runs when user wants to draw a vertical line
            else if (shapeChoice == VERTI) {
				
				//gets height of vertical line
					System.out.print("Enter the length of the vertical line (1-20): ");
					height = sc.nextInt();
					
				//makes sure the input is valid
					while (height < MINDIMEN || height > MAXDIMEN) {
						System.out.print("\nInvalid dimension! ");
                  System.out.println("The dimension must be between 1 and 20.");
                  System.out.print("Enter the length of the vertical line (1-20): ");
                  height = sc.nextInt();
					}
					
				//prints out the vertical line with the inputted height
					 for (int i = 0; i < height; i++){
                  System.out.println(STAR);
               }
				
				//increases counter for number of vertical lines drawn by 1
               columnCount++;
            }
				
			//runs when user wants to draw a rectangle
            else if (shapeChoice == RECT){
					
				//gets the length and width of the rectangle
				//each must be checked to make sure they fit the restrictions
					System.out.print("Enter the width of the rectangle (1-20): ");
					width = sc.nextInt();
					
					while (width < MINDIMEN || width > MAXDIMEN) {
						System.out.print("\nInvalid dimension! ");
                  System.out.println("The dimension must be between 1 and 20.");
                  System.out.print("Enter the width of the rectangle (1-20): ");
                  width = sc.nextInt();
					}
					
					System.out.print("Enter the length of the rectangle (1-20): ");
					length = sc.nextInt();
					
					while (length < MINDIMEN || length > MAXDIMEN) {
						System.out.print("\nInvalid dimension! ");
                  System.out.println("The dimension must be between 1 and 20.");
                  System.out.print("Enter the length of the rectangle (1-20): ");
                  length = sc.nextInt();
					}

					System.out.println("\nHere is the rectangle: ");
					
					//nested for loop prints out the rectangle
					//the inside for loop prints out a row of stars
					//the outer for loop makes the inside one repeat to print out that
					//number of columns
					for (int i = 0; i < length; i++){
						for (int j = 0; j < width; j++) {
							System.out.print(STAR);
						}
						System.out.println("");
					}
					
					//increases the counter for number of rectangles drawn
					recCount++;
            }
				
			//runs if used want to draw a left slant right angle triangle
            else if (shapeChoice == RIGHT){
					
					//gets the height of the triangle the user wants
					//checks and makes sure the height fits within the restrictions
					System.out.print("Enter the height of the left slant right angle triangle (1-20): ");
					height = sc.nextInt();
					
					while (height < MINDIMEN || height > MAXDIMEN) {
						System.out.print("\nInvalid dimension! ");
                  System.out.println("The dimension must be between 1 and 20.");
                  System.out.print("Enter the height of the left slant right angle triangle (1-20): ");
                  height = sc.nextInt();
					}
				
				//in a row, the number of spaces plus the number of stars is equal to the height
				//so to find the number of spaces, it is the height minus the number of stars
					spaceNo = height - starNoTri;
					
				//outer for loop starts a new row to print
				//first for loop inside prints the number of spaces in the row
				//second for loop inside prints the number of stars in the row
					for (int i = 0; i < height; i++){
						for (int j = 0; j < spaceNo; j++){
							System.out.print(SPACE);
						}
					
						for (int k = 0; k < starNoTri; k++) {
							System.out.print(STAR);
						}
						
						//the number of stars increases by 1 for every new row
						//the number of spaces decreaes by 1 for every new row
						System.out.println("");
						starNoTri++;
						spaceNo--;
					}
					
					//increases the counter for number of right triangles drawn
					rightCount++;
            }
				
				//runs if user wants to draw an isosceles triangle
            else if (shapeChoice == ISOS){
					
					//gets the height of the triangle from the user
					System.out.print("Enter the height of the isosceles triangle (1-20): ");
					height = sc.nextInt();
					
					//makes sure height is a valid number
					while (height < MINDIMEN || height > MAXDIMEN) {
						System.out.print("\nInvalid dimension! ");
                  System.out.println("The dimension must be between 1 and 20.");
                  System.out.print("Enter the height of the isosceles triangle (1-20): ");
                  height = sc.nextInt();
					}
					
					//determines the number of spaces on one side of the triangle
					//it is possible to do these calculations within the for loop condition
					//however, I believe this would be easier to change if the program were to be modified
					//I also do not like calculations to be within the for loop condition
					spaceNo = 2 * height - starNoTri;
					spaceNoOneSide = spaceNo / 2;
					
					//outer loop keeps track of the number of rows
					//first inner loop prints out the spaces that come before the stars
					//second inner for loop prints out the stars
					for (int i = 0; i < height; i++) {
					
						for (int j = 0; j < spaceNoOneSide; j++) {
							System.out.print(SPACE);
						}
						
						for (int k = 0; k < starNoTri; k++){
							System.out.print(STAR);
						}
						
						//creates new line to start new row
						System.out.println("");
						//changes the number of stars and spaces in the subsequent row
						starNoTri = starNoTri + 2;
						spaceNo = 2 * height - starNoTri;
						spaceNoOneSide = spaceNo / 2;

					}
					//increases the counter for numebr of isosceles triangles drawn
					isosCount++;
            }
         	
				//gets whether the user wants to continue or not
				//first sc.nextLine makes it so that entered letter is actually read
				sc.nextLine();
            System.out.print("\nWould you like to draw another one (y/n)? ");
            reRun = sc.nextLine().charAt(0);
         	
				//runs when the user's input is not valid
				//will repeat until the user decides to enter a valid choice
            while ((reRun != YESLOW) && (reRun != YESCAP) && (reRun != NOLOW) && (reRun != NOCAP)) {
               System.out.print("\nInvalid input! ");
               System.out.println("Your input must be 'y' or 'n'.");
               System.out.print("Would you like to draw another one (y/n)? ");
               reRun = sc.nextLine().charAt(0);
            }
				
         }//ends overarching drawing loop
      
		//final output
		//Outputs the number of times each shape has been drawn
		System.out.println("\nHere is a summary of the shapes that are drawn.\n");
		
		System.out.println("Horizontal Line                \t" + rowCount);
		System.out.println("Vertical Line                  \t" + columnCount);
		System.out.println("Rectangle                      \t" + recCount);
		System.out.println("Left slant right angle triangle\t" + rightCount);
		System.out.println("Isosceles triangle             \t" + isosCount);
		
		System.out.println("\nThank you for using Shape Generator.  Good Bye!!");

      }
   }