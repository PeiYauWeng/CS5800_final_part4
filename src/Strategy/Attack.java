package Strategy;

public class Attack implements Strategy{
	@Override
	public String action(String direction, int location) {
		return "Soldiers attack " + direction + "-" + location + " area";
	}
}
