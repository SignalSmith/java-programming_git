import java.util.*;
class digit_extraction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter anumber");
        int n=sc.nextInt();
        int r;
        int s=0;
        while(n!=0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }
        System.out.println(s);
    }
}