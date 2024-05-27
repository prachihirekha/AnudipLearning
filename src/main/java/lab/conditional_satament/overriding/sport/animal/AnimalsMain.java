package src.main.java.lab.conditional_satament.overriding.sport.animal;

public class AnimalsMain {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Animal b = new Birds();
		b.makeSound();
		b.move();
       Animal p = new Panther();
       p.move();
       p.makeSound();
	}

}
