import java.util.Scanner;
class meth{
    public static int add(int a,int b)
    {
        int c=a+b;
        return c;
    }
    public static void main(String []args)
    {
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        System.out.println(add(a,b));
    }
}