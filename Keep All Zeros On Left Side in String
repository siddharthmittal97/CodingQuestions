
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
        
        // Count the number of zeros
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                count++;
            }
        }

        // Create a StringBuilder to build the result
        StringBuilder result = new StringBuilder();
        
        // Append zeroes to the result
        for (int i = 0; i < count; i++) {
            result.append('0');
        }
        
        
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='0')
            {
            result.append(s.charAt(i));
            }
        }
        
         System.out.println(result);
        // Append the remaining part of the string
        //result.append(s.substring(count));
       
        // Print the modified string directly
        //System.out.println(result);
    }
}
