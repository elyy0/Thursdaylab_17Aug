//Q.2 Write a JAVA program which will generate the threads: 1.To display 20 terms of Fibonacci series. 2.To display 1 to 9999 in reverse order.
//It have 3 files FibonacciThread.java, ReverseNumberThread.java, ThreadExam.java
package question2;
class FibonacciThread extends Thread
{
    private int n;
    public FibonacciThread(int n) {
        this.n = n;
    }
    @Override
    public void run()
    {
        int prev=0,curr=1;									//initial values of fibonacci series
        System.out.println("Fibonacci Series:");
        for(int i=0;i<n;i++)
        {
            System.out.print(prev+ " ");
            int next=prev+curr;
            prev=curr;
            curr=next;
        }
    }
}
