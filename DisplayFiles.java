import java.io.File;

public class DisplayFiles {
	public void display()
	{
		File file=new File("C:\\Users\\kchaitanya\\Desktop\\chaitanya");
		String[] f=file.list();
		for(String str :f)
			System.out.println(str);
	}


}