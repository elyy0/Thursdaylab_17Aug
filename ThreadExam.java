package question2;
public class ThreadExam
{
    public static void main(String[] args)
    {
        int fibonacciTerms = 20;
        
        FibonacciThread fibonacciThread = new FibonacciThread(fibonacciTerms);
        ReverseNumberThread reverseNumberThread = new ReverseNumberThread();

        fibonacciThread.start();														//This will call the run function of thread1 which is FibonacciThread
        try
        {
			fibonacciThread.sleep(1000);												//Giving the sleep or delay time for executing the complete fibonacci series
		}
        catch (InterruptedException e)
        {
			e.printStackTrace();
		}
        reverseNumberThread.start();													////This will call the run function of thread1 which is ReverseNumberThread
    }
}
