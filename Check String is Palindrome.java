import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        String s=sc.nextLine();
        String ActualString=s;
        String rev="";
        for(int i=0;i<s.length();i++)
        {
            rev=s.charAt(i)+rev;
        }
        System.out.println(rev);
        if(rev.equals(ActualString))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
