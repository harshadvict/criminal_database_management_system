package controller;

import java.util.Scanner;
import utility.adminLogin;
public class Main {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("            Welcome to the criminal record management system");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------------");
		
		Scanner sc=new Scanner(System.in);
		
		// variable to store login details 
		String name;
		String id;
		String department;
		String password;
		boolean value2=true;
		while(value2) {
		//taking input for login from the console
		System.out.println("Please enter login details");
		System.out.println("==========================");
		System.out.print("Enter Id-->");
		id=sc.nextLine();
		System.out.print("Enter Passkey-->");
		password=sc.nextLine();
		System.out.print("Enter Nmae-->");
		name=sc.nextLine();
		System.out.print("Enter Department-->");
		department=sc.nextLine();
		
		// creating the object for the adminLogin class in the utility package 
		adminLogin obj1=new adminLogin();
		
		//using object calling the method to admin_login to do the login part it will return the true or false
		
		boolean value=obj1.admin_login(id, password,name,department);
		if(value==true) {
			System.out.println("=========================================================================");
			System.out.println("Done---Login Successfull");
			
			// while loop for continuing the service
			boolean input =true;
			while(input==true) {
			System.out.println("------------------//////please choose the option //////----------");
			System.out.println(" ");
			System.out.println("1.add entry");
			System.out.println("2.Show all entry record");
			System.out.println("3.Search particular criminal entry  with detaiils");
			System.out.println("4.modify criminal record");
			System.out.println("5.delete criminal record");
			System.out.println("6. exit the database");
			System.out.println("------------------------------------------------------------------");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				newCriminalEntry obj2=new newCriminalEntry();
				boolean value1 =obj2.CriminalEntry();
				if(value1==true) {
					System.out.println("new data added successfully");
				}
				else {
					System.out.println("data entry failed");
				}
				break;
			case 2:
				displaySearchResult obj3=new displaySearchResult();
				obj3.search();
				break;
			case 3:
				serachWithDetails obj4=new serachWithDetails();
				obj4.takingInput();
				break;
			case 4:
				modifyRecord obj5=new modifyRecord();
				obj5.takingInputToModify();
				break;
			case 5:
				DeleteRecord obj6=new DeleteRecord();
				obj6.deleteRecord();
				break;
			default:
				input=false;
				value2=false;
				System.out.println("Exiting the database......");
				System.out.println("logging off.......");
			}
			}
		}
		else {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Alert  --- Login Failed");
			System.out.println("please try again");
			System.out.println("-------------------------------------------------------------------------");
		}
		}
	}

}
