import java.util.*;
public class Program15
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number : ");
int n=s.nextInt();
int sum=0;
for (int i=1; i<=n; i++)
	sum+=i;
float avg= sum/n;
System.out.println("the average is : " +avg);
}
}