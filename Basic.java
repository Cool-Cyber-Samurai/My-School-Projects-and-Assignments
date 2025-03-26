public class Basic
{
   public static void main (String[] args)
   {
    final int SIZE = 4;
    int [ ] intArray = {2,5,7,8};
    int sum = 0;
    for(int i = 0; i < SIZE; i++)
    {
      sum +=intArray[i];
    }
   System.out.println("sum = " + sum);
   int min = intArray[0];
   int max = intArray[0];
   for (int i = 1; i<intArray.length; i++)
   {
     //minimum
      if(intArray[i] < min)
      {
         min = intArray[i];
      }
      //maximum
      if(intArray[i] > max)
      {
         max = intArray[i];
      }
      System.out.println("Sum = " + sum);
      System.out.println("Maximum = " + max);
      System.out.println("Minimum = " + min);

     for (int e : intArray)
      System.out.println(e);

   }
   }
}