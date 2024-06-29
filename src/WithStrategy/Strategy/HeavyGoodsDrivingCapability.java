package WithStrategy.Strategy;

public class HeavyGoodsDrivingCapability implements DrivingStrategy {
	@Override
	public void drive() {
		System.out.println("Heavy good driving capability");
	}
}
