import java.util.Scanner;
class unitdg {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);                   //unit digit program..
        int s=0;                                        
        System.out.print("enter a number: ");
        int a=x.nextInt();
        while(a>0)
        {
            int b=a%10;
            s+=b;
            a=a/10;
        }
        System.out.println("your number digit is:"+s);
        

    }
}