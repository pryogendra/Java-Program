import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
        String R_reverse="";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.next();
        int len =str.length();
        for(int i=len-1;i>=0;i--)
        {
            char ch= str.charAt(i);
            R_reverse=R_reverse+ch;
        }
        System.out.println("\nReverse String is : "+R_reverse);
    }
}