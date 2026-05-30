import java.util.Scanner;
import java.util.Arrays;
class ar4{
    public static void main(String []args)
    {
        Scanner x=new Scanner(System.in);
        int a[]={0,1,2,3,6,4,7};                //missing element in an array..
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=i)
            {
                System.out.println(i);
                break;
            }
        }
    }
}