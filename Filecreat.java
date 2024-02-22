import java.io.*;
public class Filecreat
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream f= new FileOutputStream("D:\\text.txt");
			System.out.println("File created succesfully");
			
		}
		catch(Exception e)
		{
			System.out.println("error"+e);
		}
	}
}
			