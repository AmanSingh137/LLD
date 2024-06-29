package WithStrategy;

import WithStrategy.Strategy.SportsDrivingCapability;

public class SportsVehicle extends Vehicle {
	SportsVehicle() {
		super (new SportsDrivingCapability());
	}
}
