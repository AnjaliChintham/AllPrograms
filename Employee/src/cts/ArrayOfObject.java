package cts;
class Employee {

	
public 	int emp_id;
	public String emp_name;
	Employee(int  emp_id,String emp_name)
	{
	this.emp_id=emp_id;
	this.emp_name=emp_name;}}
	
	public class ArrayOfObject {
		public static void main(String[] args) {
			Employee[] employeeArray;
			employeeArray=new Employee[2];
			employeeArray[0]=new Employee(1,"Anjai");
			employeeArray[1]=new Employee(2,"Subhashini");
			for(int i=0;i< employeeArray.length;i++)
				System.out.println("name"+i+":"+employeeArray[i].emp_id+" "+employeeArray[i].emp_name);
				
		}
	
	}


