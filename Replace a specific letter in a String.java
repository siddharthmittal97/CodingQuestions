import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class HelloWorld 
{
  public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev=" ";
        String words[]=s.split(" ");
        for(String word:words)
        {
            if(word.contains("a"))
            {
                word=word.replaceAll("a","*");
            }
            System.out.println(word);
          //IMP is word= ( as we need to store in specific value)
        }
        
    }
}
