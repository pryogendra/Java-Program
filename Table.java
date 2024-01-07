import java.util.*;

class Table
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();

        for(int i=0;i<=10;i++)
        {
            int mul=num*i;
            System.out.println(num+" X "+i+" = "+mul);
        }
    }
}