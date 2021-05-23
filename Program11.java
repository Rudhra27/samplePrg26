import java.util.*;
public class Program11
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Rent of new videos per day = Rs. 75 \nRent of old videos per day = Rs. 60");
System.out.println("Enter the number of new videos you want : ");
int newvideos =s.nextInt();
System.out.println("Enter the number of old videos you want : ");
int oldvideos =s.nextInt();
float totalcost = (newvideos*75) + (oldvideos*60);
System.out.println("the total cost per day is : "+totalcost);
}
}