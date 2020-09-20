package utility;

public class adminLogin {
	
     public boolean admin_login(String userId,String userPassword,String name,String Department) {
    	 // creating the object for adminValidation class for checking the validation part 
    	 
    	 adminValidation obj1=new adminValidation();
    	 // local boolean variable to store the value
    	 boolean value;
    	 
    	 // calling the validation method of the adminValidation class
    	 value =obj1.validation(userId, userPassword, name, Department);
    	 
    	 //returning the value to the main method
    	 return value;
     }
}
