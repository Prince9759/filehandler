package FileHandler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilehandlingProject 
{
	void CreateFile() 
	{
		File obj  =  new File("ABC.txt");
		try 
		{
			if(obj.createNewFile()) 
			{
				System.out.println("File Created :->"+obj.getName());
			}
			else 
			{
				System.out.println("Aready Exit");
			}
		}
		catch(Exception e) 
		{
			System.out.println("error:->"+e);
		}
	}
	void WriteFile() 
	{
		try 
		{
			FileWriter w  = new FileWriter("ABC.txt");
			w.write("hello write a file");
			w.close();
			System.out.println("write successfully");
		}
		catch(Exception e) 
		{
			System.out.println("error:->"+e);
		}
	}
	void ReadFile() 
	{
		try 
		{
			File obj2  =  new File("ABC.txt");
			Scanner myReader = new Scanner(obj2);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.print(data+ " ");
		      }
		      myReader.close();
		}
		catch(Exception e) 
		{
			System.out.println("error:->"+e);
		}
	}
	void append()
	{
		 try { 
	         String data = " Tutorials Point is a best website in the world";
	         File f1 = new File("C:\\Users\\pbjai\\eclipse-workspace\\Practice-Project2\\ABC.txt");
	         if(!f1.exists()) {
	            f1.createNewFile();
	         } 
	         FileWriter fileWritter = new FileWriter(f1.getName(),true);
	         BufferedWriter bw = new BufferedWriter(fileWritter);
	         bw.write(data);
	         bw.close();
	         System.out.println("Append ");
	      } catch(Exception e){
	         e.printStackTrace();
	      }
	}
	public static void main(String[] args) 
	{
	
		FilehandlingProject obj = new FilehandlingProject();
		obj.CreateFile();
		obj.WriteFile();
		obj.ReadFile();
       obj.append();
	}

}
