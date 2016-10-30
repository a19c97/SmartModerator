package conference;

public class Character {

	private String name; //first and last name
	private String position;
	private String presence;
	private String remarks; //remarks for awards consideration
	
	public Character(String name, String position) {
		this.name = name;
		this.position = position;
	}
	
	public void rollCall(String presence){
		this.presence = presence;
	}
	
}
