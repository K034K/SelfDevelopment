package app;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<>();

		Vehicle bmwX5 = new Car("BMWX5");
		Vehicle author = new Bicycle("Author Turismo");
		Vehicle harley = new Motorcycle("Harley Davidson");
		Vehicle mriya = new Tank("Mriya");

		vehicles.add(bmwX5);
		vehicles.add(author);
		vehicles.add(harley);
		vehicles.add(mriya);
		for (Vehicle v : vehicles) {
			v.move();
			System.out.println(v.getYearOfInvention());
		}
	}
}
