package Part3.Goods;

import Part2.Goods;

public class NonPhysicalGoods extends Goods {
	
	private String whatKind;
	private String howLong;
	private String howToCheck;
	public String getWhatKind() {
		return whatKind;
	}
	public void setWhatKind(String whatKind) {
		this.whatKind = whatKind;
	}
	public String getHowLong() {
		return howLong;
	}
	public void setHowLong(String howLong) {
		this.howLong = howLong;
	}
	public String getHowToCheck() {
		return howToCheck;
	}
	public void setHowToCheck(String howToCheck) {
		this.howToCheck = howToCheck;
	}
	public void checkavailable() {
		
		System.out.println("check the available of NonPhysicalGoods ");
    }	
	public void checkMark() {
		
		System.out.println("check the mark of NonPhysicalGoods");
    }
	
		public static void main(String[] args) {
	
		NonPhysicalGoods Soon = new NonPhysicalGoods();
		Soon.checkavailable();
		Soon.checkMark();
	}
}
