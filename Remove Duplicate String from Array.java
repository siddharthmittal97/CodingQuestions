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
        String arr[]=new String[n];
        sc.nextLine();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextLine();
        }
        
        // Printing the Array
         for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
        Set<String> st=new HashSet();
        for(int i=0;i<arr.length;i++)
        {
            st.add(arr[i]);
        }
        System.out.println(st);
    }
}
