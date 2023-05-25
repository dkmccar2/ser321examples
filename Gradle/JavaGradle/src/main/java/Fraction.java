import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */
public class Fraction {

   private int numerator, denominator;

   public Fraction(){
      numerator = denominator = 0;
   }

   public void print() {
    System.out.print(numerator + "/" + denominator );
   }

   public void setNumerator (int n ){
      numerator = n;
   }

   public void setDenominator (int d) {
      denominator = d;
   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main (String args[]) {
      if (args.length == 2) {
         int argNum = 0;
         int argDenom = 0;
         try {
            argNum = Integer.parseInt(args[0]);
            argDenom = Integer.parseInt(args[1]);
            try {
               // create a new instance
               // Fraction *frac = [[Fraction alloc] init];
               Fraction frac = new Fraction();
               frac.setNumerator(argNum);
               frac.setDenominator(argDenom);
               System.out.print("The fraction is: ");
               frac.print();
               System.out.println("");

            }catch(Exception e) {
               e.printStackTrace();
            }

         } catch (Exception e) {
            System.out.println("Arguments: " + args[0] + ", " + args[1] + " must be integers.");
            System.exit(1);
         }

      }

   }
}

