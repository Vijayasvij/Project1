package org.com;

public class HDFC implements WorldBank,RBIBank {

	@Override
	public void deposit() {
		System.out.println("Deposit:15%");
		
	}

	@Override
	public void saving() {
		System.out.println("Saving:12%");
		
	}

	@Override
	public void loan() {
	 System.out.println("laon:8%");
		
	}
	private void fixed() {
		System.out.println("fixed:5%");

	}
	public static void main(String[] args) {
	HDFC h = new HDFC();
	h.deposit();
	h.saving();
	h.loan();
	h.fixed();
	
	
	}

}
