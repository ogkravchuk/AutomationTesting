package Part3.Devices;

import Part2.Devices;
import Part3.CustomerGoods.Other;

public class Computer extends Devices {
    private boolean keyboard;
    private String type;
    private boolean mouse;
  
	public boolean isKeyboard() {
		return keyboard;
	}
	public void setKeyboard(boolean keyboard) {
		this.keyboard = keyboard;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean ismouse() {
		return mouse;
	}
	public void setHandwriting(boolean mouse) {
		mouse = mouse;
	}

	public void checkavailable() {
		
		System.out.println("check the board ");
    }	
	public void checkMark() {
		
		System.out.println("check the mouse");
    }
	
		public static void main(String[] args) {
	
		Computer Mac = new Computer();
		Mac.checkavailable();
		Mac.checkMark();
	}

}
