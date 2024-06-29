package WithStrategy;

public class Main {
	public static void main(String args[]) {
		Vehicle gWagon = new OffRoadVehicle();
		Vehicle wagonR = new PassengerVehicle();
		Vehicle huracan = new SportsVehicle();
		Vehicle volvo = new GoodsVehicle();
		gWagon.drive();
		wagonR.drive();
		huracan.drive();
		volvo.drive();
	}
}
