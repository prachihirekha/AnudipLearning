package src.main.java.lab.conditional_satament.overriding.sport;

public class Main {

	public static void main(String[] args) {
		BasketBall bb= new BasketBall();
		FootBall fb = new FootBall();
		Rugby rd = new Rugby();
		Sports s = new Sports();
		s.play();
		bb.play();
		fb.play();
		rd.play();

	}

}
