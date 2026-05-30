import java.util.Scanner;
class ar1{
    public static void main(String []args)
    {
        Scanner x=new Scanner(System.in);
        System.out.print("enter a number of terms: ");
        int n=x.nextInt();
        int a[]=new int [n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            a[i]=x.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                s=s+a[i];
            }
        }
        System.out.println("your even number sum is: "+s);
    }
}