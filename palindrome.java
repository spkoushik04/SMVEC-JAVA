import java.util.Scanner;
class palindrome{
    public static void main(String []args)
    {
        Scanner x=new Scanner(System.in);
        System.out.print("enter a number to check palindrome or not: ");
        int a=x.nextInt();
        int b=a;
        int c=0;
        while(a>0)                      //palindrome .....
        {
            int d=a%10;
            c=c*10+d;
            a=a/10;   
        }
        //System.out.println(c);
        if(b==c)
        {
            System.out.println("palindrome..");
        }
        else
        {
            System.out.println("not palindrome");
        }


    }
}