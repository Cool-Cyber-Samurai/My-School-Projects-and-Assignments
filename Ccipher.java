public class Ccipher
{
   public static void main(String[] args)
   {
      if (args.length < 2)
      {
         System.out.println("Invalid Input: Need two argumentd!!");
         System.exit();
      }
      
      if(!args[0].equals("0") || !args[0].equals("0") )
      {
       System.out.println("Invalid Input: Enter a 0 or 1!!");
       System.exit();
      }
      String output = "";
      if(args[0].equals("0"))
       output = encrypt(args[1]);
      else
       output = decrypt(args[1]);
      
   }
   
   public static String encrypt(String pwd)
   {
      char ch;
      for (int i = 0; i<pwd.length(); i++)
         {
         ch = pwd.charAt(i);
         if(ch >='A' && ch <='Z')
         {
            ch = (char) (((int)ch - (int)'A' + 3)%26 + (int)'A');
            
         }
         encPwd;
      }
      return encPwd;
   }
}