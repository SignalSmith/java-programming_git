import java.util.*;
class Parttern_6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++)
        {
           for(int j=1;j<=10-i;j++)
           {
               System.out.print("");
               for(j=1;j<=i-i*2;j++)
               {
                   System.out.print("*");
               }
           }
        
           System.out.println("");
        }
    }
}