import java.util.*;
class Fact_add
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the limit number");
        int n=Sc.nextInt();
        System.out.println("enter the value of x");
        int x=Sc.nextInt();
        double sum=0.0d;
        for(int i=1;i<=n;i++)
        {
        sum=Math.pow(x,i)/i+sum;
        }
        System.out.println(sum);
    }
}