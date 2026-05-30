import java.util.Scanner;
class calmeth{
    public int add(int a,int b)
    {
        int c=a+b;                          //method usege of calculator.....
        return c;
    }
    public int sub(int a,int b)
    {
        int c=a-b;
        return c;
    }
    public int mul(int a,int b)
    {
        int c=a*b;
        return c;
    }
    public int div(int a,int b)
    {
        int c=a/b;
        return c;
    }
    public int mod(int a,int b)
    {
        int c=a%b;
        return c;
    }
    public static void main(String []args)
    {
        Scanner x=new Scanner(System.in);
        System.out.print("enter a number1: ");
        int a=x.nextInt();
        System.out.print("enter a number2: ");
        int b=x.nextInt();
        calmeth cm=new calmeth();
        System.out.println("addtion of two number is: "+cm.add(a,b));
        System.out.println(cm.sub(a,b));
        System.out.println(cm.mul(a,b));
        System.out.println(cm.div(a,b));
        System.out.println(cm.mod(a,b));
    }
}