import java.util.*;
class Angstrome_num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int s=0;
        int r;
        int t=n;
        while(n!=0)
        {
            r=n%10;
            s=s+r*r*r;
            n=n/10;
        }
        if(t==s)
        {
            System.out.println("the number is Angstrome");
        }
        else
        {
            System.out.println("the number is not Angstrome");
        }
    }
}