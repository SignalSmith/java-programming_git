import java.util.*;
class Loop_add
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int f=0;
        for(int i=1;i<=n;i++)
        {
            f=f+i;
        }
        System.out.println("total value="+f);
    }
}