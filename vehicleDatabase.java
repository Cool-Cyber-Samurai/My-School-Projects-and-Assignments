import javax.swing.JOptionPane;
import java.util.Arrays;

public class vehicleDatabase
{
/* This main method holds the Arrays and mainline logic*/
   public static void main (String[] args)
   {
      String choice = "";//holds the character the user enters
      int vDetailCount = 0;// holds how many vehicles are in the system, we never go over what we have
      String [][] vDetails = new String [50][6]; //for holding the vehicle details
      double [][] discount =  //this is for the discounts we add to the initial cost                             
                               {{8.0,2.0,2.5,5.0}, //0
                               {8.2,2.5,3.0,3.5}, //1
                               {4.6,2.9,3.3,4.5}, //2
                               {8.4,3.9,4.5,5.0},//3
                               {2.7,4.5,5.0,6.0},//4
                               {6.2,6.5,10.0,7.2}};//5
      /* Here we create a menu that the user types a letter into choose an action to do*/                         
      do
      {
         choice = JOptionPane.showInputDialog("What do you wish to do? type 'a' to enter information, type 'b' to search for cars in a catagory, type 'c' to print a report, type 'd' to quit ");
         if(choice.equalsIgnoreCase("a"))//for entering information
         {
      
            vDetailCount = fillArray(vDetails, discount, vDetailCount);//modual call for fillArray
         }
      
         else if(choice.equalsIgnoreCase("b"))//searching for vehicle information
         {
            search(vDetails, vDetailCount);// modual call for search
         }
      
         else if(choice.equalsIgnoreCase("c"))//printing full report
         {
            print(vDetails, vDetailCount);//modual call for print
         }
      
         else if(choice.equalsIgnoreCase("d"))//this quits the system
         {
            System.out.println("hi");// this quits the system
         }
      
         else
            JOptionPane.showMessageDialog(null, "Please enter a valid option");// here's if you enter any letter that isn't one of the spesified ones
      
      } while(!choice.equalsIgnoreCase("d"));// this loop will last unter d is entered into the main method
   }
   /* this fills our array with vehicle details, we need to call some other methods to fill the whole thing though*/
   public static int fillArray(String [][] vDetails, double [][] discount, int vDetailCount)
   {
      
      String selection = "";// this is for holding a variable that determing if the loop repeats
      int i = vDetailCount;// we use this to make sure we don't read the whole 50 space array, it increases each time a new vehicle is added
            do// we fill the array
            {
                  
               for(int j = 0; j < vDetails[i].length; j++)// columes are for the types of information
               {
                  if(j == 0)// make of the car
                  {
                     vDetails[i][j] = JOptionPane.showInputDialog("Please enter the make of the car");
                  }
                  if(j == 1)// model of the car
                  {
                     vDetails[i][j] = JOptionPane.showInputDialog("Please enter the model of the car");
                  }
                  if(j == 2)// body size comes in Small, Medium, full size and luxury
                  {
                     vDetails[i][j] = JOptionPane.showInputDialog("Please enter the car body type, enter small, medium, full size, or luxury").toLowerCase();
                  }
                  if(j == 3)// the year which is an int converted to a a string
                  {
                     vDetails[i][j] = readYear();
                  }
                  if(j == 4)// the price of the car which will be converted to string
                  {
                     vDetails[i][j] = readPrice();
                  }
                  if(j == 5)// the discount the car gets if it fullfills conditions goes here .See readPrice comments for more information
                  {
                     vDetails[i][j] = getDiscount( vDetails[i][3], vDetails[i][2], discount);
                  }
             
               } 
               selection = JOptionPane.showInputDialog("Do you wish to enter a Vehicle's details? enter q to end the process"); //if they want to stop they simply type  'q'
            
               i++;//increment counter
            
         
         
         
         } while(!selection.equalsIgnoreCase("q") && i < vDetails.length);// if the user hits q or the array reaches 50 the system process stops
        return i; //return the value
   }
   /* Here we get the year and convert it to a string*/
   public static String readYear()
   {
      int year = 0;
      boolean status = false; // so we can validate the input
         do
         {
            try// get the year
            {
               year = Integer.parseInt(JOptionPane.showInputDialog("please enter the year the car was made")); 
               status = false;
            }
            catch(NumberFormatException e)// check if the input is a number
            {
               JOptionPane.showMessageDialog(null, "Please input a number");// if not show message and retry
               status = true;
               continue;
            }
            if(year > 2015)// check if the number is greater then 2015
            {
               JOptionPane.showMessageDialog(null, "Please input a number less then 2016");// if so then show message and retry
               status = true;
               continue;
            }
         }while (status);// this lasts until the number is entered
      
      String output = "" + year;// convert to string
      return output; // return
   }
   
   public static String readPrice()// this gets us the price and puts it in the array
   {
      double price = 0;// initialize the price variable we will use
      boolean status = false;
         do// validate the number
         {
            try// get input
            {
               price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the car"));
               status = false;
            }
            catch(NumberFormatException e)// check if the input is a valid number
            {
               JOptionPane.showMessageDialog(null, "Please input a number");// if not then show error message and try again
               status = true;
               continue;
            }
            if(price <= 0 )// check if the number is a positive number 
            {
               JOptionPane.showMessageDialog(null, "Please input a positive number");// if not then show error message and try again
               status = true;
               continue;
            }
         }while (status);// this latss until the number is entered
       String output = "" + price;
       return output;
   }
   /*Here we get the discount we will use for getting the discount price*/
   public static String getDiscount(String year, String style , double[][] discount)
   {
   /*Initialize variables*/
      double dis = 0;
      int column = 0;
      int row = Integer.parseInt(year) - 2010;// we subract 2010 from the inputed year
      if(row < 0)// if the number is less then zero then no discount is given
      {
       dis = 1;
      }
      else{
     /*The column is determined based on what is written */
     switch(style)
     {
      case "small":
      column = 0;
      break;
      
      case "medium":
      column = 1;
      break;
      
      case "full size":
      column = 2;
      break;
      
      case "luxury":
      column = 3;
      break;
       
     }
     
     dis = discount[row][column];// we get the value of the discount %
      }
      String output = "" + dis;// we convert to string
      return output;// we return the discount

   }
   /* This  is the method that handles searching based on year or make*/
   public static void search (String[][] vDetails, int vDetailsCount)
   {
   /*Initialize the variables*/
      String choice = "";
      String report = "";
      String type = "";
      double discountPrice = 0;
      choice = JOptionPane.showInputDialog("Please enter how you want to search. Y for Year and M for Make");// we ask how they want to search for something
      if(choice.equalsIgnoreCase ("M"))// if they choose to search by make
         {
            type = JOptionPane.showInputDialog("Please enter the make you want to look up");// we ask what make they want to look for

            for(int i = 0; i < vDetailsCount; i++)// look through just the rows
            {
               if(vDetails[i][0].equalsIgnoreCase(type))// if there is a match
               {
                  discountPrice = Double.parseDouble(vDetails[i][4]) * Double.parseDouble(vDetails[i][5]);// we get the discounted price
                  report += vDetails[i][1] + "" + vDetails[i][3] + "" + vDetails[i][5] + discountPrice;  //Add details to report 
               }
         
            }
            JOptionPane.showMessageDialog(null, report);//output report
         }
     else if(choice.equalsIgnoreCase ("Y"))// if they choose to search by make
     {
      type = JOptionPane.showInputDialog("Please enter the year you want to look up"); // we ask what year they want to look for
      for(int i = 0; i < vDetailsCount; i++)// look through just the rows
      {
         if(vDetails[i][3].equalsIgnoreCase(type))// if there is a match
         {
         discountPrice = Double.parseDouble(vDetails[i][4]) * Double.parseDouble(vDetails[i][5]); // we get the discounted price
          report += vDetails[i][1] + "\n" + vDetails[i][3] + "\n" + vDetails[i][5] + "\n" + discountPrice; //Add details to report 
         }
         
      }
      JOptionPane.showMessageDialog(null, report);//output report
     }
   
     else
      JOptionPane.showMessageDialog(null, "Wrong choice");// if the leter entered isn't either y or M
      
   
   
   }
   /* Here we print out the full report formated*/
   public static void print(String[][] vDetails, int vDetailsCount)
   {
      String report = "Vehicle details Report \n";// we initialize the report
      for(int i = 0; i < vDetailsCount; i++)
      {
         for(int j = 0; j < vDetails[i].length; j++)// it runs throught the whole 2D array so two loops are needed
         {
            report += vDetails[i][j] + "\n";// add to the report
         }
      } 
      JOptionPane.showMessageDialog(null, report); // output the report 
   }
}