package Part3.Human;

import Part2.Human;

public class Yellow extends Human {
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
		
		System.out.println("check the national of YellowMan ");
    }	
	public void checkMark() {
		
		System.out.println("check the age of YellowMan");
    }
	
		public static void main(String[] args) {
	
		Yellow YellowMan = new Yellow();
		YellowMan.checkavailable();
		YellowMan.checkMark();
	}
}
