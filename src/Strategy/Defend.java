package Strategy;

public class Defend implements Strategy {
	@Override
	public String action(String direction, int location) {
		return "Soldiers defend "+ direction + "-" + location +" area";
	}
}
