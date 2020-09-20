package controller;

import java.util.Scanner;

import service.abstractModifyrecord;
import service.modifyCriminalRecord;

public class modifyRecord {
   public void takingInputToModify() {
	   boolean value =true;
	   while(value) {
	   System.out.println("-----------------------------------------------------------------------------------------");
	   System.out.println("please select the option to update");
	   System.out.println("-----------------------------------------------------------------------------------------");
	   System.out.println("1.Offence type"+"\t\t"+"2.No of crime"+"\t\t"+"3.New Punishment"+"\t\t"+"4.Current status");
	   System.out.println("-----------------------------------------------------------------------------------------");
	   Scanner sc =new Scanner(System.in);
	   int choice =sc.nextInt();
	   
	   
	   switch (choice) {
	   case 1:
		   System.out.println("enter the criminal id which need to be updated");
		   int id=sc.nextInt();
		   sc.nextLine();
		   System.out.println("enter new offence");
		   String offence=sc.nextLine();
		   System.out.println(offence);
		   abstractModifyrecord obj=new modifyCriminalRecord();
		   obj.modifyTheRecord(id,offence);
		   System.out.println("-----------------------------------------------------------------------------------------");
		   break;
	   case 2:
		   System.out.println("enter the criminal id which need to be updated");
		   int id1=sc.nextInt();
		   sc.nextLine();
		   System.out.println("enter no of crime");
		   int no=sc.nextInt();
		   sc.nextLine();
		   abstractModifyrecord obj1=new modifyCriminalRecord();
		   obj1.modifyTheRecord1(id1, no);
		   System.out.println("-----------------------------------------------------------------------------------------");
		   break;
	   case 3:
		   System.out.println("enter the criminal id which need to be updated");
		   int id2=sc.nextInt();
		   sc.nextLine();
		   System.out.println("enter new punishment");
		   String punishment=sc.nextLine();
		   abstractModifyrecord obj2=new modifyCriminalRecord();
		   obj2.modifyTheRecord2(id2, punishment);
		   System.out.println("-----------------------------------------------------------------------------------------");
		   break;
	   case 4:
		   System.out.println("enter the criminal id which need to be updated");
		   int id3=sc.nextInt();
		   sc.nextLine();
		   System.out.println("enter the current status");
		   String status = sc.nextLine();
		   abstractModifyrecord obj3=new modifyCriminalRecord();
		   obj3.modifyTheRecord3(id3, status);
		   System.out.println("-----------------------------------------------------------------------------------------");
		   break;
		default:
			value= false;
	   }
	   }
   }
}
