package WithStrategy.Strategy;

public class NormalDrivingCapability implements DrivingStrategy {
	@Override
	public void drive() {
		System.out.println("Normal driving capability");
	}
}
