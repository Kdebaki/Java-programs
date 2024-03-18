//Java program to implement user defined packages
package week6;
import emp.Employee;
import bonus.issueBonus;
public class demopackage 
{
	public static void main(String [] args)
	{
		System.out.println("this program illustrates the usage of packages");
		Employee list[]=new Employee[3];
		/* initialize array of objects individually*/
		for (byte i=0;i<list.length;i++)
			list[i]=new Employee();
		System.out.println("\n****************************");
		System.out.println("empId \t empName \t expYears \t salary");
		System.out.println("******************************");
		for (byte i=0;i<list.length;i++)
		{
			issueBonus.issueEmployeeBonus(list[i]);
			list[i].getEmployee();
		}
		System.out.println("**************************");
	}
}
