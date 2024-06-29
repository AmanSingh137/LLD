package WithStrategy;

import WithStrategy.Strategy.NormalDrivingCapability;

public class PassengerVehicle extends Vehicle{
	PassengerVehicle () {
		super(new NormalDrivingCapability());
	}
}
