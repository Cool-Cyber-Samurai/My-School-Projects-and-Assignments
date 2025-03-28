import javax.swing.JOptionPane;
public class lab05 {
 public static void main(String[] args) {

 // Step 1: Set any constants needed for the program
 final int NUM_GRADES = 35;
 final double MINIMUM_GRADE = 0.0;
 final double MAXIMUM_GRADE = 100.0;

 // Step 2: Create two parallel arrays, one will hold student’s name another will hold student’s score.
 String [ ] studName = new String[NUM_GRADES];
 double [ ] studScore = new double[NUM_GRADES];
 double studCount = 0;
 double totalGrade = 0;
 double averageGrade = 0;
 String highestName = "";
 double max = 0;
 int i = 0;

 // Step 3: prompt user for both inputs(name and score). Partially fill the array as long as user wants. Stop taking inputs when user press ‘-1’
 while( i <= NUM_GRADES) 
 {
  studName [i] = JOptionPane.showInputDialog("Enter the Student Name");
  if(studName[i].equals("-1"))
  break;
  
  studScore [i] = Double.parseDouble(JOptionPane.showInputDialog("Enter the Score"));
  studCount++;
  totalGrade += studScore[i];
  

  if (studScore[i] > max )
   {
   highestName = studName[i];
   max = studScore[i];
   }
     i++;

     }
 
 // Step 4: Find the average grade
 averageGrade = totalGrade / studCount;

 // Step 5: Find the highest grade and the name of the student
 
 // Step 6: Output the average grade, the highest grade and the name of highest-grade recipient.
 JOptionPane.showMessageDialog(null, "Average Score " + averageGrade + "\n" + "Highest Score " + max + "\n" + highestName + " earned the highest score");
 }
}