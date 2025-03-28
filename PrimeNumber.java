public class PrimeNumber 
{
   public static void main(String[] args)
   {
      int n = 34;
      int counter = 0;
      
      for(int i = 2; counter<100; i++)
      {
      if(isPrime(i))
      {
      System.out.println(i +"\t");
      counter++;
      }
    }
   }

   public static boolean isPrime(int num)
   {
      if (num == 2)
      {
         return true;
      }
      
      if (num <=0 || num %2 == 0)
      {
         return false;
      }
      
      int endRange = (int) Math.pow(num, 0.5);
      for (int i = 3; i<endRange; i++)
      {
         if (num%i == 0)
         {
            return false;
         }
         
         
      }
      return true;
   }
}