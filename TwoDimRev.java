import javax.swing.JOptionPane;
public class TwoDimRev
{
   public static void main(String[] args)
   {
      double[][] ary = new double[4][3];
      fillData(ary);
      double aryTotal = getTotal(ary);
      System.out.println("the total is" + String.format("%10.2f",aryTotal));
      double aryAverage = getAverage(ary);
      System.out.println("The average is" + String.format("%10.2f",aryAverage));
      int row = 2;
      double aryRowTotal = getRowTotal(ary, row);
      System.out.println("The row total is" + String.format("%10.2f",aryRowTotal));
      int col = 1;
      double aryColTotal = getColTotal(ary, col);
      System.out.println("The column total is" + String.format("%10.2f",aryColTotal));
      
      System.out.println("The highest in row is" + String.format("%10.2f",getRowHighest(ary, row)));
      
      System.out.println("The lowest in row is" + String.format("%10.2f",getRowLowest(ary, row)));
      printDiagonal(ary);
      
      System.out.println("Good bye");
      
   }
   public static double getRowLowest(double[][] ary, int row)
   {
      double rlowest = ary[row][0];
      for(int i = 0; i< ary[row].length; i++)
      {
         if(rlowest > ary[row][i])
         {
            rlowest = ary[row][i];
         }
      }
      return rlowest;
   }

   public static double getRowHighest(double[][] ary, int row)
   {
      double rhighest = ary[row][0];
      for(int i = 0; i< ary[row].length; i++)
      {
         if(rhighest < ary[row][i])
         {
            rhighest = ary[row][i];
         }
      }
      return rhighest;
   }
   public static void printDiagonal(double[][] ary)
   {
      String spaces = "";
      for (int i = 0; i < ary.length; i++)
      {
         spaces += "%" + (i+1)*7 + ".2f";
         for(int j = 0; j < ary[i].length; j++)
         {
            if (i == j)
            {
            System.out.println(String.format(spaces, ary[i][j]));
            }
         }
         spaces = "";
      }
   }
   
   public static double getColTotal(double[][] ary, int col)
   {
      double ctotal = 0.0;
      for(int i = 0; i < ary.length; i++)
      {
         ctotal += ary[i][col];
      }
      return ctotal;
   } 
   
   public static double getRowTotal(double[][] ary, int row)
   {
      double rtotal = 0.0;
      if(row >= ary.length)
       return -1;
      for(int i = 0; i < ary[row].length; i++)
      {
         rtotal += ary[row][i];
      }
      return rtotal;
   }
   
   public static double getAverage(double[][] ary)
   {
      double average = 0;
      if(ary.length > 0)
      {
      average = getTotal(ary)/(ary.length * ary[0].length);
      
      }
    return average;
   }
   
   public static double getTotal(double[][] ary)
   {
      double total = 0.0;
      for(int i = 0; i < ary.length; i++)
      {
         for(int j = 0; j < ary[i].length; j++)
         {
            total += ary[i][j];
         }
      }

      return total;
   }
   public static void fillData(double[][] ary)
   {
      for(int i = 0; i < ary.length; i++)
      {
         for(int j = 0; j < ary[i].length; j++)
         {
            ary[i][j] = Math.random() * 50 + 1;
         }
      }
   }
   


}