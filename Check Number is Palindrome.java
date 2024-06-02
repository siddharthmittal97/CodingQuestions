import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int n=sc.nextInt();
        int ActualNum=n;
        int rev=0;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==ActualNum)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        
    }
}
