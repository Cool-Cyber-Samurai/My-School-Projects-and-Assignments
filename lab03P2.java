import javax.swing.JOptionPane;


public class lab03P2
{
   public static void main(String[] args)
   {
      int m;
      int n;
      
      m = 
         Integer.parseInt(JOptionPane.showInputDialog("Please Enter a Number"));
         m = Inter
         
      n = 
         Integer.parseInt(JOptionPane.showInputDialog("Please Enter Another Number"));
         
      if(n > m)
      {
      int temp = m;
      m = n;
      n = temp;
      }
      
      while(m<=n)
      {
         if(m % 7 == 0)
         {
            JOptionPane.showMessageDialog(null, m);
         }
         m+=1;
      }
   }
}