public class larg {
    public static void main(String[] args) {
        // Your Code goes here!;
        int arr[]={35,47,68,87,87};
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]!=arr[i+1])
            {
              System.out.println(arr[i]);
                break;
            }
        }

    }
}