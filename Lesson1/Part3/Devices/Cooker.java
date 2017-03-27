package Part3.Devices;

import Part2.Devices;

public class Cooker extends Devices {
	private int howManyBurnet;
	private int whatTemperature;
	private boolean haveOven;
			
	public Cooker() {
		this.howManyBurnet = howManyBurnet;
		this.whatTemperature = whatTemperature;
		this.haveOven = haveOven;
	}
	public int getHowManyBurnet() {
		return howManyBurnet;
	}
	public void setHowManyBurnet(int howManyBurnet) {
		this.howManyBurnet = howManyBurnet;
	}
	public int getWhatTemperature() {
		return whatTemperature;
	}
	public void setWhatTemperature(int whatTemperature) {
		this.whatTemperature = whatTemperature;
	}
	public boolean isHaveOven() {
		return haveOven;
	}
	public void setHaveOven(boolean haveOven) {
		this.haveOven = haveOven;
	}
	public void checkavailable() {
		
		System.out.println("check the cooker ");
    }	
	public void checkMark() {
		
		System.out.println("check the mark of cooker");
    }
	
		public static void main(String[] args) {
	
		Cooker oop = new Cooker();
		oop.checkavailable();
		oop.checkMark();
	}
}
