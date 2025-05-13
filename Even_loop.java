import java.util.*;
class Even_loop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("even numbers 1 to 100");
        int n=100;
        
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println("even number="+i);
            }
                
        }
    }
}