import java.util.*;
import static java.lang.Math.*;
public class Program8
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the coefficient of X^2 : ");
double a=s.nextDouble();
System.out.println("Enter the coefficient of X : ");
double b=s.nextDouble();
System.out.println("Enter the constant : ");
double c=s.nextDouble();
double r1, r2;
double determinant = b*b - 4*a*c;
double sqrt= Math.sqrt(determinant);
if (determinant>0)
{
	r1=(-b + sqrt)/(2*a);
	r2=(-b - sqrt)/(2*a);
	System.out.println("The roots are distinct\n" + "the first root is " +r1 +"\n the second root is "+r2);
}
else if (determinant ==0)
{
	r1=r2= -b/ (2*a);
	System.out.println("The roots are same\n" + "the root is " +r1);
}
else 
{
	double real = -b/ (2*a);
	double img= Math.sqrt(-determinant)/ (2*a);
	System.out.println("The roots are not real");
	System.out.println("The first root is " +real+"+"+img+"i");
	System.out.println("The second root is " +real+"-"+img+"i");
}

}
}