import java.util.*;
public class Program20
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter an integer number : ");
int num=s.nextInt();
int r,n=0;
while (num!=0)
 {
	r=num%10;
	n++;
	num=num/10;
 }
System.out.println("the number of digits in the given number is "+n);
}
}