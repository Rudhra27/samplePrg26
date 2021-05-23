import java.util.*;
public class Program17
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number : ");
int n=s.nextInt();
int square,cube;
for (int i=1; i<=n; i++)
 {
	square=i*i;
	cube=i*i*i;
	System.out.println("the number is :" +i +" \tits square is : "+square +" \tits cube is : " +cube);
 }
}
}