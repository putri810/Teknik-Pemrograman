package programATM;

public class CashDispenser {
	private final static int INITIAL_COUNT = 500;
	private int count;
	
	public CashDispenser() {
		count = INITIAL_COUNT;
	}
	
	public void dispenseCash(int amount) {
		int  billRequired = amount / 20;
		count -= billRequired;
	}
	
	public boolean isSufficientCashAvailable(int amount) {
		int billRequired = amount / 20;
		if (count >= billRequired)
			return true;
		else
			return false;
	}
}
