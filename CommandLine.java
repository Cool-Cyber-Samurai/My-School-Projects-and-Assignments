public class CommandLine
{
   public static void main(String[] args)
   {
      if(args.length == 0)
      {
         System.out.println("This program needs at least one argument!!");
         System.exit(0);
      }
      for(int i = 0; i <args.length; i++)
      if (Palindrome(args[0]))
      {
         System.out.println(args[i] + " is a palindrome"); //the word is a paliindrome
      }
      else
      {
         System.out.println(args[i] + " is not a palindrome"); //the word is not a paliindrome

      }
   }
   public static boolean Palindrome(String p)
   {
      for(int i = 0; i < p.length(); i++)
      {
         {
            if (p.charAt(i) != p.charAt(p.length() -1 - i))
            {
               return false;
            }
         }
         return true;
      }
   }
}