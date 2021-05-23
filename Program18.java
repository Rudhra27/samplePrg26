import java.util.*;
public class Program18
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number : ");
int num=s.nextInt();
int r,n,i=0,cube;
n=num;
while (n!=0)
 {
	r=n%10;
	cube=r*r*r;
	i+=cube;
	n=n/10;
 }
if (num == i)
	System.out.println("It is a Amstrong number");
else
	System.out.println("It is not a Amstrong number");
}
}