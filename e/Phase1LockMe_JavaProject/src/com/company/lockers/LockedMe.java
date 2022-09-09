package com.company.lockers;

import java.io.File;
import java.util.Scanner;

public class LockedMe 
{
	static final String projectpath="D:\\e\\Phase1LockMe_JavaProject\\LockedMeFiles";

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		int ch;
			
		displayMenu();
		System.out.println("Enter your choice");
		ch=Integer.parseInt(obj.nextLine());
		
		switch(ch)
		{
			case 1 :getAllFiles();
				     break;
			case 2 :createFiles();
				     break;
			case 3 :deleteFiles();
				     break;
			case 4 :searchFiles();
				     break;
			case 5 :System.exit(0);
			         break;
			default:System.out.println("Invalid Option");
			         break;
		}
		obj.next();
	}
public static void displayMenu()

{
	System.out.println("****************************************************");
	System.out.println("\twelcome to Company Lockers - LockedMe.com ");
	System.out.println("Developer Name : Dhananjay Pimpalshende E");
	System.out.println("****************************************************");
	System.out.println("\t1. Display all the files");
	System.out.println("\t2. Add files to existing directory");
	System.out.println("\t3. Delete a file");
	System.out.println("\t4. Search a file");
	System.out.println("\t5. Exit");
	System.out.println("****************************************************");
}
public static void getAllFiles()
{
	File[] files = new File(projectpath).listFiles();
	
	Object listOfFiles;
	//if the folder is empty
	if(listOfFiles.length==0)
		System.out.println("No files exist in the directory");
	else
		

}
public static void createFiles()
{
	System.out.println("create files");
}
public static void deleteFiles()
{
System.out.println("Delete Files");	
}
public static void searchFiles()
{
	System.out.println("Search Files");
}


}
