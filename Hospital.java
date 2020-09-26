import java.io.*;
import java.util.*;
class Design
{
	private ProcessBuilder processBuilder;
	private Scanner input;
	Design()
	{
		try
		{
			processBuilder=new ProcessBuilder("cmd","/c","cls");
			processBuilder.inheritIO().start().waitFor();
			input=new Scanner(System.in);
		}
		catch(Exception e)
		{

		}	
	}
	public void logo()
	{
		System.out.println("Developed by Badar Muneer");
	}
	public void design(String title)
	{

		for(int i=1; i<=2; i++)
		{
			System.out.print("\t\t\t\t\t");
			for(int j=0; j<30; j++)
				System.out.print("=");
			System.out.println();
		}
		System.out.print("\t\t\t\t\t\t");
		System.out.println(title);
		for(int i=1; i<=2; i++)
		{
			System.out.print("\t\t\t\t\t");
			for(int j=0; j<30; j++)
				System.out.print("=");
			System.out.println();
		}

	}
	
	public int userType()
	{
		System.out.print("\n\n");
		System.out.print("\t\t\t\t"+"1.Admin"+"\n");
		System.out.print("\t\t\t\t"+"2.Patient"+"\n");
		System.out.print("\t\t\t\t"+"3.Doctor"+"\n");
		System.out.print("SELECT:");
		int choice=input.nextInt();
		switch(choice)
		{
			case 1:
			return 1;
			case 2:
			return 2;
			case 3:
			return 3;
		}
		return 0;
	}
}
class Admin
{
	
}
class Patient
{

}
class Doctor
{
	
}
public class Hospital
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		Design design=new Design();
		Admin admin=new Admin();
		int userType;
		while(true)
			{
				design.logo();
				design.design("BADAR HOSPITAL");
				System.out.print("\n\n\n");
				design.design("YOU ARE?");
				userType=design.userType();
				if(userType==1)
				{

				}
				else if(userType==2)
				{

				}
				else if(userType==3)
				{

				}
				
			}
	}
}