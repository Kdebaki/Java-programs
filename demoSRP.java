package week6;
import student.Student;
import requestbook.*;
import issuebook.IssueBook;
public class demoSRP 
{
	public static void main(String [] args)
	{
		Student suman=new Student();
		suman.setname("Suman");
		suman.setregisterNo("119cs22015");
		requestBook rb=new requestBook();
		rb.setbookName("the upside of falling");
		rb.setduration(2);
		rb.setStudent(suman);
		rb.searchBook();
		IssueBook iborder=new IssueBook(rb);
		iborder.IssueBook();
	}
}

