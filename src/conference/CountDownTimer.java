package conference;

public class CountDownTimer {

	public void countDown(int sec) throws InterruptedException{
		int timeRemain = sec;
		Thread thread = new Thread();
		while (timeRemain>=0){
			if(timeRemain==5){
				System.out.println("!");
			}else{
				System.out.println(timeRemain);
			}
			Thread.sleep(1000);
			timeRemain--;
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		CountDownTimer countDown = new CountDownTimer();
		countDown.countDown(5);
	}

}
