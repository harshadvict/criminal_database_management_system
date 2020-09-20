
package model;

/**
 * @author harsh
 *
 */
public class adminOfficer {

	// class variable;
	
	 private String userId;
     private String userPassword;
     private String name;
     private String department;
     
     //constructor
     public adminOfficer(String userId, String userPassword, String name, String department) {
 		//super();
 		this.userId = userId;
 		this.userPassword = userPassword;
 		this.name = name;
 		this.department = department;
 	}
     
     
     // getters and setters
     
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
