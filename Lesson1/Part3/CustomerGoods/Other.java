package Part3.CustomerGoods;

import Part2.CustomerGoods;

public class Other extends CustomerGoods {
	private String Name;
	private String Brand;
	private String Type;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public void checkavailable() {
		
		System.out.println("check the wtf ");
    }	
	public void checkMark() {
		
		System.out.println("check the not wtf ");
    }
	
		public static void main(String[] args) {
	
		Other oops = new Other();
		oops.checkavailable();
		oops.checkMark();
	}

}
