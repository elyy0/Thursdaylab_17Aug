package question1;
public class ThreadExample
{
    public static void main(String[] args)
    {
        MessageThread thread1=new MessageThread("Thread 1: Hello!");
        MessageThread thread2=new MessageThread("Thread 2: Hi!");

        thread1.start();
        thread2.start();
        															// Add a shutdown hook to handle Ctrl+C
       /* Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            thread1.interrupt();
            thread2.interrupt();
            System.out.println("Program terminated.");
        }));*/

        try 
        {
        	// Wait for threads to finish
            thread1.join();
            thread2.join();
        } 
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
