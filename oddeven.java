import java.util.Scanner;
class oddeven{
    public static void main(String []args)
    {
        Scanner x=new Scanner(System.in);
        System.out.print("enter a number to check:"); 
        int a=x.nextInt(); 
        String b=(a%2==0)?"even":"odd";
        System.out.print(a +" is "+ b);            
        
    }
}