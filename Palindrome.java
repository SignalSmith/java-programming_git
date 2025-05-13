import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a word");
        String str=Sc.next();
        int a=str.length();
        String str1="";
        for(int i=a-1;i>=0;i--)
        {
             str1=str+str.charAt(i);
        }
        if(str1.equalsIgnoreCase(str))
        {
            System.out.println("palidrome");
        }
        else
        {
            System.out.println("not palidrome");
        }
    }
}