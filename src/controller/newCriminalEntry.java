package controller;

import java.time.LocalDate;
import java.util.Scanner;

import model.criminalPerson;
import service.addNewCriminal;
import service.adstractAddNewCriminal;

public class newCriminalEntry {
	public boolean CriminalEntry() {
		//scanner class
		Scanner sc= new Scanner(System.in);
		
		//input from the console for adding criminal data
		
		System.out.println("Please fill the field carefully:---");
		
		System.out.println("enter id");
		int criminalId=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter first name");
		String criminalFirstName=sc.nextLine();
		sc.nextLine();
		
		System.out.println("enter last name");
		String criminalLastName=sc.nextLine();
		sc.nextLine();
		
		System.out.println("enter the age");
		int criminalAge=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter the height");
		int criminalHeight=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter the offence");
		String offenceType=sc.nextLine();
		sc.nextLine();
		
		System.out.println("enter the dob");
		String criminaldob=sc.nextLine();
		sc.nextLine();
		
		System.out.println("no of crimes");
		int noOfCrimes=sc.nextInt();
		sc.nextLine();
		
		System.out.println("punishment");
		String punishment=sc.nextLine();
		sc.nextLine();
		
		System.out.println("duration of punishment(Years)");
		int punishmentDuration=sc.nextInt();
		sc.nextLine();
		
		System.out.println("current status");
		String currentStatus=sc.nextLine();
		
		//storing local date in the variable use LocalDate class
		LocalDate crimeDate=LocalDate.now();
		
		//calling addnewCriminal method
		boolean value1=addnewCriminal(criminalId, criminalFirstName, criminalLastName, criminalAge, criminalHeight, offenceType, criminaldob, crimeDate, noOfCrimes, punishment, punishmentDuration, currentStatus);
	  
		//returning value to the main method
		return value1;
	}
	
	
	
  public boolean  addnewCriminal(int criminalId, String criminalFirstName, String criminalLastName, int criminalAge,
			int criminalHeight, String offenceType, String criminaldob, LocalDate crimeDate, int noOfCrimes,
			String punishment, int punishmentDuration, String currentStatus) {
		
	  //calling the addCriminal method in the addNewCriminal class
	  
		adstractAddNewCriminal obj=new addNewCriminal();
		
		criminalPerson objadd=new criminalPerson(criminalId, criminalFirstName, criminalLastName, criminalAge, criminalHeight, offenceType, criminaldob, crimeDate, noOfCrimes, punishment, punishmentDuration, currentStatus);
		//boolean value=obj.addCriminal(criminalId, criminalFirstName, criminalLastName, criminalAge, criminalHeight, offenceType, criminaldob, crimeDate, noOfCrimes, punishment, punishmentDuration, currentStatus);
		boolean value=obj.addCriminal(objadd);
		return value;
  }
}
