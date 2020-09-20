package controller;

import java.util.Scanner;

import service.abstractDeleteRecord;
import service.deleteCriminalRecord;

public class DeleteRecord {
          public void deleteRecord() {
        	  System.out.println("-----------------------------------------------------------------------------");
        	  System.out.println("Please eneter the id need to be deleted-->");
        	  Scanner sc=new Scanner(System.in);
        	  int id=sc.nextInt();
        	  abstractDeleteRecord obj=new deleteCriminalRecord();
        	  obj.deleteTheRecord(id);
        	  System.out.println("record deleted");
        	  return;
          }
}
