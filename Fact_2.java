import java.util.*;
class Fact_2
{
    public static void main(String args[])
    {
       Scanner Sc=new Scanner(System.in);
       System.out.println("Enter the limit");
       int n=Sc.nextInt();
       double sum=0.0d;
       int f;
       for(int i=1;i<=n;i++)
       {
         f=1;
         for(int j=1;j<=i;j++)
         {
            f=f*j;
         }
            sum=sum+f;
            System.out.println(sum);
       }
     }
}