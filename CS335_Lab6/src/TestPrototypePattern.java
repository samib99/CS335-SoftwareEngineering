
//import java.util.*;
public class TestPrototypePattern {

	public static void main(String[] args) {
		AccessControl userAccessControl = AccessControlProvider.getAccessControlObject("USER");
		User user1 = new User("User A", "USER Level", userAccessControl);
		
		System.out.println("************************************");
		System.out.println(user1);
		
		userAccessControl = AccessControlProvider.getAccessControlObject("USER");
		User user2 = new User("User C", "USER Level", userAccessControl);
		System.out.println("Changing access control of: "+user2.getUserName());
		user2.getAccessControl().setAccess("READ REPORTS");
		System.out.println(user2);
		
		System.out.println("************************************");
		
		AccessControl managerAccessControl = AccessControlProvider.getAccessControlObject("MANAGER");
		User user3 = new User("User C", "MANAGER Level", managerAccessControl);
		System.out.println(user3);
		
		System.out.println("************************************");

		
		AccessControl superuserAccessControl = AccessControlProvider.getAccessControlObject("SUPERUSER");
		User user4 = new User("User D", "SUPERUSER Level", superuserAccessControl);
		System.out.println(user4);
		
		System.out.println("************************************");

		user4.arGet();
	}
}
