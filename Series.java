import java.util.*;
class Series
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the limit number");
        int n=Sc.nextInt();
        System.out.println("enter the value of x");
        int x=Sc.nextInt();
        double sum=0.0d;
        int k;
        for(int i=1;i<=n;i++)
        {
            k=1;
            sum=Math.pow(x,i)/i*k+sum;
            k=k*(-1);
        }
        System.out.println(sum);
    }
}