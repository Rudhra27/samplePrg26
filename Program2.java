import java.util.*;
public class Program2
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number : ");
int num=s.nextInt();
if (num%11 == 0)
 {
	System.out.println(num +" is divisible by 11"); 
 }
else
	System.out.println(num +" is not divisible by 11");
}	
}
