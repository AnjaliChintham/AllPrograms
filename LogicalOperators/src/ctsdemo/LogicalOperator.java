package ctsdemo;
import java.util.*;
public class LogicalOperator {
public static void main(String[] args) {

	String S1="anjalichintham98@gmail.com";
String S2="12345678";

Scanner sc=new Scanner(System.in);

System.out.println("Enter user name:");
String S3=sc.next();
System.out.println("Enter password:");
String S4=sc.next();
if((S1.equals(S3))&&(S2.equals(S4)))
{
	System.out.println("open");
}
	else
	{	
		System.out.println("incorrect");
}

}
}
