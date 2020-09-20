package controller;

import java.util.Scanner;

import service.abstractReadCriminalRecord;
import service.readCriminalrecord;

public class serachWithDetails extends displaySearchResult{
    
	public void takingInput() {
		boolean value=true;
		while(value==true) {
		System.out.println("===================================================================================");
		System.out.println("select the value to search the record");
		System.out.println("===================================================================================");
		System.out.println("press-1 :- to search with CriminalId");
		System.out.println("press-2 :- to search with Frist name");
		System.out.println("press-3 :- to exit search");
		System.out.print("please enter:-->");
		Scanner sc=new Scanner(System.in);
		int selection=sc.nextInt();
		
		
			switch (selection){
			case 1:
				System.out.print("enter id-->");
				int id=sc.nextInt();
				abstractReadCriminalRecord obj=new readCriminalrecord();
				boolean report=obj.readRecord(id);
				if(report==true) {
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("result Fetched successfully");
					System.out.println("--------------------------------------------------------------------------");
				}
				else {
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("result found 0");
					System.out.println("--------------------------------------------------------------------------");
				}
				break;
			case 2:
				System.out.println("enter first name-->");
				String name=sc.nextLine();
				abstractReadCriminalRecord obj1=new readCriminalrecord();
				boolean report1=obj1.readRecord(name);
				if(report1==true) {
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("result Fetched successfully");
					System.out.println("--------------------------------------------------------------------------");
				}
				else {
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("result found 0");
					System.out.println("--------------------------------------------------------------------------");
				}
				break;
			default:
				return;
				
			}
		}
	}
	
	
         
}
