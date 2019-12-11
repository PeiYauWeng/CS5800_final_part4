package Strategy;

public class MilitaryAction {
	private Strategy strategy;
	
	public MilitaryAction(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public String executeStrategy(String direction, int location) {
		return strategy.action(direction, location);
	}
}
