import javax.swing.JOptionPane;
public class Biggest
{
   public static void main (String[] args)
   {
      int biggest, num;
      //1. Prime reading to initialize biggest
      biggest = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
      
      //2. set up the loop to read numbers - no validation
      for (int i = 0; i < 10; i++)
      {
      
      //3. In the loop read biggest number and compare biggest
      num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
      if(biggest<num)
      {
         biggest = num;
      }
      
      //4. Print biggest number
      JOptionPane.showMessageDialog(null, "Biggest is " + biggest+ " so far");
      }
      JOptionPane.showMessageDialog(null, "Biggest is " + biggest);
   }
}