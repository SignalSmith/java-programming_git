import java.util.*;
class Parttern_3
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2==0)
                {
                    System.out.print("#");
                }
                else
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}