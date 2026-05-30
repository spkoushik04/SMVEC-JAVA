import java.util.Scanner;
class ar3{
    public static void main(String []args)
    {
        Scanner x=new Scanner(System.in);
        System.out.print("enter a number of terms: ");
        int n=x.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=x.nextInt();
        }
        int k=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>k)
            {
                k=a[i];
            }

        }
        System.out.println("the largest element of array: "+k);
    }
}