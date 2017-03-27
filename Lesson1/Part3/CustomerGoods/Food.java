package Part3.CustomerGoods;

import Part2.CustomerGoods;

public class Food extends CustomerGoods{
	private String Name;
	private String Mark;
	private String Type;
	private boolean Packed;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMark() {
		return Mark;
	}
	public void setMark(String mark) {
		Mark = mark;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public boolean isPacked() {
		return Packed;
	}
	public void setPacked(boolean packed) {
		Packed = packed;
	}
	public void checkavailable() {
		
		System.out.println("check the limon ");
    }	
	public void checkMark() {
		
		System.out.println("check the apple ");
    }
	
		public static void main(String[] args) {
	
		Food Apple = new Food();
		Apple.checkavailable();
		Apple.checkMark();
	}
}
