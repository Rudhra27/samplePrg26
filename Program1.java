import java.util.*;
public class Program1
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number : ");
int num=s.nextInt();
if (num<0)
 { 
   System.out.println(num +" is negative." +"\nThe new number is :");
   while (num<0)
   {
	   System.out.println(num);
	   num=num+1;
   }
 }
else if (num>0)
 {
	 System.out.println(num +" is positive");
 }
else 
	System.out.println(num +" is neither positive nor negative");
}
}
