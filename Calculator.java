
import java.util.*;
class Calculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two nos");
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        double result;
        System.out.println("enter + for addition");
        System.out.println("enter - for substraction");
        System.out.println("enter * for multiplication");
        System.out.println("enter / for division");
        System.out.println("enter % for modulo division");
        System.out.println("enter your choice");
        char choice=sc.next().charAt(0);
        switch(choice)
        {
            case'+':
            result=n1+n2;
            System.out.println("Enter the result="+result);
            break;
            case'-':
            result=n1-n2;
            System.out.println("Enter the result="+result);
            break;
            case'*':
            result=n1*n2;
            System.out.println("Enter the result="+result);
            break;
            case'/':
            result=n1/n2;
            System.out.println("Enter the result="+result);
            break;
            case'%':
            result=n1%n2;
            System.out.println("Enter the result="+result);
            break;
            default:
            System.out.println("Invalid operator");
            break;
        }
    }
}
