package week7;
import java.util.Scanner;
public class Diagonal
{
	public static void main (String []args)
	{
		int matrix[][] =new int[3][3];
		Scanner in_Scanner =new Scanner(System.in);
		System.out.println("Enter matrix elements one by one: ");
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				matrix[i][j]=in_Scanner.nextInt();
			}
		}
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if (i==j)
				{
					System.out.print(matrix[i][j]+" ");
				}
				else
				{
					System.out.print("*");
				}
			}
		}
		System.out.println("\t");
	    in_Scanner.close();
	}
}
