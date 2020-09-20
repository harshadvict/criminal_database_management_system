package utility;

import java.util.*;

import model.adminOfficer;

public class adminValidation {
	
	// array list for admin data
	
	ArrayList<adminOfficer> list= new ArrayList<adminOfficer>();
	
	// initializing the data inside the array
	public adminValidation(){
		list.add( new adminOfficer("admin","pass","harsh","CID"));
	}
	
     public boolean validation(String userId,String userPassword,String name,String Department) {
    	 
    	 // boolean value to check the validation
    	 boolean value=false;
    	 
    	 // loop for traversing the arrayList
    	 for(int i=0;i<list.size();i++)
    	 {		 
    		 adminOfficer admin=list.get(i);
    	 if(admin.getUserId().equals(userId) && admin.getUserPassword().equals(userPassword) && admin.getDepartment().equals(Department) && admin.getName().equals(name)) {
    		 value =true;
    	 }
    	 }
    	return value;
    }
}