import java.util.Scanner;
class starpattern {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("enter a number: ");
        int a=x.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a-i;j++)
            {
                System.out.print(" ");  //space..
            }
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");  //star..
            }
            System.out.println();
        }

    }
}