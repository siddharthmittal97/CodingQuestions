import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();
        String Updated=s.replaceAll("[^0-9a-zA-Z]","");
        System.out.println(Updated);
    }
}
