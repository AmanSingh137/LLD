package WithStrategy.Strategy;

public class SportsDrivingCapability implements DrivingStrategy {
	@Override
	public void drive() {
		System.out.println("Sports driving capability");
	}
}
