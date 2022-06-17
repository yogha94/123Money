package org.add;

public class GreensTech {
	private void greensOmr() {
		System.out.println("Greens Omr :ty565");
	}

	private void greensOmr(String address) {
		System.out.println("Address :" + address);
	}

	private void greensOmr(int pinNo, long phNo) {
		System.out.println("Pincode Number :" + pinNo + "\nPhone Number :" + phNo);
	}

	private void greensOmr(float avg, String empName, int refNo) {
		System.out.println("Average :" + avg + "\nEmployee Name :" + empName + "\nReference Number" + refNo);
	}

	public static void main(String[] args) {
		GreensTech fg = new GreensTech();
		fg.greensOmr();
		fg.greensOmr("chennai");
		fg.greensOmr(600078, 7686546678l);
		fg.greensOmr(89.9754326f, "Tharun", 6785439);
	}
}
