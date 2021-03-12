import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class PhaseOneProject
	{
		   public void program() {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("welcome to LockedMe.com");
			System.out.println("Developer name K.chaitanya");
			int choice;
			char con ='y';
			while(true)
			{	if(con == 'y')
			
			{
				System.out.println("1. Current files in Folder");
				System.out.println("2. Manipulation on files");
				System.out.println("3. Exit from program");
				System.out.println("Enter your choice");
				choice =sc.nextInt();
				switch(choice)
				{
				case 1:
					DisplayFiles obj=new DisplayFiles();
					obj.display();
					break;
				case 2:
					int ch;
			         do
					{
						System.out.println("1. Add new file");
						System.out.println("2. Deleting a new file");
						System.out.println("3. Search a file");
						System.out.println("4. Go to main menu");
						ch=sc.nextInt();
						switch(ch)
						{
						case 1:
							try { 
								 File myfile=new File("C:\\Users\\kchaitanya\\Desktop\\chaitanya\\chaitanya.txt");
								 if(myfile.createNewFile()) {
									 System.out.println("File created: "+myfile.getName());
								 }
								 else
								 {
									 System.out.println("File Already exists");
								 }
							}
								 catch(IOException e) {
									 System.out.println("An error occurred");
									 e.printStackTrace();
								 }
		
								 break; 
			
						case 2:
							try {
								Files.deleteIfExists(Paths.get("C:\\Users\\kchaitanya\\Desktop\\chaitanya\\chaitanya.txt"));
							}
							 catch(IOException e) {
								 System.out.println("An error occurred");
							 }
							System.out.println("Deletion Successful");
							break;
						case 3:
						{
							File myfile=new File("C:\\Users\\kchaitanya\\Desktop\\chaitanya\\chaitanya.txt");
							String[] flist= myfile.list();
							int flag=0;
							if(flist==null) {
								System.out.println("Empty directory");
							}
							else {
								for(int i=0;i<flist.length;i++) {
									String s=flist[i];
									if(s.equals("chaitanya.txt")) {
										System.out.println(s + "\tfound");
										flag=1;
									}
								}
							}
							if (flag==0) {
								System.out.println("File not Found");
							}
						}
						break;
						case 4:
							PhaseOneProject object=new PhaseOneProject();
							object.program();
							object.program();
							break;
							default:
								System.out.println("Invalid choice");
								break;
						}
						}
							while(ch!=4);
								break;
				case 3:
				System.out.println("Exit from program");
					break;
				default:
						System.out.println("Invalid option");
				}
			
			
						System.out.println("If you want to continue click y otherwise n");
			con = sc.next().charAt(0);
			}
			else
			{ System.out.println("Thanks for using this application");

				break;
			}
			
			
	   
	}
			
		   }}