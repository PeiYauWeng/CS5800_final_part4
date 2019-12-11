package Strategy;

public class Withdraw implements Strategy {
	@Override
	public String action(String direction, int location) {
		return "Soldiers withdraw "+ direction + "-" + location + " area";
	}
}
