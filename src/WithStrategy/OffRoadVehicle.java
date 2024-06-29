package WithStrategy;

import WithStrategy.Strategy.SportsDrivingCapability;

public class OffRoadVehicle extends Vehicle{
	OffRoadVehicle () {
		super(new SportsDrivingCapability());
	}
}
