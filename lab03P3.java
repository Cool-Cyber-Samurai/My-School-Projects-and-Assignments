import javax.swing.JOptionPane;

public class lab03P3
{
   public static void main(String[] args)
   {
     String type, violence;
     
     type = JOptionPane.showInputDialog("what type of book do you want?");
     
     if(type == "Mystery")
     {
     JOptionPane.showMessageDialog(null, "The book should be stocked on the 1st Floor");
     }
     else if(type = "Action")
     {
     violence = JOptionPane.showInputDialog("Does the book have violence in it?");
     if(violence.equals("violence"))
     {
     JOptionPane.showMessageDialog(null, "The book should be stocked on the 2nd Floor, Left Wing");
     }
     else if("No")
     {
     JOptionPane.showMessageDialog(null, "The book should be stocked on the 2nd Floor, Right Wing");
     }
     
     } 
   }
}