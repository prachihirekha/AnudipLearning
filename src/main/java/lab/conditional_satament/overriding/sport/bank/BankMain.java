package lab.conditional_satament.overriding.sport.bank;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new SavingAccount(1500.0);
		b.deposit(500);
		b.withDraw(200);
		b.withDraw(1100);
		Bank c = new CheckingAccount(1000.0);
		c.deposit(300);
		c.withDraw(200);
		c.withDraw(1200);
		c.withDraw(1700);

	}

}
