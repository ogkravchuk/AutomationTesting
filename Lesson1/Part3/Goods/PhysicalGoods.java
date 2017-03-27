package Part3.Goods;

import Part2.Goods;

public class PhysicalGoods extends Goods{
	private String Color;
	private String Type;
	private double Weight;
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public double getWeight() {
		return Weight;
	}
	public void setWeight(double weight) {
		Weight = weight;
	}

	public void checkavailable() {
		
		System.out.println("check the available of PhysicalGoods ");
    }	
	public void checkMark() {
		
		System.out.println("check the mark of PhysicalGoods");
    }
	
		public static void main(String[] args) {
	
		PhysicalGoods Car = new PhysicalGoods();
		Car.checkavailable();
		Car.checkMark();
	}
	

}
