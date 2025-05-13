import java.util.*;
class Fact_add2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit value");
        int n=sc.nextInt();
        System.out.println("enter the value of x");
        int x=sc.nextInt();
        double sum=0.0d;
        int f;
        for(int i=1;i<=n;i++)
        {
            f=1;
            for(int j=1;j<=i;j++)
            {
                f=f*j;
            }
            sum=Math.pow(x,i)/f+sum;
        }
        System.out.println(sum);
    }
}