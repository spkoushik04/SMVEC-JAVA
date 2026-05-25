import java.util.Scanner;
class swap{
    public static void main(String []args)
    {
        Scanner x=new Scanner(System.in);
        System.out.print("enter first number:");
        int a=x.nextInt();
        System.out.print("enter second number:");
        int b=x.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("your second number is:"+a);
        System.out.println("your first number is:"+b);
    }
}