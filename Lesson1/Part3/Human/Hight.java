package Part3.Human;

import Part2.Human;
import Part3.Goods.PhysicalGoods;

public class Hight extends Human {
	private String whereFrom;
	private String whatNationals;
	private String whatWeight;
	public String getWhereFrom() {
		return whereFrom;
	}
	public void setWhereFrom(String whereFrom) {
		this.whereFrom = whereFrom;
	}
	public String getWhatNationals() {
		return whatNationals;
	}
	public void setWhatNationals(String whatNationals) {
		this.whatNationals = whatNationals;
	}
	public String getWhatWeight() {
		return whatWeight;
	}
	public void setWhatWeight(String whatWeight) {
		this.whatWeight = whatWeight;
	}
	public void checkavailable() {
		
		System.out.println("check the national of HightHuman ");
    }	
	public void checkMark() {
		
		System.out.println("check the age of HightHuman");
    }
	
		public static void main(String[] args) {
	
		Hight HightHuman = new Hight();
		HightHuman.checkavailable();
		HightHuman.checkMark();
	}
}
