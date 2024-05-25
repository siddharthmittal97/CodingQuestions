// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class HelloWorld 
{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        
        // Imp Note using s.length() as it's a String & chatAt(i)
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                count++;
            }
        }
        System.out.println("count number of zeros"+count);

        // we are creating a String builder
        StringBuilder result = new StringBuilder();
        for(int i=0;i<count;i++)
        {
            result.append('0');
        }
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='0')
            {
                result.append(s.charAt(i));
            }
        }
         System.out.println(result);
    }
}
