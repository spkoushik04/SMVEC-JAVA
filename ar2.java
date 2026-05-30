import java.util.Scanner;
class ar2{
    public static void main(String []args)
    {
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int aa[]=new int [a];
        for(int i=0;i<a;i++)
        {
            aa[i]=x.nextInt();              //reverse of a array..
        }
        for(int i=aa.length-1;i>=0;i--)
        {
            System.out.println(aa[i]);
        }
    }
}
