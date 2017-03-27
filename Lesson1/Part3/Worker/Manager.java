package Part3.Worker;

import Part2.Worker;

public class Manager extends Worker {
	private int Effectiveness;
	public String Goods;
	private boolean Level;
	public int getEffectiveness() {
		return Effectiveness;
	}
	public void setEffectiveness(int effectiveness) {
		Effectiveness = effectiveness;
	}
	public String getGoods() {
		return Goods;
	}
	public void setGoods(String goods) {
		Goods = goods;
	}
	public boolean isLevel() {
		return Level;
	}
	public void setLevel(boolean level) {
		Level = level;
	}
	
}
