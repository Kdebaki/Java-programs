package week9;
import java.util.Scanner;
class student
{
	String name;
	float [] CIE= {0,0,0};
	float avg;
	byte rollNO;
	void setStudent(String n,float ia [],byte rno)
	{
		name=n;
		avg=0.0f;
		rollNO=rno;
		for (byte i=0;i<3;i++)
		CIE[i]=ia[i];
		this.calculateAverage();
	}
	void calculateAverage()
	{
		float sum=0.0f;
		for (byte i=0;i<3;i++)
			sum=sum+CIE[i];
		avg=sum/3.0f;
	}
	void showStudent()
	{
		System.out.println(rollNO+".\t\t" + name + "\t\t"+ avg +"\t\t");
		}
}
class Grade extends Student
{
	final byte grace=10;
	float attendance;
	Scanner inScanner=new Scanner (System.in);
	void setStudent (String n,float ia[],byte rno)
	{
		System.out.println("enter the attendance of the student");
		attendance=inScanner.nextFloat();
		if (attendance>=75.0f)
		{
			ia[2]=grace;
			super.setStudent(n, ia, rno);
			super.setStudent(n, ia, rno);
		}
		else
			super.setStudent(n, ia, rno);
	}
}
public class demoMethodOverriding
{
	public static void main(String args[])
	{
		Grade deeps=new Grade();
		float[]cie={18.4f,23.7f,0};
		deeps.setStudent("deepika",cie,(byte)15);
		System.out.println("The internal details of students.");
		System.out.println("RollNO.\t name\taverage");
		deeps.showStudent();
	}
}