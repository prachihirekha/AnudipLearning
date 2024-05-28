package lab.conditional_satament.overriding.sport.bank;

public class SavingAccount extends Bank{
	 //private static final double WITHDRAWAL_LIMIT = 1000.0;
	private static final double WITHDRAWAL_LITMT = 1000.0;

	public SavingAccount(double initalBalance) {
		super(initalBalance);
	}
		
	void withdraw(double amount) {
		if(amount > 0  &&  amount <= WITHDRAWAL_LITMT ) {
			if(amount <= balance){
				balance = balance-amount;
				System.out.println("withdraw:$"+ amount+"from saving account $"+ balance);
			}else {
				System.out.println("Insufficienct funds in saving account.");
			}
		}else{
			System.out.println("withdrawal amount exceeds the saving account limit of $ "+ WITHDRAWAL_LITMT);
		}
	}

}
