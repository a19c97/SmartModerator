package conference;

public class Voting extends EventM{
	
	private Directive directive;

	public Voting(int time, Directive directive) {
		super(time);
		this.directive = directive;
	}
	
	public void execute(){
		//TODO
	}
}
