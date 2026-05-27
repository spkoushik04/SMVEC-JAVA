import java.util.Scanner;
class guess{
    public static void main(String []args)
    {
        Scanner x=new Scanner(System.in);
        int secret=45;
        int guess;
        do{
            System.out.print("enter a number:");
            guess =x.nextInt();
            if(secret>guess)
            {
                System.out.println("lower..");
            }
            else if(secret<guess)
            {
                System.out.println("higerr");
            }
        }
            while(secret!=guess);
            System.out.println("your number is correct...");

    }
}
