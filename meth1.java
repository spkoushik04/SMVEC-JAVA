import java.util.Scanner;
class meth1{
    public int add(int a,int b)
    {                                           //method without static you create obj..
        int c=a+b;
        return c;
    }
    public static void main(String []args)
    {
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        meth1 m=new meth1();
        System.out.println(m.add(a,b));
    }
}