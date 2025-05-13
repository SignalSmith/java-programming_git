import java.util.*;
class parttern_7
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=Sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
        for(j=1;j<=40-i;j++)
        System.out.print(" ");
        for(j=1;j<=i*2-1;j++)
        System.out.println("*");
        System.out.println("");
        }
    }
}