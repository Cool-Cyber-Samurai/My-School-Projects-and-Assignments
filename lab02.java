import java.util.Scanner;

public class lab02
{
   public static void main(String[] args)
   {
      int daysSpent = 0;
      double roomCost = 0;
   String roomPreference;
   Scanner keyboard = new Scanner(System.in);
   System.out.println("How many days will you be spending here? ");
   daysSpent = keyboard.nextInt();
              System.out.println("What kind of room do you want? ");
      roomPreference = keyboard.next();
      char c = roomPreference.charAt(0);
   char d = roomPreference.charAt(1);
   char e = roomPreference.charAt(2);
 if (c == 'P' || c == 'p')
 {
 roomCost = daysSpent * 125.00;
 }
 else if (c == 'S' || c == 's') 
 {
  roomCost = daysSpent * 95.00;
 }
 else if (c == 'W' || c == 'w') 
 {
  roomCost = daysSpent * 75.00;
  }
  else
  System.out.println("Error, incompatiable input. Please try again");
   
   if (d == 'Y' || d == 'y')
   {
   roomCost *= 1.75;
   }
   else if(d == 'N' || d == 'n')
   {
   roomCost += 0;
   }
   else
   System.out.println("Error, incompatiable input. Please try again");

   
   if (e == 'Y' || e == 'y')
   {
   roomCost *= 3.50;
   }
   else if(d == 'N' || d == 'n')
   {
   roomCost += 0;
   }

   else
   System.out.println("Error, incompatiable input. Please try again");

   
   System.out.println("The total cost of your stay is " + roomCost);
   
   }
   
}