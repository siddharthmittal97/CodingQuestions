import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
class HelloWorld {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        int rev[]=new int[n];
        
        sc.nextLine();
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        // reversing the array
         for(int i=0;i<arr.length;i++)
        {
            rev[i]=arr[n-i-1];
        }
        
        // printing the reverse array
         for(int i=0;i<arr.length;i++)
        {
            System.out.println(rev[i]);
        }
        
    }
}
