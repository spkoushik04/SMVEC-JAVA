import java.util.Scanner;
class ardi{
    public static void main(String []args)
    {
        Scanner x=new Scanner(System.in);
        System.out.print("size of rows: ");
        int r=x.nextInt();
        System.out.print("size of columns: ");
        int c=x.nextInt();
        int a[][]=new int[r][c];
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=x.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            //int sum=0;
            for(int j=0;j<c;j++)
            {
                //sum=sum+a[i][j];
                System.out.println(a[0][0]);
                System.out.println(a[1][1]);
                System.out.println(a[2][2]);
            }
            //System.out.println(sum);
        }
        System.out.println("matrix..");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}