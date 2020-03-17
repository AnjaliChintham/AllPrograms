package cts;

public class Replace {
public static void main(String[] args) {
	String s="          welcome to cognizant      ";
	System.out.println(s.trim());
	System.out.println("Replace all the 't' with 'a'");
	String a="your domain is selenium testing";
	String replaceString=a.replace('t', 'a');
	System.out.println(replaceString);
}
}
