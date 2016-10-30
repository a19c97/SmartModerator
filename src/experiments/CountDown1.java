package experiments;

public class CountDown1 {

	public static void countDown(int sec) throws InterruptedException{
		//This method can count down from ten seconds to zero.
		int timeRemain = sec;
		Thread thread = new Thread();
		while (timeRemain>=0){
			if(timeRemain==5){
				System.out.println("Bang gavel!");
			}else{
				System.out.println(timeRemain);
			}
			Thread.sleep(1000);
			timeRemain--;
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		countDown(10);
	}

}
