package user;

public abstract class Person {
	private String id;
	private String userName;
	
	protected Person(String id, String userName) {
		setId(id);
		setUserName(userName);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}
