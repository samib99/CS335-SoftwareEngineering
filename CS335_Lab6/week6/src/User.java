import java.util.ArrayList;
import java.util.*;

public class User {

	private String userName;
	private String level;
	private AccessControl accessControl;
	public static ArrayList<User> ar = new ArrayList<User>();
	public int dupeCount = 0;

	public User(String userName, String level, AccessControl accessControl) {
		this.userName = userName;
		this.level = level;
		this.accessControl = accessControl;
		arAdd();
		arGet();

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public AccessControl getAccessControl() {
		return accessControl;
	}

	public void setAccessControl(AccessControl accessControl) {
		this.accessControl = accessControl;
	}

	public void arAdd() {
		boolean check = true;
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i).userName.equals(userName)) {
				check = false;

			}

		}
		if (check) {
			ar.add(this); // adds name and position to array

		} else {
			dupeCount++;
			System.out.println("ERROR DUPLICATE NAME: " + dupeCount);
		}

	}

	public void arGet() // only allows SUPERUSER to access the information (prints error if not
						// superUSer)
	{
		if (level.equals("SUPERUSER Level")) {
			System.out.println(Arrays.toString(ar.toArray()));
		} else {
			System.out.println("error");
		}
	}

	@Override
	public String toString() {
		return "Name: " + userName + ", Level: " + level + ", Access Control Level:" + accessControl.getControlLevel()
				+ ", Access: " + accessControl.getAccess();
	}

}
