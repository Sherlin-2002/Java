import java.io.*;
public class Fileread
{
	public static void main(String args[])
	{
		try
		{
		int ch;
		FileInputStream f = new FileInputStream("D:\\text.txt");
		ch=f.read();
		while(ch!=-1)
		{
			
			char c =(char)ch;
			System.out.print(c);
			ch=f.read();
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}