import javax.swing.JOptionPane;
import java.util.Arrays;
public class Percentages
{
public static void main (String[] args)
{


final int START_SIZE = 3;
String[ ] studName = new String[START_SIZE];
double [ ] score = new double[START_SIZE];
String choice = "Q";
String [ ] tempName;
double [ ] tempScore;
int index = 0;

do
{
   studName[index] = JOptionPane.showInputDialog("Enter the Student Name");
   score[index] = Double.parseDouble(JOptionPane.showInputDialog("Enter the Score"));
   index++;
   choice = JOptionPane.showInputDialog("Are there any more students?\n Please enter");
   if(index == studName.length && !choice.equalsIgnoreCase("Q"))
   {
       tempName = Arrays.copyOf(studName, 2*studName.length);
       tempScore = Arrays.copyOf(score, 2*score.length);
        studName = tempName;
        score = tempScore;
   }
}
while(!choice.equalsIgnoreCase("Q"));
}
}