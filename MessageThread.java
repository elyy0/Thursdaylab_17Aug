//Q.1  Write a program that creates 2 threads - each displaying a message (Pass the message as a parameter to the constructor). The threads should display the messages continuously till the user presses ctrl+c.
//Files are MessageThread.java, ThreadExample.java
package question1;
public class MessageThread extends Thread 
{
	    private String message;
	    public MessageThread(String message) 
	    {
	        this.message = message;
	    }
	    @Override
	    public void run() 
	    {
	        try
	        {
	            while(true)
	            {
	                System.out.println(message);
	                Thread.sleep(1000); 									// Adjust the sleep time as needed
	            }
	        } 
	        catch (InterruptedException e) {
	        																// Thread was interrupted, which means the program is terminating
	        }
	    }
}
