package Strategy;

public class Main {
	public static void main(String[] args) {
		MilitaryAction militaryAction = new MilitaryAction(new Attack());
		System.out.println("Military order: "+ militaryAction.executeStrategy("North", 12));
		
		militaryAction = new MilitaryAction(new Defend());
		System.out.println("Military order: "+ militaryAction.executeStrategy("East", 10));
		
		militaryAction = new MilitaryAction(new Occupy());
		System.out.println("Military order: "+ militaryAction.executeStrategy("North", 12));
		
		militaryAction = new MilitaryAction(new Withdraw());
		System.out.println("Military order: "+ militaryAction.executeStrategy("East", 8));
	}
}
