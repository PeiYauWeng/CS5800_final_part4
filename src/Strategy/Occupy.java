package Strategy;

public class Occupy implements Strategy{
	@Override
	public String action(String direction, int location) {
		return "Soldiers ocuppy "+ direction + "-" + location + " area";
	}
}
