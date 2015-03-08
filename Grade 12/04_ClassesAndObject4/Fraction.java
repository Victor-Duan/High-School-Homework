/*
 File Name: Fraction2.java
 Name: Victor Duan
 Class: ICS4U1
 Date: September 30, 2013
 Description: 
*/

   public class Fraction {
      private int num;
      private int den;
   
   //empty constructor
      public Fraction () {
         num = 0;
         den = 0;
      }
   //constructor taking in numerator and denominator
      public Fraction (int numerator, int denominator) {
         num = numerator;
         den = denominator;
      }
   
   //constructor that duplicates a Fraction object
      public Fraction (Fraction given) {
         num = given.num;
         den = given.den;
      }
   
   //constructor used to convert a decimal number into a fraction
      public Fraction (double realValue) {
         final char DECIMAL = '.';
         final int BASETEN = 10;
         String valueString = realValue + "";
         String rightOfDecimal;
         String leftOfDecimal;
         int decimalIndex = 1;
      
         for (int i = 0; i < valueString.length(); i++) {
            if (valueString.charAt(i) == DECIMAL) {
               decimalIndex = i;
            }
         }
      
         rightOfDecimal = valueString.substring(decimalIndex + 1);
         leftOfDecimal = valueString.substring(0,decimalIndex);
      
         if (Integer.parseInt(rightOfDecimal) == 0) {
            den = 1;
            num = Integer.parseInt(leftOfDecimal);
         }
         else {
            den = (int)Math.pow(BASETEN,rightOfDecimal.length());
            num = Integer.parseInt(leftOfDecimal.concat(rightOfDecimal));
         }
      }
   
   //accessor method
      public int getNum() {
         return num;
      }
      public int getDen() {
         return den;
      }
   //mutator method 
      public void setNum(int numerator){
         num = numerator;
      }
      public void setDen(int denominator) {
         den = denominator;
      }
   
	//method that compares two fractions to see if they are equivalent to one another
		
		public boolean equals(Fraction other) {
		
			Fraction implicit = new Fraction(this);
			Fraction explicit = new Fraction(other);
			
			implicit.reduce();
			explicit.reduce();
			
			//System.out.println(implicit.num);
			//System.out.println(implicit.den);
			//System.out.println(explicit.num);
			//System.out.println(explicit.den);
			
			return ((implicit.num == explicit.num) && (implicit.den == explicit.den));
		}
   //method that returns the size of a fraction in decimal form
      public double size() {
         return Math.abs((double)num/den);
      }
   
   //method that returns the index of the larger fraction
      public Fraction larger (Fraction other) {
         if (size() >= other.size()) {
            return this;
         } 
         else {
            return other;
         }
      }
   
   //method that multiplies two fractions
      public Fraction times (Fraction other) {
         Fraction product = new Fraction();
         product.num = num * other.num;
         product.den = other.den * den;
         return product;
      }
   
   //method that adds two fractions together
      public Fraction plus (Fraction other) {
         Fraction sum  = new Fraction();
         sum.num = num * other.den + other.num * den;
         sum.den = den * other.den;
         return sum;
      }
   
   //method that multiplies two fractions and stores the value in the implicit object
      public void timesEquals(Fraction p) {
         num *= p.num;
         den *= p.den;
      }
   
   //method that reduces fractions to its lowest form
      public void reduce() {
         for (int i = num; i >= 1; i--) {
            if ((num % i) == 0 && (den % i) == 0) {
               num /=i;
               den /=i;
            }
         }
      }
		
		public static Fraction multiply(Fraction f1, Fraction f2) {
			Fraction product = new Fraction();
			product.num = f1.num * f2.num;
			product.den = f1.den * f2.den;
			return product;
		}
		
		public static Fraction absVal (Fraction f1) {
			Fraction abs = new Fraction();
			abs.num = Math.abs(f1.num);
			abs.den = Math.abs(f1.den);
			return abs;
		}
		
		public static boolean isPositive (Fraction f) {
			return (f.num >= 0 && f.den >= 0); 
		}
   }
