import javax.swing.JOptionPane;
public class lab04
{
public static void main (String[] args)
{
 /*1. Declare your variables. You will need to account for the following
 - the number of rounds entered by the user
 - The two values for the die rolls
 - The number of times you win (your counter)
 - The number of times the computer wins (Computer counter)
 - The table to hold the die values
 and any other variable you need
 */
 String str;
 int roundNum = 0;
 int userDice = 0;
 int comDice = 0;
 int userWin = 0;
 int comWin = 0;
 String table = "";
 table += "Die Rolls\n";
 table += "Computer  You\n";
 
 //2. Set up the loop
 str = JOptionPane.showInputDialog("Please enter the number of rounds you want to play");
 roundNum = Integer.parseInt(str);
 for(int i = 0; i < roundNum; i++)
   {
 //3. In the loop simulate the die rolls
 
 
 comDice = (int) (Math.random() * 6) + 1;
  userDice = (int) (Math.random() * 6) + 1; //4. Add the values of the die rolls to the table.
 //5. Check who had won the round increment winning counter accordingly.
 if (comDice > userDice) /*the computer wins */
 {
 //add a message here
 JOptionPane.showMessageDialog(null, "You rolled " + userDice + " and the computer rolled " + comDice + "\n" + "The computer wins");
 table += comDice + "                  " + userDice + "       computer wins\n";
 //increment the computer counter
 comWin++;
 }
 else if (userDice > comDice) /*you win */
 {
 //add a message here
 JOptionPane.showMessageDialog(null, "You rolled " + userDice + " and the computer rolled " + comDice + "\n" + "You win!!!");
 table += comDice + "                  " + userDice + "       you win\n";
 //increment your counter
 userWin++;
 }
 else
 {
 JOptionPane.showMessageDialog(null, "You have a tie. No Winner ....\n");
 table += "No Winner\n";
 }
 }
 //6. After the loop decide who is the winner and print the table to show the results

 if (comWin > userWin)
 {
 table += "The Computer Wins";
 }
 else if(userWin > comWin)
 {
 table += "You Win";
 }
 else{
 table += "No Winner ";
 }
   
 JOptionPane.showMessageDialog(null,table);

}
}