import java.util.Scanner;
class DectoBin
{
    public static void main(String args[])
    {
        String num1;
        int num2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Binary no : ");
        num1=sc.next();
        System.out.println("\nBinary to decimal "+Integer.parseInt(num1,2));
        System.out.print("Enter decimal no : ");
        num2=sc.nextInt();
        System.out.println("Decimal to Binary "+Integer.toBinaryString(num2));

    }
}