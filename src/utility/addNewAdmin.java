package utility;
import model.adminOfficer;
public class addNewAdmin {
		public boolean add_new_admin(String id,String password,String name,String Department){
			
			adminValidation obj1=new adminValidation();
			obj1.list.add(new adminOfficer(id,password ,name ,Department));
			return true;
		}
}
