import javax.swing.JOptionPane;
public class test
{
   public static void main(String[] args)
   {
     numInput= JOptionPane.showInputDialog("Input a Number ");
    int num; 
    boolean flag = false;
    
    do {
    
    try
    {
    num = Intege.parseInt(numInput);
    }
    catch(ExceptionNumberFormat e)
    {
    flag = true;
    }
    }  
   }
}