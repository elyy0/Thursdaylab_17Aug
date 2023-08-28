//Q.4 Write a Java program which creates only one object. If user attempts to create second object, he should not be able to create it. (Using user defined Exception).
//Files are SingletonException.java, Singleton.java, Main.java
package question4;
class SingletonException extends Exception 
{
    public SingletonException(String message)			//Creating constructor who will throw the message in parameter
    {
        super(message);
    }
}
