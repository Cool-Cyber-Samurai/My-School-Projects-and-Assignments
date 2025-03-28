import javax.swing.JOptionPane;
public class FindHighestLab
{
 public static void main (String[] args)
 {
 int num1, num2, num3, highest;
 num1 = getInteger();  
 num2 = getInteger();
 num3 = getInteger();
 
 highest = findHighest(num1, num2, num3);
 
 printHighest(highest);
 
 
 }
//getInteger() reads a number and returns it
 public static int getInteger()
 {
 int x = 0;
 // TODO 6: Declare any variables you need to make the loop work correctly
boolean wrongInput;

 // TODO 7: Check the program in the lab document and copy the do-while loop
 // for reading a number and make the required adjustments

 do
 {
 try 
 {
 x = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
 wrongInput = false;
 } catch(NumberFormatException e){
 JOptionPane.showMessageDialog(null,"Invalid Input. Please try again");
 wrongInput = true;
 }
 }while(wrongInput);
 return x;
 } 

public static int findHighest(int num1, int num2, int num3)
 {

 // TODO 8: Check the program in the lab document and copy if-else statement for
 // finding highest and do not forget the return statements
 if ((num1 > num2) && (num1 > num3)) {
   return num1;
 }
 else if (num3 > num2) {
 return num3;
 }
 else {
 return num2;
 }

 }
 
 public static void printHighest(int highest)
 {
 // TODO 10: Write the printing statement
 JOptionPane.showMessageDialog(null,"The highest number is " + highest);
 }
}
