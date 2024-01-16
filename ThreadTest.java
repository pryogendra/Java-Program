class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Thread A : "+i);
        }
        System.out.println("Exit from A");
    }
}
class B extends Thread 
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Thread B : "+i);
        }
        System.out.println("Exit from B");
    }
}
class C extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Thread C : "+i);
        }
        System.out.println("Exit from C");
    }
}

public class ThreadTest
{
    public static void main(String args[])
    {
        new A().start();
        new B().start();
        new C().start();
    }
}