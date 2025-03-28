import javax.swing.JOptionPane;
import java.util.Arrays;

public class lab09
{
 public static void main(String[] args)
 {
 String[] first = {"baker","nalty","patel","alice"};
 String[] last = {"white", "brown", "reily", "hills"};
 String[] fullName;
 // Capitalizes the names in the array
 capitalizeName(first);
 capitalizeName(last);
 //Concatenates the name in first[] to the name in last[]
 fullName=concatenate(first, last);
 
 JOptionPane.showMessageDialog(null, Arrays.toString(first));
 JOptionPane.showMessageDialog(null, Arrays.toString(last));
 JOptionPane.showMessageDialog(null, Arrays.toString(fullName));
 }
 
 public static String[] capitalizeName(String[] name)
 {
   for (int i = 0; i < name.length; i++)
   {
   name[i] = name[i].toUpperCase();
   
   }
   return name;
 }
 public static String[] concatenate(String[] first, String[] last)
 {
   String[] name = new String[first.length] ;
   for (int i = 0; i < first.length; i++)
   {
     name[i] = first[i] + " " + last[i]; 
   }
   return name;
 }
}