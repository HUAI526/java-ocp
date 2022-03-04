import java.io.File;
import java.io.IOException;
class ex2
{
	public static void main(String[] args) {
		File f=new File("/abc.txt");
		try
		{
			f.createNewFile();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}