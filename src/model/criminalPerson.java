package model;

import java.io.Serializable;
import java.time.LocalDate;

//criminal record class


public class criminalPerson implements Serializable{
	
	//class variable
	private int criminalId;
    private String criminalFirstName;
    private String criminalLastName;
    private int criminalAge;
    private int criminalHeight;
    private String offenceType;
    private String criminaldob;
    private LocalDate crimeDate;
    private int noOfCrimes;
    private String punishment;
    private int punishmentDuration;
    private String currentStatus;
    
    //constructor for the initializing class variable.
    
    public criminalPerson(int criminalId,String criminalFirstName, String criminalLastName, int criminalAge, int criminalHeight,
			String offenceType, String criminaldob, LocalDate crimeDate, int noOfCrimes, String punishment,
			int punishmentDuration, String currentStatus) {
		//super();
    	this.criminalId=criminalId;
		this.criminalFirstName = criminalFirstName;
		this.criminalLastName = criminalLastName;
		this.criminalAge = criminalAge;
		this.criminalHeight = criminalHeight;
		this.offenceType = offenceType;
		this.criminaldob = criminaldob;
		this.crimeDate = crimeDate;
		this.noOfCrimes = noOfCrimes;
		this.punishment = punishment;
		this.punishmentDuration = punishmentDuration;
		this.currentStatus = currentStatus;
	}
	//getters and setters
    
	public criminalPerson() {
		// TODO Auto-generated constructor stub
	}

	public String getCriminalFirstName() {
		return criminalFirstName;
	}
	public void setCriminalFirstName(String criminalFirstName) {
		this.criminalFirstName = criminalFirstName;
	}
	public String getCriminalLastName() {
		return criminalLastName;
	}
	public void setCriminalLastName(String criminalLastName) {
		this.criminalLastName = criminalLastName;
	}
	public int getCriminalAge() {
		return criminalAge;
	}
	public void setCriminalAge(int criminalAge) {
		this.criminalAge = criminalAge;
	}
	public int getCriminalHeight() {
		return criminalHeight;
	}
	public void setCriminalHeight(int criminalHeight) {
		this.criminalHeight = criminalHeight;
	}
	public String getOffenceType() {
		return offenceType;
	}
	public void setOffenceType(String offenceType) {
		this.offenceType = offenceType;
	}
	public String getCriminaldob() {
		return criminaldob;
	}
	public void setCriminaldob(String criminaldob) {
		this.criminaldob = criminaldob;
	}
	public LocalDate getCrimeDate() {
		return crimeDate;
	}
	public void setCrimeDate(LocalDate crimeDate) {
		this.crimeDate = crimeDate;
	}
	public int getNoOfCrimes() {
		return noOfCrimes;
	}
	public void setNoOfCrimes(int noOfCrimes) {
		this.noOfCrimes = noOfCrimes;
	}
	public String getPunishment() {
		return punishment;
	}
	public void setPunishment(String punishment) {
		this.punishment = punishment;
	}
	public int getPunishmentDuration() {
		return punishmentDuration;
	}
	public void setPunishmentDuration(int punishmentDuration) {
		this.punishmentDuration = punishmentDuration;
	}
	public String getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public int getCriminalId() {
		return criminalId;
	}

	public void setCriminalId(int criminalId) {
		this.criminalId = criminalId;
	}
}
