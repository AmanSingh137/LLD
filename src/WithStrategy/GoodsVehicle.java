package WithStrategy;

import WithStrategy.Strategy.HeavyGoodsDrivingCapability;

public class GoodsVehicle extends Vehicle {
	GoodsVehicle () {
		super (new HeavyGoodsDrivingCapability());
	}
}
