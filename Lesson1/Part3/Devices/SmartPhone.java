package Part3.Devices;

import Part2.Devices;

public class SmartPhone extends Devices{
	private String howManySim;
	private int yearCreate;
	private int guaranteeTime;

	public String getHowManySim() {
		return howManySim;
	}
	public void setHowManySim(String howManySim) {
		this.howManySim = howManySim;
	}
	public int getYearCreate() {
		return yearCreate;
	}
	public void setYearCreate(int yearCreate) {
		this.yearCreate = yearCreate;
	}
	public int getGuaranteeTime() {
		return guaranteeTime;
	}
	public void setGuaranteeTime(int guaranteeTime) {
		this.guaranteeTime = guaranteeTime;
	}
	public void checkavailable() {
		
		System.out.println("check the available of SmaartPhone ");
    }	
	public void checkMark() {
		
		System.out.println("check the mark of SmaartPhone");
    }
	
		public static void main(String[] args) {
	
		SmartPhone mx5 = new SmartPhone();
		mx5.checkavailable();
		mx5.checkMark();
	}
	
}
