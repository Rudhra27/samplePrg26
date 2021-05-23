import java.util.*;
public class Program9
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter an character : ");
char ch=sc.next().charAt(0);
if ((ch >='a' && ch<= 'z') || (ch>='A' && ch<='Z'))
	System.out.println(ch +" is an ALPHABET");
else if (ch >='0' && ch<='9')
	System.out.println(ch +" is a digit");
else if (Character.isSpaceChar(ch))
	System.out.println(ch +" is a whitespace");
else
	System.out.println(ch +" is a special character");

}
}

