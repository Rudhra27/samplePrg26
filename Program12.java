import java.util.*;
public class Program12
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number to find prime factors : ");
int a=s.nextInt();
System.out.println("the prime factors are : ");
for (int i=2; i<=a; i++)
{
	if (a%i == 0)
	{
		System.out.println(i);
		a=a/i;
	}		
}
}
}
