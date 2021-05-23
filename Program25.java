import java.util.*;
import java.lang.Math;
public class Program25
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of terms in series : ");
int num=s.nextInt();
double sum=1;
double fact=1;
if (num>1)
{
	System.out.println("Enter the value of x");
	int x=s.nextInt();
	for (int i=1; i<=num-1;i++)
	{
		for (int j=1; j<=i;j++)
			fact=fact*j;
		if ( i%2!=0)
			sum=sum+(Math.pow(-x,i))/fact;
		else 
			sum=sum+(Math.pow(x,i))/fact;
		fact=1;
	}
}
else if(num==1)
	sum=1;
else 
	 sum =0;
System.out.println("the sum of the series is : " + sum);
}
}

