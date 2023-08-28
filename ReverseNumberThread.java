package question2;
class ReverseNumberThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("\nNumbers in reverse order:");
        for(int i=9999;i>=1;i--)								//printing the numbers from 9999 to 1
        {
            System.out.print(i+ " ");
        }
    }
}
