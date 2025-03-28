import javax.swing.JOptionPane;
import java.util.Arrays;

public class mortgageFormula
{
   public static void main(String[] args)
   {
   /* Initilization of variables*/
     String [] pAddress = new String [5];
     double [] pCost = new double [5];
     double intrest = 0.0;
     int term = 0;
     double [] mortgage = new double [5];
     double lowest = 0.0;
     String report = " ";
     
     /* The method calls I use for the assignment*/
     getProperty(pAddress, pCost);
    intrest = getIntrest();
    term = getTerm();
    getMortgage(mortgage, pCost, intrest, term);
    lowest = findLowest(mortgage);
    report(pAddress, pCost, mortgage, lowest);
    /* System.out.println(Arrays.toString(pAddress));
     System.out.println(Arrays.toString(pCost));
    System.out.println(intrest);
    System.out.println(term);
    System.out.println(Arrays.toString(mortgage));
    System.out.println(lowest);*/
    
   }
   
   /* This is how we get the two arrays that hold the address and cost arrays*/
   
   public static void getProperty(String[] pAddress, double[] pCost)
   {
        
   for(int i = 0; i < pAddress.length; i++)
   {
   pAddress[i] = JOptionPane.showInputDialog("Please enter address name");
   pCost[i] = readCost();
       
   }
   }
   /* This is how we fill the cost array*/
   public static double readCost()
   {
   double cost = 0;
    boolean status = false;

   do
    {
      try
      {
         cost = Double.parseDouble(JOptionPane.showInputDialog("Please enter a cost for the property"));//we enter the cost
         status = false;
      }
      catch(NumberFormatException e)
      {
         JOptionPane.showMessageDialog(null, "Please enter in a number");// if input is not a number
         status = true; //repeat
         
      }
      if(cost <= 0)
      {
         JOptionPane.showMessageDialog(null, "Please enter in a positive number"); //if number is a negative number
         status = true; //repeat
         
      }
      
      
    } while(status); 
    return cost; // this is added to the repective place in the array
    } 
    
    /* This is how we get the intrest and unlike the arrays we just need one intrest rate*/
    public static double getIntrest()
    {
      
      boolean status = false;
      double intrest = 0.0;
   do //get the intrest value
    {
      try
      {
        intrest = Double.parseDouble(JOptionPane.showInputDialog("Please enter an intrest rate between 3.5 and 7.0")); //we get the intrest rate
        status = false;
      }
      catch(NumberFormatException e)
      {
         JOptionPane.showMessageDialog(null, "Please enter in a number");// if the input is not a number
         status = true; // error message shown
         
      }
      if(intrest < 3.5 || intrest > 7.0)
      {
         JOptionPane.showMessageDialog(null, "Please enter a number including or between 3.5 and 7.0");// if the input is not between these two numbers
         status = true; // error message shown
         
      }
      
      
    } while(status); 
      
      return intrest;//return the intrest
    }
    /* This gets the amount of years the mortgage will be for */
    public static int getTerm()
    {
      boolean status = false;
      int term = 0;
    
    do
    {
      try
      { 
        term = Integer.parseInt(JOptionPane.showInputDialog("Please enter either 15, 25 or 30")); //input term
        status = false;
      }
      catch(NumberFormatException e)
      {
         JOptionPane.showMessageDialog(null, "Please enter in a number");// if the term isn't a number
         status = true; //error message shows
         
      }
      
            
      
    } while(status);
      
    
      return term;
      }
      /* This is how we get the mortage array*/
      public static void getMortgage(double [] mortgage, double[] pCost, double intrest, int term)
      {
       for(int i = 0; i < pCost.length; i++)
       {
         //mortgage[i] = readMortgage(pCost, intrest, term);
         mortgage[i] = (pCost[i] + (pCost[i] * intrest))/(12 * term);
       }  
      }
      /* This part has no purpose, just ignore it*/
      /*public static double readMortgage(double[] pCost, double intrest, int term)
      {
         double total = 0.0;
         boolean status = false;
         
         for(int i = 0; i < 5; i++)
         {
            total = (pCost[i] + (pCost[i] * intrest))/(12 * term);
            
         }
         return total;
         
      }*/
      /* This is how we get the lowest mortgage in the array*/
      public static double findLowest(double [] mortgage)
      {
         double lowest = 1000000000; // I put a very high number here because i had to initialize the variable with something and we're finding the lowest, not the highest, or at least that's how I did it
         for(int i = 0; i < mortgage.length; i++)
         {
            if(mortgage[i] < lowest ) //this asks if the mortgage in the data address is lower the the existing lowest
            {
               lowest = mortgage[i];//it's changed to current lowest if so
            }
         }
         
         return lowest; // returns the lowest value in the array
      }
      /* This will format the report and print it*/
      public static void report(String[] pAddress, double[] pCost, double [] mortgage, double lowest)
      {
         String report = "  Mortgage report \n";
         

      
         for(int i = 0; i < pAddress.length; i++)
            {
               
               
               report += pAddress[i] + " " + pCost[i] + " " + mortgage[i] + "\n";   
            }
            report += "The lowest mortgage of out of the 5 is " + lowest;
             JOptionPane.showMessageDialog(null, report);
           
      }

   }
