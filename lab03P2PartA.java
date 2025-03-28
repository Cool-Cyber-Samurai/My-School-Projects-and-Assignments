import javax.swing.JOptionPane;

public class lab03P2PartA
{
   public static void main(String[] args)
   {
      int m = 20;
      int n = 40;
      
      while(m<=n)
      {
         if(m % 7 == 0)
         {
            System.out.println(m);
         }
         m++;
      }
   }
}