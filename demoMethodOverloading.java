//Learn and Understand Static polymorphism and write a program Implement the same(Method Overloading)
package week9;
class Student 
{
	String name;
	float [] CIE= {0,0,0};
	float avg;
	byte rollNo;
	void setStudent(String n,float ia [],byte rno)
	{
		float sum=0.0f;
		name=n;
		avg=0.0f;
		rollNo=rno;
		for (byte i=0;i<3;i++)
		{
			CIE [i]=ia[i];
			sum=sum+CIE[i];
		}
		avg=sum/3.0f;
	}
	void setStudent(String n,float ia1,float ia2,byte rno)
	{
		name=n;
		rollNo=rno;
		CIE[0]=ia1;
		CIE[0]=ia2;
		avg=(CIE[0] + CIE[1]/ 3.0f);
	}
	void setStudent (String n,float ia,byte rno)
	{
		name=n;
		rollNo=rno;
		CIE[0]=ia;
		avg=(CIE[0]/ 3.0f);
	}
	void showStudent()
	{
		System.out.println(rollNo+".\t\t" + name + "\t\t"+ avg +"\t\t");
		}
}

public class demoMethodOverloading
{
	public static void main(String args[])
	{
		Student deeps=new Student();
		System.out.println("the internal details of the students.");
		System.out.printf("Deepika",19.4f,(byte)12);
		deeps.showStudent();
		deeps.setStudent("jaya",17.6f,(byte)10);
		deeps.showStudent();
		float []CIE= {10.0f,12.6f,19.2f};
		deeps.setStudent("rekha", 12.0f,(byte)8);
		deeps.showStudent();
		
	}
}
