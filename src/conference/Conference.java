package conference;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Conference {

	private Character[] characters;
	private ConcurrentLinkedQueue<EventM> events;
	private int speakingTime;
	private String committeeName;
	private int quorum;
	private SpeakersList speakersList;

	public Conference(Character[] characters, String committeeName) {
		this.characters = characters;
		this.committeeName = committeeName;
		this.setQuorum((int) Math.ceil(0.5 * characters.length));
	}

	public void runConference() throws InterruptedException{
		this.rollCall();
		while(true){
			while(!this.events.isEmpty()){
				events.poll().execute();
			}
			this.speakersList.execute();
		}
	}

	public void rollCall() {
		for (int i = 0; i < characters.length; i++) {
			// TODO
			// do roll call on this character
		}
	}

	public int getSpeakingTime() {
		return speakingTime;
	}

	public void setSpeakingTime(int speakingTime) {
		this.speakingTime = speakingTime;
	}

	public int getQuorum() {
		return quorum;
	}

	public void setQuorum(int quorum) {
		this.quorum = quorum;
	}

	public static void main(String[] args) {
		
		Character nixon = new Character("Nixon", "POTUS");
		Character kissinger = new Character("Kissinger", "National Security Advisor");
		Character rogers = new Character("Rogers", "Sectretary of State");
		Character[] nixonCharacters = {nixon, kissinger, rogers};
		Conference c = new Conference(nixonCharacters, "A War For Peace");
		System.out.println(c.getQuorum()); //2
	}

}
