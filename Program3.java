import java.util.*;
public class Program3
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number : ");
int num=s.nextInt();
if (num%2 == 0)
 {
	System.out.println(num +" is an even number"); 
 }
else
	System.out.println(num +" is a odd number");
}	
}
