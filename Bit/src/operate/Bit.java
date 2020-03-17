package operate;
import java.util.*;
public class Bit {
public static void main(String[] args)
{
System.out.println("Enter number");
Scanner q=new Scanner(System.in);
int num=q.nextInt();
System.out.println("no of ones in : "+num+"("+Integer.toBinaryString(num)+")"); 
int result=countOne(num);
System.out.println("is :"+result);
q.close();
}
static int countOne(int n) {
	int count=0;
	while(n>0) {
		n=n&(n-1);
		count++;
	}
	return count;
	}


}
