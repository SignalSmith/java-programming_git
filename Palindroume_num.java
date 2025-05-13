import java.util.*;
class Palindroume_num
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=Sc.nextInt();
        int r;
        int s=0;
        int t=n;
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(t==s)
        {
            System.out.println("palindroume number");
        }
        else
        {
            System.out.println("not a palindroume number");
        }
    }
}