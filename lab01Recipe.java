import java.util.Scanner;

public class lab01Recipe
{
   public static void main(String[] args)
   {
   double sugar = 1.5/48;
   double butter = 1.0/48;
   double flour = 2.75/48;
   double cookieNum;
   Scanner keyboard = new Scanner(System.in);
   System.out.println("What is the number of cookies you want to make?");
   cookieNum = keyboard.nextDouble();
   sugar = sugar * cookieNum;
   System.out.println(butter);
   butter = butter * cookieNum;
   flour = flour * cookieNum;
   System.out.println("You will need " + sugar + " cups of sugar, " + butter + " cups of butter and " + flour + " cups of flour to make " + cookieNum + " cookies");
   
   }

}