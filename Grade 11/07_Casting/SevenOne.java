/* 
	Victor Duan
   ICS3U1
   Question 7.1
   February 20, 2013
	This program is a help guide to determine what will be output and what will be given an error
*/

   import java.util.*;

    public class SevenOne {
       public static void main (String[] args){
      
         int i1 = 5;			//ok; default type for non-decimal is int
      //int i2 = 5.2;		//error because 5.2 is a double value, not automatically casted into int
      
         float f1 = 2;           //ok; automatic casting from int to float
         float f2 = 3.0f;        //ok; f signifies to interpret as float
      //float f2 = 3.0;		//error because 3.0 is a double value by default, not automatically casted into float
      //float f3 = 3.5;		//error because 3.5 is a double value by default, not automatically casted into float
      
         double d1 = 3.5;		//ok; default type for decimal is double
         double d2 = 2.0;		//ok
         double d3 = 4;		//ok, automatic casting from int to double
         double d4 = 3.5d;		//ok; d signifies to interpret as double
      
         i1 = (int) d1; 		//explicit casting of a double into an int
         System.out.println ("i = " + i1);	//prints i = 3
      
      //i1 = 5.0 / 9.0;	//error because float can't be automatically   // converted to int
         i1 = 5 / 9;			// division of integers yields integer
         System.out.println ("i = " + i1);	// prints i = 0
      
         f1 = (float) d1;      //ok, explicit casting of d1 from double to float
         System.out.println ("f = " + f1); // prints f = 3.5
      
      
         f1 = 5 / 9;         //division of integer yields integers, automatic casting from int to float
         System.out.println ("f = " + f1); //prints f = 0.0
      //f1 = 5.0/9.0;		//error because quotient is double value by default, can't be automcatically cast in float
         f1 = 5.0f / 9.0f; // ok, both values are float values, quotient will be a float value as well
         System.out.println ("f = " + f1); // prints f = 0.555555555555555556
      
         d1 = 3.5 / 2.6; // okay, quotient is double
         System.out.println ("d = " + d1); //prints d = 1.34615
      
         d1 = (int) 3.5 / 2.6; //okay, the 3.5 that was explicitly casted into an integer will be "promoted" to double value
         System.out.println ("d = " + d1);// prints d = 1.15384
      
         d1 = (int) (3.5) / 2.6;//okay, converts the 3.5 into int value, much like the example above
         System.out.println ("d = " + d1);// prints d = 1.15384
      
         d1 = (int) (3.5 / 2.6);//converts the quotient into an integer
         System.out.println ("d = " + d1);//prints d = 1.0
      
      //d1 = int 3.5 / 2.6;   // error because no brackets around int, improper syntax
      
      
         d1 = (int) (3.5 / 2.6); //converts the quotient into an integer, which is then automatically casted from int to double
         System.out.println ("d = " + d1);//prints d = 1.0
      
         d1 = 3.5 / (int) 2.6;//converts the 2.6 into an integer, then carries out operation
         System.out.println ("d = " + d1);// prints out d = 1.75
      
			d1 = (int) 3.5 / (int) 2.6; //both numbers convert to int, integer division occurs. Value then automatically casted into double
			System.out.println("d = " + d1);//prints out d = 1.0
			
         d1 = (float) (int) (3.5 / 2.6); //Real number division, double value. Explicitly cast into int, then explicitly cast into float, then automatically cast into double
         System.out.println ("d = " + d1);//prints out d = 1.0
       
         short smallValue = 45;	//ok, automatic casting from int to short
      //short s = 3.5;                // error because a double value is trying to be stored in short, not automcatically casted
      //smallValue = 234251434324324; //error because value is too large to fit in short value, too large to be an integer
      
         int littleValue = smallValue; //ok, short values automatically casted into int
      
         smallValue = (short) littleValue; //ok, explicit casting from little value makes it a short value
         System.out.println ("smallValue = " + smallValue); //prints smallValue = 45
         smallValue = (short) 234251434; //ok, though value is too large, explicit casting from int to short takes place
         System.out.println ("smallValue = " + smallValue); //prints out smallValue = 25770, unknown unless knowledge of binary is acquired
      
      //int over = 1111111111111; //error because value is too large to be stored in an int
      
         float pay = 42234.45f; //okay, explicit casting from double to float
         long bigValue = 45243224L; //okay, explicit casting from int to long
         double amount = 345.45d;//okay, value is already double, d at the end unecessary
      
      }
   }