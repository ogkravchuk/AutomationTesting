package Part3.Goods;

import Part2.Goods;
import Part3.Devices.SmartPhone;

public class NewGoods extends Goods {
	private String whatType;
	private String howLongTime;
	private boolean whatColor;
	public String getWhatType() {
		return whatType;
	}
	public void setWhatType(String whatType) {
		this.whatType = whatType;
	}
	public String getHowLongTime() {
		return howLongTime;
	}
	public void setHowLongTime(String howLongTime) {
		this.howLongTime = howLongTime;
	}
	public boolean isWhatColor() {
		return whatColor;
	}
	public void setWhatColor(boolean whatColor) {
		this.whatColor = whatColor;
	}
	public void checkavailable() {
		
		System.out.println("check the available of NewGoods ");
    }	
	public void checkMark() {
		
		System.out.println("check the mark of NewGoods");
    }
	
		public static void main(String[] args) {
	
		NewGoods Sup = new NewGoods();
		Sup.checkavailable();
		Sup.checkMark();
	}

}
