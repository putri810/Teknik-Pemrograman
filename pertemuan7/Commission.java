package pertemuan7;

public class Commission extends Hourly {
	private double totalSales;
	private double commissionRate;
	
	public Commission (String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate)
	{
		super (eName, eAddress, ePhone, socSecNumber, rate);
		this.commissionRate = commissionRate;
	}
	
	public void addSales(double sales) {
		totalSales += sales;
	}
	
	public double pay() {
		double payment = super.pay();
		payment += totalSales * commissionRate;
		totalSales = 0;
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nTotal Sales: " + totalSales;
		return result;
	}
}
