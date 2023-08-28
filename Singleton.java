package question4;
class Singleton 
{
    private static Singleton instance;
    private Singleton() 
    {
        // Private constructor to prevent external instantiation
    }

    public static Singleton getInstance() throws SingletonException 
    {
        if (instance == null)
        {
            instance = new Singleton();
            return instance;
        }
        else
        {
            throw new SingletonException("Another instance of Singleton class cannot be created.");
        }
    }
}
