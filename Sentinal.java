import javax.swing.JOptionPane;
public class Sentinal
{
   public static void main (String[] args)
   {
   String input;
   int number, count = 0;
   boolean flag;
   //1. Prime reading to check for 0
   
   input = JOptionPane.showInputDialog("Please enter a number or press Q to quit");
   
   //2. set loop within entinal
   while(!input.equalsIgnoreCase("Q"))
   {
   //3A. In the loop read values and validate

   try
      {
         flag = false;
          number = Integer.parseInt(input);   
       }
      catch(NumberFormatException e)
      {
         flag = true;
       number = 0;
      }
      if(flag)
      {
      JOptionPane.showMessageDialog(null, "Error: please input a valid value");
      }
      else //4. count the number of values entered

      {
         count++;
      }// 3B read new value
      input = JOptionPane.showInputDialog("Please enter a number or press Q to quit");

   }
   
      
      
   //5. prime count at the end

     }
}  