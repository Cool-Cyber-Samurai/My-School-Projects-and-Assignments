/* 
args.length = 0, exit
<= digit <=9
parse digit
creat 2d array of size.digit
int[][] array = new int [digit][digit]
fill random number from 1-9

*/

public class Lab11
{
   public static void main(String[] args)
   {
      int digit = (Integer.parseInt(args[0]));
      int [][] dArray = new int [digit][digit];
      int [] freq = new int [9];
      String report = "";
      if (args.length <= 0)
      
      {
         System.out.println("Please enter something into the command line");
         System.exit(0);
      }
      if(args[0].equals("2") || args[0].equals("9"))
      {
         System.out.println("Please enter a number between 2 and 9");
      }
      dArray = fillArray(dArray);
      
      for(int i = 0; i < dArray.length; i++)
      {
         report += dArray[i];
         
      }
     for(int j = 0; j < dArray.length; j++)
      {
         report += dArray[j];
         
      }

      
   }
   public static int [][] fillArray(int[][] dArray)
   {
      for(int i = 0; i < dArray.length; i++)
      {
         for(int j = 0; j < dArray[i].length; i++)
         {
            dArray[i][j] = (int) (Math.random() * 9) + 1;
         }
      }
      return dArray;
   }
   public static int [] countFreq(int[][] dArray)
   {
   int [] freq = new int [9];
   
   for(int h = 0; h < 9; h++)
   {
   for(int i = 0; i < dArray.length; i++)
      {
         for(int j = 0; j < dArray[i].length; i++)
         {
           if(dArray[i][j] == h+1) 
           {
            freq[h]++;
           } 
         }
      }
    }  
return freq;
   
   }
   
   
}
