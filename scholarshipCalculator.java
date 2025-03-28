import javax.swing.JOptionPane;

public class scholarshipCalculator
{
   public static void main(String[] args)
   {
   //first we initialize all variables at the top of the program, that way the scope of the variables encompeses the entire program
      int creditHours;
      double gpa;
      double hhIncome;
      String repeat = " ";
     
      int studCount = 0;
      int validCount = 0;
      double scholarship = 0;
      double totalSchol = 0;
      double scholAverage = 0;
      
      //Now we start the program proper
     do{
     //First we need to have the user input each of the three variables used in validation
      try
      {
         creditHours = Integer.parseInt(JOptionPane.showInputDialog("Enter the credit hours taken"));
         
      }
      //Now we need to validate each input to make sure it fits the the data type
      catch(NumberFormatException e)
      {
      JOptionPane.showMessageDialog(null, "Invalid credit hours");
      repeat = "y";
      continue;
      }
      //we do this for every input
      try
      {
        gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter GPA"));
 
      }
      catch(NumberFormatException e)
      {
      JOptionPane.showMessageDialog(null, "Invalid GPA");
      repeat = "y";
      continue;
      }
      //now we need to make sure that the gpa is not over 4.0
       if(gpa > 4.0)
       {
       JOptionPane.showMessageDialog(null, "Invalid GPA");
       repeat = "y";
       continue;
       }  
       try
       {
         hhIncome = Integer.parseInt(JOptionPane.showInputDialog("Enter your house hold income"));  
       }
       catch(NumberFormatException e)
       {
       JOptionPane.showMessageDialog(null, "Invalid Household Income");
       repeat = "y";
       continue;
       }    
     //now we see whether the student is valid for a scholarship
     //the first is if the student is not valid
     if (creditHours < 60 || gpa < 3.0 || hhIncome > 50000)
     {
      studCount++;
      JOptionPane.showMessageDialog(null, "The student is not valid for a scholarship");
      repeat = JOptionPane.showInputDialog("Do you wish to input another student? y for continue and any other key to end ");
      if(repeat.equalsIgnoreCase("y"))
         continue;
      else
         break;
     }
     //this is if the student is valid
     else
     {
     //this determines how much money is in your scholarship depending on your gpa
         studCount++;
         validCount++;
         if(gpa >= 3.0 && gpa <= 3.24)
         {
           scholarship = 100000 * (gpa/100); 
         }
         else if(gpa >= 3.25 && gpa <= 3.49)
         {
            scholarship = 125000 * (gpa/100);
         }
         else if(gpa >= 3.5 && gpa <= 3.74)
         {
            scholarship = 150000 * (gpa/100);
         }
         else if(gpa >= 3.75 && gpa <= 4.0)
         {
            scholarship = 175000 * (gpa/100);
         }
         totalSchol += scholarship;
         JOptionPane.showMessageDialog(null, String.format ("The student is valid for a scholarship, the amount is $%,.2f " ,  scholarship));
         repeat = JOptionPane.showInputDialog("Do you wish to input another student? y for continue and any other key to end ");

         
         
     } 
     //this checks if the user inputed a y for repeat
     }while(repeat.equalsIgnoreCase("y"));
      //now we determine the average
     scholAverage = totalSchol / validCount;
     //this outputs the formated result
     JOptionPane.showMessageDialog(null, "You entered in " + studCount + "," + validCount + " of which are eligable for a scholarship, " + String.format (" The total amount of money spent on scholarships is $%,.2f " , totalSchol) + String.format (" and the average of all scholarships is $%,.2f " , scholAverage));

      
   }
}