package week1.day3;

//Assignment - 3
public class Bike {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.applyBreak();
		car.soundHorn();

		//we can't access Car class methods by using Bike object
		
		/*
		 * Bike bike = new Bike(); 
		 * bike.applyBreak(); 
		 * bike.soundHorn();
		 */	
	}

}
