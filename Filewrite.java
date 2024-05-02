import java.io.*;
public class Filewrite
{
	public static void main(String args[])
	{
		try
		{
		String s;
		FileOutputStream f=new FileOutputStream ("D:\\text.txt");
		DataInputStream d = new DataInputStream(System.in);
		
		while(true)
		{
		    System.out.println("Enter the data.... terminate with a #");
			s=d.readLine();
			if(s.equals("#"))
				break;
			else
			{
			
			
			f.write(s.getBytes());
			f.write("\r\n".getBytes());
	        System.out.println(s);
			}
	    }
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
	}
}
		