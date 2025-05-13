import java.util.*;
class Vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();
        String str1=str.toLowerCase();
        System.out.println("vowels in the string");
        for(int i=0;i<str.length();i++)
        {
            if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)='i'||str1.charAt(i)='o'||str1.charAt(i)='u')
            {
                System.out.println(""+str.charAt(i));
            }
        }
    }
}