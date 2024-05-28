package lab.conditional_satament.overriding.sport.bank;

public class CheckingAccount extends Bank{

	private static final double OVERDRAFT_FEE = 35.0;
	private static final double OVERDRAFT_LIMIT = 500.0;
	public CheckingAccount(double initalBalance) {
		super(initalBalance);
		// TODO Auto-generated constructor stub
	}
	 public void withDraw(double amount) {
		 if(amount>0) {
			 if(amount <= balance) {
				 balance= balance-amount;
				 System.out.println("withdraw : $"+ amount + " from checking Account . New  balance $"+ balance);
			 }else if( amount <= balance +OVERDRAFT_FEE) {
				 balance = balance-(amount +OVERDRAFT_FEE);
				 System.out.println(amount +balance);
			 }else {
				 System.out.println("withdrawal amount exceeds the overdraft limit  of $ "+ OVERDRAFT_LIMIT);
			 }
		 }else {
			 System.out.println("withdrawal amount must be positive.");
		 }
	 }
	 
}
