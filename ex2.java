import java.util.Scanner;
class ex2{
    public static void main(String []args)
    {
        Scanner x=new Scanner(System.in);
        System.out.print("enter light colour:");
        String a=x.nextLine();
        switch(a)
        {
            case "red":
            {
                System.out.println("stop..");
                break;
            }
            case "green":
            {
                System.out.println("goooo");
                break;
            }
            case "yellow":
            {
                System.out.println("readyyyy");
                break;
            }
            default:
            {
                System.out.println("invalid dataa");
            }

        } 
    }
}