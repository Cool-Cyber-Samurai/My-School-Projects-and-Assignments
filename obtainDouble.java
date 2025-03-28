import javax.swing.JOptionPane;

public class obtainDouble
{
   public static void main(String[] args)
   {
      double d = getDouble();
      System.out.println(d);
   }
   
   public static double getDouble()
   {
      double num = 0.0;
      boolean stat=false;
      
      do
      {
         try
         {
            stat = false;
            num = Double.parseDouble(JOptionPane.showInputDialog("Enter num"));
            
         }
         
         catch(NumberFormatException e)
         {
            stat = true;
            JOptionPane.showMessageDialog(null, "Error");
            continue;
            
         }
         
         if(num <= 0)
         {
            stat = true;
            JOptionPane.showMessageDialog(null, "Error");
            continue;
            
         }
      } while (stat);
      return num;
   }
}