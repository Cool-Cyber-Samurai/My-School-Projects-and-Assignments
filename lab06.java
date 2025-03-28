import javax.swing.JOptionPane;
import java.util.Arrays;
public class lab06
{
 public static void main(String[ ] args)
 {
 //Declarations and Initialization
 // List of names
 String[] nameList = new String[2];
 //temporary reference to be used in increasing array size
 String[] tempList;
 //integer to hold the number of names in the List
 int nameCount = 0;
 //integer to be used in insertion of new names in the list
 int index = 0;
 //The first name to be added to the list
 String name = "Tom";

 while (!name.equalsIgnoreCase("Q"))
 {
 //check for array size and double array size if required
 //TO DO: 1. Add the condition to check whether you need to increase. DONE!
 // the size of the array
 if (nameList[nameList.length- 1] !=null)
 {
 //TO DO: 2. Add the code that increases the size of the array DONE?
 tempList = Arrays.copyOf (nameList,2*nameList.length);
 nameList = tempList;
 }
 //Add name to nameList and make any updates required
 //check if first name
 if (nameList[0] == null || nameList[0].isEmpty() )
 {
 nameList[0] = name;
 }
 else //find the correct position to place the name
 {
 //TO DO: 3. initialize index to start at the beginning of the list
 index = 0;
 //TO DO: 4. Complete the condition to check find the right spot to insert the new name
 while (!(nameList[index]== null|| nameList[index].isEmpty()) && name.compareTo(nameList[index])>1 )
 {
 index++;
 }
 //make room in the array to insert name
 //TO DO: 5. Complete the for loop to make room to insert
 // the new name in the right position
 for (int i = 1; i < index ; i--)
 {
 nameList[i] = nameList[i-1];
 }
 //TO DO: 6. Add the new name to the list
 nameList[index] = name;
 }
 //TO DO: 7. Increment the name counter
 nameCount++;

name = JOptionPane.showInputDialog("Enter name or Q to quit");
 }
 JOptionPane.showMessageDialog(null, Arrays.toString(nameList));
 }
}