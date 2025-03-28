import javax.swing.JOptionPane;
public class FinancialAid {
 public static void main(String[] args) {
 final int NUM_MIN_DEPENDENTS = 0;
 final int NUM_MAX_DEPENDENTS = 9;
 int dependentNum ;
 double aid;
 
 dependentNum = getDependents(NUM_MIN_DEPENDENTS, NUM_MAX_DEPENDENTS);
 aid = aidEarned(dependentNum); 

 /* #1: Create code that will call the method you created in #3 below to
get the number of dependents,
 * factoring in the minimum and maximum number of dependents
allowed
 */

 /* #2: Create code that will call the method you created in #4 below to
calculate the amount of aid
 * that will be earned based on the number of dependents gathered.
 */
 printFinancialAid(aid);
 }

 /* #3: Create a method to get and return the number of dependents,

factoring in
 * the minimum and maximum number of dependents allowed
 */
 
public static int getDependents(int NUM_MIN_DEPENDENTS, int NUM_MAX_DEPENDENTS)
{
   int x = 0;
   boolean flag = false;

   do
   {
      try
      {
         x = Integer.parseInt(JOptionPane.showInputDialog("Please enter how many dependents are in the household"));
         flag = false;
      }
      catch(NumberFormatException e)
      {
         JOptionPane.showMessageDialog(null, "Invalid input, please");
         flag = true;
      }
      if (x < NUM_MIN_DEPENDENTS)
      {
      JOptionPane.showMessageDialog(null,  "Dependent cannot be negative");
      flag = true;
      }
      if (x > NUM_MAX_DEPENDENTS)
      {
      JOptionPane.showMessageDialog(null, "Dependent cannot be more then nine.");
      flag = true;
      }
   }while(flag);

   return x;
}


 /* #4: Create a method to calculate and return the amount of financial aid
that will be earned
 * based on the number of dependents gathered
 */

public static double aidEarned(int dependentNum)
{
   double aid = 0;
   if(dependentNum == 2)
   {
      aid = 1500 * 2;
      
   }
   else if(dependentNum == 3)
   {
      aid = 2500 * 3;
      
   }
   else if (dependentNum == 4)
   {
      aid = 3000 * 4;
      
   }
   else
   {   
      JOptionPane.showMessageDialog(null, "Ineligiable for financial aid");
      
   }
   return aid;
}

 public static void printFinancialAid(double aid) {
 JOptionPane.showMessageDialog(null, "The amount of financial aid your family is eligible for is: $" + String.format("%.2f", aid));
 }
}