package conference;

import java.util.concurrent.ConcurrentLinkedQueue;

public class SpeakersList {

	private int speakingTime;
	private ConcurrentLinkedQueue<Character> speakers;
	
	public SpeakersList(int speakingTime){
		//TODO add speakers - how?
		this.speakingTime = speakingTime;
	}

	public void execute() throws InterruptedException{
		CountDownTimer countDown = new CountDownTimer();
		while(!speakers.isEmpty()){
			Character speaker = speakers.poll();
			countDown.countDown(this.speakingTime);
		}
	}
	
}
