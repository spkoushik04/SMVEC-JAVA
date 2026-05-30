import java.util.Scanner;
class 2dar{
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
        System.out.print("matrix..");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
        }

    }
}