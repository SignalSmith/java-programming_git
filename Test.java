import java.util.*;
class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the vowels");
        String str=sc.next();
        int a=str.length();
        for(i=a-1;i>=0;i--)
        {
            string str1=str+str.charAt(i);
        }
        if(str1.equalsIgnoreCase)
        {
            System.out.println("the number is palindrome");
        }
        else
        {
            System.out.println("the number is not palindrome");
        }
        }
    }
}