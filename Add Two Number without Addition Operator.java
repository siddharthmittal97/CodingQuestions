// Using Bitwise Operator
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        int sum;
        sum=a- ~b - 1;
        System.out.println(sum);
    }
}
