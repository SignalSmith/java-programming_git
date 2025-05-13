import java.util.*;
class Fibo
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int q=Sc.nextInt();
        int n=10;
        int a=0;
        int b=1;
        int c;
        System.out.println(a+""+b);
        for(int i=3;i<=n;i++)
        {
            c=a+b;
            System.out.println(""+c);
            a=b;
            b=c;
        }
        if(q==a||q==b)
        {
            System.out.println("is a fibonacci number");
        }
        else
        {
            System.out.println("is not a fibonacci number");
        }
    }
}
