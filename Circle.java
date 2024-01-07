import java.util.Scanner;

class Circle
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter yhe radius of the circle : ");
        float r=sc.nextFloat();
        float area=3.14f*r*r;
        float peri=3.14f*2*r;
        System.out.println("\nArea of the circle is : "+area);
        System.out.println("\nPerimeter of the circle is : "+peri);
    }
}