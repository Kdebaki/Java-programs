package requestbook;
import student.Student;
import java.util.Random;
public class requestBook 
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
