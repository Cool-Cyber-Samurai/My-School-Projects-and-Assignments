import javax.swing.JOptionPane; //to get the way we will be inputing the values

public class Calculator
{
 public static void main(String[] args)
 {
 String str; //Reading input
 double num1;     //Get Number 1
 String operator;   //Get operator
 double num2;     //Get Number 2
 String type;       //Get Solution type
 double solution = 0;
 
 //Get first number
 str =
   JOptionPane.showInputDialog("Enter first number ");
   num1 = Double.parseDouble(str);
 //Get operator  
 operator =
   JOptionPane.showInputDialog("What operator do you want? ");
 //Get Second number  
   str =
   JOptionPane.showInputDialog("Enter second number ");
   num2 = Double.parseDouble(str);
//Get Solution type
   type =
   JOptionPane.showInputDialog("What type of  solution do you want? I for integer or D for decimal? ");
   
   //Determining operator type
   switch (operator)
   {
   case "+": solution = num1 + num2; break;
   case "-": solution = num1 - num2; break;
   case "*": solution = num1 * num2; break;
   case "/": solution = num1 / num2; break;
   case "%": solution = num1 % num2; break;
   case "^": solution = Math.pow(num1, num2); break;
   default: JOptionPane.showMessageDialog(null, "Invalid solution " ); //Return this if the integer is not one of the 6 approved ones
   }
  
  //determine the type of solution wanted and output solution
  if (type.equals("d") || type.equals("D"))
   {
   JOptionPane.showMessageDialog(null,"The solution is "+String.format("%.2f",(solution)));
   }
   else if (type.equals("i") || type.equals("I"))
   {
   JOptionPane.showMessageDialog(null,"The solution is "+String.format("%.0f",(solution)));
   }
   else
   JOptionPane.showMessageDialog(null, "Invalid solution " ); //return this if the entered letter is not either an I or a D
   
   System.exit(0);

 }
}