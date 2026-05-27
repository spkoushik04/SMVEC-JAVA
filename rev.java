import java.util.Scanner;
class rev{
    public static void main(String []args)
    {
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int revs=0;
        while(a>0){
        int digit=a%10;
        revs = revs * 10 + digit;
        a=a/10;
        }
        System.out.println("reverse number: "+ revs);
        
    }
}