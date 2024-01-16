class X implements Runnable
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Thread X : "+i);
        }
        System.out.println("Exit from X");
    }
}

public class Test
{
    public static void main(String args[])
    {
        X x1=new X();
        Thread t=new Thread(x1);
        t.start();
        System.out.println("End of main Thread.");
    }
}