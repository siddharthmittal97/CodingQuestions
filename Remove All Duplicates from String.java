import java.util.Scanner;
class HelloWorld 
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
        String result="";
        for(int i=0;i<s.length();i++)
        {
          String ch=""+s.charAt(i);
          if(result.contains(ch))
          {
              continue;
          }
          result=result+ch;
        }
        System.out.println(result);
        
    }
}
