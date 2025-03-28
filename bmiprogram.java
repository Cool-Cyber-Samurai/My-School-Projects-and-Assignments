import javax.swing.JOptionPane;
import java.util.Arrays;

public class bmiprogram
{
   public static void main(String[] args)
   {
      int size = 3;
      String[] names = new String[size];
      int nameCount = 0;
      String tempName[];
      double[] bmi = new double[size];
      double tempBMI[];
      String[] catagory = new String[size];
      String tempCatagory[];
      boolean wrongInput = false;
      String name = "";
      double height = 0;
      double weight = 0;
      double totalBMI = 0;
      String selection = "";
      boolean found = false;
      int index = 0;
      int underweight = 0;
      int ideal = 0;
      int overweight = 0;
      int obese = 0;
      String output = "";
      String table = "*** Gym Database *** \n";
      
      /* 
      First we have the user input a letter to determine what they want to do
      a to insert a new student into the database
      b to search for a student
      c to print a formatted report
      d to quit
      every other character will cause the system to do nothing 
      */
      do
      {
         selection = JOptionPane.showInputDialog("Please input a letter:" + "\n" + "a to add a student," + "\n" + "b to look up a student" + "\n" + "c to print a formated report" + "\n" + "d to quit");
         if(selection.equalsIgnoreCase("a"))
         {
         /* 
         we need to make sure that there is always room in the array for new students
         this code will increase the amount of space in the arrays when it runs out
         */
           if(nameCount >= names.length)
           {
            tempName = Arrays.copyOf(names, 2*names.length);
            names = tempName; 
            tempBMI = Arrays.copyOf(bmi, 2*bmi.length);
            bmi = tempBMI;
            tempCatagory = Arrays.copyOf(catagory, 2*catagory.length);
            catagory = tempCatagory;          
           }
           // The user inputs the student's name
           names[nameCount] = JOptionPane.showInputDialog("Please enter the student's name");
           /*
           We have to check the next two inputs to see if the inputs are accepted
           first if the inputs are numbers
           */
           do
           {
            try
            {
               height = Double.parseDouble(JOptionPane.showInputDialog("Please enter the student's height in meters"));
               wrongInput = false;
            }
            catch(NumberFormatException e)
            {
               JOptionPane.showMessageDialog(null, "Invalid input, please input a number");
               wrongInput = true;
            }
            if(height <= 0)
            {
               JOptionPane.showMessageDialog(null, "Invalid input, height cannot be zero or a negative number");
               wrongInput = true;

            }
            
            }     while (wrongInput);
           
           do
           {
            try
            {
               weight = Double.parseDouble(JOptionPane.showInputDialog("Please enter the student's weight in Kilograms"));
               wrongInput = false;
            }
            catch(NumberFormatException e)
            {
               JOptionPane.showMessageDialog(null, "Invalid input, please input a number");
               wrongInput = true;
            }
            //now if the number is 0 or a positive number
            if(weight <= 0)
            {
               JOptionPane.showMessageDialog(null, "Invalid input, weight cannot be zero or a negative number");
               wrongInput = true;

            }
            
            }     while (wrongInput);
            //we find the bmi
            bmi[nameCount] = (weight)/(height*height);
            //have to do a bit of variable changing to format it properly
            double bmiTotal = (weight)/(height*height);
            output = String.format(" Student's bmi: %,.2f" , bmiTotal);
            //we determine the catagory
            if(bmi[nameCount] < 18.5)
            {
               catagory[nameCount] = "Underweight";
               underweight++;
            }
            else if (bmi[nameCount] < 25 )
            {
               catagory[nameCount] = "Ideal";
               ideal++;
            }
            else if (bmi[nameCount] < 30 )
            {
               catagory[nameCount] = "Overweight";
               overweight++;
            }
            else
            {
               catagory[nameCount] = "Obese";
               obese++;
            }
            //add to the total bmi account we will use to solve for the average
            totalBMI += bmi[nameCount];
            //increment the name counter
            nameCount++;
            

           
            
         }
         /*
            this is for searching for a student
         */
         else if(selection.equalsIgnoreCase("b"))
         {
           name = JOptionPane.showInputDialog("Please enter the name of the student you want to view");
           //while the answer has not been found and the index is less then the name count
           while (!found && index < nameCount)
      {
      
         if (name.equalsIgnoreCase(names[index]))
         {
            found = true;
         }
         else 
         {
            index++;
         }
      }
      //this decided what to do bepending on the value of the boolean expression
      if (found)
      {
         JOptionPane.showMessageDialog(null, "Student's Name: " + names[index] + " \n"  + output + "\n" + " Student's Catagory: " + catagory[index] + "\n");
      }
      else
      {
         JOptionPane.showMessageDialog(null, names[index] + " is not in the list");
      }

 
         }
         /*
         This prints a well formated report
         bmi values are rounded to hundredths
         two decimal points
         */
         else if(selection.equalsIgnoreCase("c"))
         {
            for(int i = 0; i < nameCount; i++ )
            {
              table+= names[i] + " \n" + output + " \n" + catagory[i] + " \n" + "\n";
              
            }
            
            table+= "Underweight " + underweight + "\n";
            table+= "Ideal " + ideal + "\n";
            table+= "Overweight " + overweight + "\n";
            table+= "Obese " + obese + "\n" + "\n";
            
            JOptionPane.showMessageDialog(null, 
               String.format(table + "\n" + "Average bmi %,.2f" , totalBMI/nameCount ));
            

         }
         //This is if the user wants to quit
         else if(selection.equalsIgnoreCase("d"))
         {
            System.out.println("end program");

         }
         // this is if anything else is entered
         else
         JOptionPane.showMessageDialog(null, "Not valid please pick a letter from a to d");
         
      }while(!selection.equalsIgnoreCase("d"));
      
   }
}