// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
class HelloWorld {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextLine();
        }
        
        // Length of Strings in an array
         for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i].length());
        }
        
    }
}
