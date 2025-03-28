import javax.swing.JOptionPane;


public class gradebook
{
   public static void main(String[] args)
   {
      final int MIN_GRADE = 0;
      final int MAX_GRADE = 100;
      final int [] MIN_GRADES = {90, 80, 70, 0};
      final char[] LETTER_GRADES = {'A', 'B', 'C', 'F'};
      final int MIN_STUDENTS = 1;
      final int MAX_STUDENTS = 100;
      
      int studNum = getStudNum(MIN_STUDENTS,MAX_STUDENTS);
      
      String[] syudName = new String[studNum];
      double[] stdPerc = new double[studNum];
      char[] studGrd = new char[studNum];
      
      getStudData (studName, stdPerc, MIN_GRADE, MAX_GRADE);
      calcLetterGrd (studPerc, studGrad, MIN_GRADES, LETTER_GRADES);
   }
   public static String getName(String msg);
   
   public static double get double(String msg)
   {
     double percentage;
     do
      {
         num = getDouble("Please input the student's percentage");
         if (percentage < min || percentage > max)
         {
         JOptionPane.showMessageDialog(null, "Invalid input, please input a number between" + min + " and " + max);

         }
      }while(percentage < 0 || percentage > 100);
      return num;
 
   }
   public static double getPerc(String msg, final int min, final int max)
   {
   int input = 0.0;
      boolean wrongInput = false;
      
      do
      {
         try
         {
            input = Double.parseDouble(JOptionPane.showInputDialog(msg));
         }
         catch(NumberFormatException e)
         {
            JOptionPane.showMessageDialog(null, "Invalid input, please input a number");
            wrongInput = true;
         }
      }while (wrongInput);

   }
   public static void getStudData(String[] sn, double[] sp, final int min, final int max)
   {
      String input = "";
      boolean wrongInput;
      
      do
      {
         input = JOptionPane.showInputDialog(msg);
         input = input.stripLeading();
         if(input.equals(""))
         {
            JOptionPane.showMessageDialog(null, "Invalid Input: Name can not be empty");
            
         }
         else
         {
            wrongInput = false;
         }
         
      }while(wrongInput);
      return input;
   }
   {
    for(int i = 0; i<sn.length; i++)
    {
      sn[i] = getName("please enter the student name");
      sp[i] = getPerc("please enter student percentag") ;   
    }
    JOptionPane
   }
   
   public static getInt(String msg)
   {
      int input = 0;
      boolean wrongInput = false;
      
      do
      {
         try
         {
            input = Integer.parseInt(JOptionPane.showInputDialog(msg));
         }
         catch(NumberFormatException e)
         {
            JOptionPane.showMessageDialog(null, "Invalid input, please input a number");
            wrongInput = true;
         }
      }while (wrongInput);
   }
   public static int getStudNum(final int min, final int max)
   {
      int num;
      do
      {
         num = getInt("Please input the number of students");
         if (num < min || num > max)
         {
         JOptionPane.showMessageDialog(null, "Invalid input, please input a number between 0 and 100");

         }
      }while(num < 0 || num > 100);
      return num;
   }
   public static void calcLetterGrd(, final double [] sp, char[] sg, final int [] minGrd, final char[] charGrd)
   {
         for(int i = 0; i < sp.length; i++)
         {
            if(sp[i] >= minGrd[0])
             sg[i] = chrGrd[0];
            else if (sp[i] >= minGrd[1])
             sg[i] = chrGrd[1];
            else if (sp[i] >= minGrd[2])
               sg[i] = chrGrd[2];
            else
               sg[i] = chrGrd[3]


            
         }
   }
}