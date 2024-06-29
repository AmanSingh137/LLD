package WithStrategy;

import WithStrategy.Strategy.DrivingStrategy;

public class Vehicle {
	DrivingStrategy driveCapabilityObject;
	Vehicle (DrivingStrategy driveCapability) {
		this.driveCapabilityObject = driveCapability;
	}
	public void drive() {
		driveCapabilityObject.drive();
	}
}
