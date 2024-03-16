package issuebook;
import student.Student;
import requestbook.requestBook;
public class IssueBook 
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

