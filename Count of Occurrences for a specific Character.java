import java.util.Scanner;
class HelloWorld 
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
        char search = 'a';
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==search)
            {
                count++;
            }
        }
        System.out.println("The number of words containing 'a' is: " + count);
    }
}
