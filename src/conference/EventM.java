package conference;

public abstract class EventM {

	private int time; //in secs
	
	public EventM(int time){
		this.setTime(time);
	}
	
	public void execute(){
		
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
}
