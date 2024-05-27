package src.main.java.lab.conditional_satament.overriding.sport.vehical;


public class VehicalMain {
	public static void main (String args[]) {
		Vehicle v= new Car();
		v.startEngine();
		v.stopEngine();
		Vehicle m = new MotorCycle();
		m.startEngine();
		m.stopEngine();
	}

}
