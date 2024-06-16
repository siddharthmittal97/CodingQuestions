import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class HelloWorld 
{
  public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String words[]=s.split(" ");
        for(String word:words)
        {
            System.out.println(word.length());
        }
        
    }
}
