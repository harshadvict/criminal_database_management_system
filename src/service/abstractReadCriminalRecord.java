package service;

//abstract class which contains the abstract method readRecord

public abstract class abstractReadCriminalRecord {
	
	//using method overloading concept
	
     public abstract void readRecord();
     public abstract boolean readRecord(int id);
	public abstract boolean readRecord(String name);
}
