import java.util.*;
public class Program19
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter an integer number : ");
int num=s.nextInt();
int r,n,reverse=0;
n=num;
while (n!=0)
 {
	r=n%10;
	reverse=reverse*10 + r;
	n=n/10;
 }
if (num == reverse)
	System.out.println("It is a Palindrome number");
else
	System.out.println("It is not a Palindrome number");
}
}