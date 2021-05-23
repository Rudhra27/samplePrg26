import java.util.*;
public class Program22
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of terms in series : ");
int num=s.nextInt();
float n=0,n2=0;
float sum=0;
for (int i=1; i<=num;i++)
{
	n=i;
	n2=i*i;
	sum=sum+(n2/n);
}
System.out.println("the sum of the series is : " + sum);
}
}

