import javax.swing.JOptionPane;
   public class wageCheck
   {
      public static void main(String[] args)
      {
         String[] names = {"Alice", "Bob", "Joe", "Lisa", "Marry"};
         double[] wages = {200, 360, 600, 350, 120};
            System.out.println("Employee with highest wage is" + findMaxWages(names, wages));
      }
      
      public static String findMaxWages(String [] names, double [] wages)
      {
         double highest = wages[0];
         String highestName = names[0];
         int index = 0;
         
         for(int i = 0; i < wages.length; i++)
         {
            if(wages[i] > highest)
            {
               highest = wages[i];
               index = i;
               highestName = names[i];
            }
         }
         return highestName;
      }
   }