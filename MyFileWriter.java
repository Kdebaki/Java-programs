package week11;
import java.io.FileWriter;
import java.io.*;
class MyFileWriter
{
	public static void main(String arg[]) throws IOException
	{
		try {
			FileWriter fw=new FileWriter("TestFile.txt");
			String s="\n all the best for your exam dear student\n";
			char ch[]=s.toCharArray();
			for (int i=0;i<ch.length;i++)
				fw.write(ch[i]);
			s="Good luck prepare well";
			fw.write(s);
			fw.close();
			int i=0;
			FileReader fr=new FileReader("testfile.txt");
			while ((i=fr.read())!=-1)
                System.out.print((char)i);
           fr.close();
		}
		catch (FileNotFoundException nfe) {
			System.out.println("Invalid File Name\n File does nor exitss");
		}
	}
}

