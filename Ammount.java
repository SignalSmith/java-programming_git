import java.util.*;
class Ammount
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the purchase ammount");
    int pa=sc.nextInt();
    int paya;
    if(pa>5000 && pa<=10000)
    {
        paya=pa-(pa*10)/100;
        System.out.println("Enter the payable ammount="+paya);
    }
    else if(pa>10000 && pa<=15000)
    {
         paya=pa-(pa*12)/100;
         System.out.println("Enter the payable ammount="+paya);
    }
    else if(pa>15000)
    {
        paya=pa-(pa*15)/100;
        System.out.println("Enter the payable ammount="+paya);
    }
    else
    {
        System.out.println("Enter the payable ammount="+pa);
    }
    }
}
