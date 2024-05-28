package lab.conditional_satament.overriding.sport;

public class Main {

	public static void main(String[] args) {
		BasketBall bb= new BasketBall();
        FootBall fb = new FootBall();
        Sports s= new Sports();
        Rugby rd= new Rugby();
		s.play();
		bb.play();
		fb.play();
		rd.play();

	}

}
