
public class Password{
   public static String generatePassword()
   {
      String password = "";
      int x;
      for(int i = 0; i<5; i++)
      {
      x = (int)(Math.Random()*3 +1);
      switch(x)
      {
         case 1:
            password +=getSmallLetter();
            break;
            
         case 2:
            password +=getCapitalLetter();
            break;
            
         case 3:
            password += getDigitLetter();
            break;
      }
      }
   
   }
   public static String getSmallLetter()
   {
      (char)(char1 + Math.random() * (char2 – char1 + 1)

   }

}