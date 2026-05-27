import java.util.Scanner;
class cal{
    public static void main(String []args)
    {
        Scanner x=new Scanner(System.in);
        System.out.print("enter a first number:");
        int a=x.nextInt();
        System.out.print("enter a second number:");
        int b=x.nextInt();
        System.out.print("enter a opertor:");
        char k=x.next().charAt(0);
        switch(k){
        case '+':
            System.out.println("add = "+(a+b));
            break;
            case '-':
            System.out.println("sub = "+(a-b));
            break;
            case '*':
            System.out.println("mul = "+(a*b));
            break;
            case '/':
            System.out.println("div = "+(a/b));
            break;
            case '%':
            System.out.println("div = "+(a%b));
            break;
            default:
            System.out.println("invaliddd");

        }

    }
}