// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int n=sc.nextInt();
        int ActualNumber=n;
        int count=0;
        int sum=0;
        int temp=n;
        while(temp>0)
        {
            temp=temp/10;
            count++;
        }
        while(n>0)
        {
            int rem=n%10;
            sum+=Math.pow(rem,count);
            n=n/10;
        }
        System.out.println(sum);
        
        if(ActualNumber==sum)
        {
            System.out.println("yes armstrong number");
        }
        else
        {
            System.out.println("Not an armstrong number");
        }
    }
}
