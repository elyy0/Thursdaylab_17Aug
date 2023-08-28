//Q.3 Write a program to demonstrate the chained exception in Java.
package question3;
public class ChainedExceptionDemo
{
    public static void main(String[] args)
    {
       /* try
        {
            divideByZero();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }*/
        try
        {
            // code that might throw an exception
            int[] numbers=new int[5];
            int divisor=0;
            for(int i=0;i<numbers.length;i++)
            {
                int result=numbers[i]/divisor;
                System.out.println(result);
            }
        }
        catch(ArithmeticException e)
        {
            // create a new exception with the original exception as the cause
            throw new RuntimeException("Error: division by zero", e);
        }
    }
  /*  public static void divideByZero()
    {
        try
        {
            int result = 10 / 0; // This will throw ArithmeticException
        } 
        catch(ArithmeticException ae)
        {
            // Creating a new exception with the original exception as the cause
            RuntimeException re = new RuntimeException("An error occurred during division.", ae);

            // Throwing the new exception
            throw re;
        }
    }*/
}
