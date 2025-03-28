import javax.swing.JOptionPane;
import java.util.Arrays;

public class workHours
{
   public static void main(String[] args)
   {
      int [][] hours = new int [][]
      {
      {3,5,7,9},
      {7,2,8,4},
      {1,8,6,2},
      {4,2,6,8},
      {2,5,4,8},
      {8,5,2,8},
      };
      
      int total = 0;
      int highest = hours[0][0];
      int lowest = hours[0][0];
      int colValue = 0;
      int row = 0;
      
      for(int i = 0; i < hours.length; i++)
      {
        for(int j = 0; j < hours[i].length; j++)
        {
            total += hours[i][j];
        } 
      }
      System.out.println(total);
      
      for(int i = 0; i < hours.length; i++)
      {
        for(int j = 0; j < hours[i].length; j++)
        {
            row = i;
            
        }        
      }
      
      
      for(int i = 0; i < hours.length; i++)
      {
         for(int j = 0; j < hours[i].length; j++)
         {
            
         }
         
      }
     
     JOptionPane.showMessageDialog(null," The total amount of hours worked by the employees is " + total);
     
      
   }
   
   
}