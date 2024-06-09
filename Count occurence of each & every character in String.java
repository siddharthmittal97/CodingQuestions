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
        Map<Character,Integer> obj = new HashMap();
        char[] charArr = s.toCharArray();
        for(char ch:charArr)
        {
            if(!obj.containsKey(ch))
            {
              obj.put(ch,1);
            }
            else
            {
                 int count=obj.get(ch);
                 obj.put(ch,count+1);
            }
        }
         System.out.println(obj);
    }
}
