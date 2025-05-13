import java.util.*;
class Fact_series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit number");
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
              int k=1;
          sum=(Math.pow(x,i)/f)*k+sum;
          k=k*(-1);
        }
    }
}