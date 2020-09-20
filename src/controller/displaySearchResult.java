package controller;

import model.criminalPerson;
import service.abstractReadCriminalRecord;
import service.readCriminalrecord;

//class contains the display and search method
public class displaySearchResult {
	
	//method to display the record
	public void search() {
		abstractReadCriminalRecord obj=new readCriminalrecord();
		obj.readRecord();
	}
}
