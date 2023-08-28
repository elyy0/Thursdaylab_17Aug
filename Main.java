package question4;
public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Singleton firstInstance = Singleton.getInstance();
            System.out.println("First instance created successfully.");
            
            // the following lines will demonstrate the custom exception
            Singleton secondInstance = Singleton.getInstance();
            System.out.println("Second instance created successfully.");
        }
        catch (SingletonException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
