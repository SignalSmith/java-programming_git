import java.util.*;
class New_class
{
      public static void main(String args[])
      {
          Scanner Sc=new Scanner(System.in);
          System.out.println("enter the number");
          int n=Sc.nextInt();
         int i,j;
        for(i =1;i<=n;i++)
        {
        for(j =1;j<=40-i;j++)
        System.out.print (" ");
        for(j =1;j<=i*2-1;j++)
        System.out.print ("*");
        System.out.println ("");
        }
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=40-i;j++)
            {
                System.out.print (" ");
            }
                for(j=1;j<=i*2-1;j++)
            {
                System.out.print ("*");
            }
            System.out.println (" ");
        }
      }
}
 