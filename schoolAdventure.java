import javax.swing.JOptionPane;
public class schoolAdventure
{
   public static void main (String[] args)
   {
   String decision = "";
   
   JOptionPane.showMessageDialog(null, "Teacher: Andrew can you go to the computer room and tell the the lady there we need help?");
  decision = JOptionPane.showInputDialog(" Andrew: Hmm, should I do this task for her? ");
      if(decision == "n" || decision == "N")
      {
      JOptionPane.showMessageDialog(null, " Andrew: I gotta figure out what this means so I can't just go on an adventure");
      JOptionPane.showMessageDialog(null, " Andrew: Sorry Teacher I'm a bit busy right now looks for sources for the paper");
      JOptionPane.showMessageDialog(null, " Teacher: Thats ok dear I know your doing something importaint, would you mind doing this Ryuji?");
      JOptionPane.showMessageDialog(null, " Ryuji: You can count on me teach");

      }   
  }
}