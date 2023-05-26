package sample.doc;
import java.io.*;
public class seriable
{
	public static void main(String[] aaa) throws IOException
	{
		try{
		Employee emp = new Employee();
	
		FileOutputStream fos = new FileOutputStream("dedalus.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(emp);
		System.out.println("Serilized to file dedalus.txt");
		oos.close();
		fos.close();
		}
		catch(FileNotFoundException fnf)
		{
			System.out.println("No file");
		}
	}
}
















