import javax.swing.JOptionPane;
import java.util.Arrays;

public class Lab112D
{
 public static void main(String[] args)
 {
 double[][] data = new double [5][3];
 double total = 0.0;
 double[] highest;

 fillData(data);
 total = getTotal(data);
 highest = getHighest(data);
 printHighest(data, highest);

 }
 
 public static double[][] fillData(double[][] data)
 {
   for(int i = 0; i < data.length;  i++)
   {
      for(int j = 0; j < data[i].length;  j++)
      {
        data[i][j] = (int) (Math.random() * 100) + 1;
      }
   }
   return data;
 }
 
 public static double getTotal(double[][] data)
 {
   double total = 0.0;
   for(int i = 0; i < data.length; i++)
   {
      for(int j = 0; j < data[i].length; j++)
      {
         total += data[i][j];
      }
      
   }
   return total;
 }
 public static double[] getHighest(double[][] data)
 {
  double[] highest = new double [2];
   for(int i = 0; i < data.length; i++)
   {
      for(int j = 0; j < data[i].length; j++)
      {
         if(data[i][j] > highest[])
         {
            highest = data[i][j];
         }
      }
   }
   return highest;
 }
 public static void printHighest(double[][] data, double[] highest)
 {
   JOptionPane.showMessageDialog(null, data + " " + " The highest number in the array is " + highest);
 }
 
}