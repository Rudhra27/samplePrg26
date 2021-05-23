import java.util.*;
public class Program5
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number : ");
int a=s.nextInt();
System.out.println("Enter the second number : ");
int b=s.nextInt();
System.out.println("Enter the third number : ");
int c=s.nextInt();
int max;
if (a>b)
	max=a;
else
	max=b;
if (max>c)
	System.out.println(max +" is the greatest number");
else 
	System.out.println(c +" is the greatest number");
}
}
