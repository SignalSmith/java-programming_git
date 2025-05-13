import java.util.*;
class Neon_num
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=Sc.nextInt();
        int x;
        int r;
        int s=0;
        x=n*n;
        while(x!=0)
        {
            r=x%10;
            s=s+r;
            x=x/10;
        }
        if(n==s)
        {
            System.out.println("Neon number");
        }
        else
        {
            System.out.println("Not a Neon number");
        }
    }
}