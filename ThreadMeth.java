class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            if(i==1)
            {
                yield();
            }
            System.out.println("Thread A.i= "+i);
        }
        System.out.println("Exit from A");
    }
}
class B extends Thread 
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread B.i= "+i);
            if(i==2)
            {
                stop();
            }
        }
        System.out.println("Exit from B");
    }
}
class C extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread C.i= "+i);
            if (i==1)
            {
                try
                {
                    sleep(100);
                }
                catch(Exception e)
                {     }
                System.out.println("Exit from C");
            }
        }
    }
}

public class ThreadMeth
{
    public static void main(String args[])
    {
        System.out.println("Start Thread A.");
        new A().start();
        System.out.println("Start Thread B.");
        new B().start();
        System.out.println("Start Thread C.");
        new C().start();
    }
}