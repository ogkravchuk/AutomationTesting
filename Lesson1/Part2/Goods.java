package Part2;

public class Goods {
	// atributes
	private String nameOfGood;
	private double priceOfGood;
	private boolean isAvailible;
//class constructors
	public Goods (String nameOfGood, double priceOfGood, boolean isAvailible){
		this.nameOfGood=nameOfGood;
		this.priceOfGood=priceOfGood;
		this.isAvailible=isAvailible;

	}
	public Goods() {
	
}
	// methods
	public String getNameOfGood() {
		return nameOfGood;
	}

	public void setNameOfGood(String newNameOfGood) {
		nameOfGood = newNameOfGood;
	}

	public double getPriceOfGood() {
		return priceOfGood;
	}

	public void setPriceOfGood(double newPriceOfGood) {
		priceOfGood = newPriceOfGood;
	}

	public boolean ifAvailible() {
		return isAvailible;
	}

	public void isAvailible(boolean newState) {
		isAvailible = newState;
	}
	public static void main(String[] args){
		Goods apple = new Goods("Lemon", 15.75, false);
		Goods pineapple = new Goods();
		
		pineapple.setNameOfGood("Pineapple");
		
		pineapple.setPriceOfGood(90.75);
		
		pineapple.isAvailible(true);
		
		System.out.println("Sergii bought " + apple.getNameOfGood() + " Its price is " + apple.getPriceOfGood()
				+ ". Now its availability is " + apple.ifAvailible());
		System.out.println("Oleksii bought " + pineapple.getNameOfGood() + " Its price is " + pineapple.getPriceOfGood()
				+ ". Now its availability is " + pineapple.ifAvailible());		
	}
}
