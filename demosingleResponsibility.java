package week6;
import java.util.*;
public class demosingleResponsibility
{
	public static void main(String [] args)
	{
		Student sony=new Student();
		sony.setname("Sony mathew");
		sony.setregisterNo("119cs20001");
		requestBook rb=new requestBook();
		rb.setbookName("java programming");
		rb.setduration(2);
		rb.setStudent(sony);
		rb.searchBook();
		IssueBook iborder=new IssueBook (rb);
		iborder.IssueBook();
	}
}
class Student
{
	private String name;
	private String registerNo;
	public String getName() {return name;}
	public void setname(String name) {this.name=name;}
	public String getregisterNo() {return registerNo;}
	public void setregisterNo(String rno)
	{
		this.registerNo=rno;
	}
}
class requestBook
{
	private Student student;
	private String requestID;
	private String bookName;
	private int duration;
	public Student getStudent() {return student;}
	public void setStudent(Student student)
	{
		this.student=student;
	}
	public String getrequestID() {return requestID;}
	public void setrequestID(String bookname)
	{
		Random random=new Random();
		this.requestID=(bookName+"-"+random.nextInt(500));
	}
	public String getbookName() {return bookName;}
	public void setbookName(String bookName)
	{
		this.bookName=bookName;
		setrequestID(bookName);
	}
	public int getduration() {return duration;}
	public void setduration(int duration)
	{
		this.duration=duration;
	}
	public void searchBook()
	{
		System.out.println(" Searching book for student-"+ this.getStudent().getName()+ " who has requested " + this.getbookName());
	}
}
class IssueBook
{
	private requestBook rb;
	public IssueBook (requestBook rb) {this.rb=rb;}
	public void IssueBook()
	{
		System.out.println(" Issuing the book ");
		System.out.println(" with request id as "+this.rb.getrequestID()+" being Issued to "+this.rb.getStudent().getName());
		System.out.println(" Book is to be delivered to: "+this.rb.getStudent().getregisterNo());
		}
}

