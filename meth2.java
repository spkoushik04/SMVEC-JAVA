import java.util.Scanner;
class meth2{
    public void bio(String a,String b,String c)
    {
        System.out.println("your bio data...");
    }
    public void phone(int d,int e)
    {
        System.out.println("your number...");
    }

    public static void main(String []args)
    {
        Scanner x=new Scanner(System.in);
        System.out.print("enter a name: ");
        String a=x.nextLine();
        System.out.print("enter department: ");
        String b=x.nextLine();
        System.out.print("enter a address: ");
        String c=x.nextLine();
        int d=x.nextInt();
        int e=x.nextInt();
        meth2 m=new meth2();
        m.bio(a,b,c);
        m.phone(d,e);


    }
}