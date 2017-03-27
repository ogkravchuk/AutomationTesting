package Part3.CustomerGoods;

import Part2.CustomerGoods;

public class NotEatFood extends CustomerGoods {
	private String Name;
	private String Mark;
	private String Type;
	
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
	public void checkavailable() {
					
		System.out.println("check the ability ");
    }	
	public void checkMark() {
		
		System.out.println("check the mark ");
    }
	
		public static void main(String[] args) {
	
		NotEatFood Credit = new NotEatFood();
		Credit.checkavailable();
		Credit.checkMark();
	}
}
