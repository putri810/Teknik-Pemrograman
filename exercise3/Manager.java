package exercise3;

import java.util.*;

class Manager extends Employee{
	public Manager (String n, double s, int d, int m, int y){
		super(n, s, d, m, y);
		secretaryName = "";
	}
	
	public void raiseSalary(double byPercent){
	// add 1/2% bonus for every year of service
		GregorianCalendar todaysDate = new GregorianCalendar();
		int currentYear = todaysDate.get(Calendar.YEAR);
		double bonus = 0.5 * (currentYear - hireYear());
		super.raiseSalary(byPercent + bonus);
	}
	
	public String getSecretaryName(){
		return secretaryName;
	}
	
	public int compare(Sortable b) {
		Manager eb =(Manager) b;
		if (salary < eb.salary) return - 1;
		if (salary > eb.salary) return + 1;
		return 0;
	}
	
	private String secretaryName;
	
	interface Sortable {
		public int compare(Sortable b);
	}
}
