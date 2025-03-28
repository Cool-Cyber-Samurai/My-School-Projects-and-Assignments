import javax.swing.JOptionPane;
public class QUIZ
{
   public static void main(String[] args)
   {
      int studNum = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of students"));
      String[] studName = new String[studNum];
      float[] studMark = new float[studNum];
      String input;
            
      for (int i = 0; i<studNum; i++)
      {
       studName[i] = JOptionPane.showInputDialog("Enter the student name");
       input = JOptionPane.showInputDialog("Enter the student mark");
       boolean flag = false;//correct input
       do
       {
       try{
       studMark[i] = Float.parseFloat(input);
       }
       catch(NumberFormatException e){
         JOptionPane.showMessageDialog(null, "Invalid mark");
         flag = true;//wrong input
       }
       }while(flag);
       
       
       

      }
   }
}