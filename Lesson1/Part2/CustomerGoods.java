package Part2;

public class CustomerGoods {
	private String nameOfCusGood;
	private double priceOfCusGood;
	private boolean isAvailibleCus;
	private String whatIsColour;
	
	
		public CustomerGoods(String nameOfCusGood, double priceOfCusGood, boolean isAvailibleCus, String whatIsColour) {
			this.nameOfCusGood=nameOfCusGood;
			this.priceOfCusGood=priceOfCusGood;
			this.isAvailibleCus=isAvailibleCus;
			this.whatIsColour=whatIsColour;
		// TODO Auto-generated constructor stub
	}
		public CustomerGoods() {
		}
		public String getNameOfCusGood() {
		return nameOfCusGood;
	}
	public void setNameOfCusGood(String nameOfCusGood) {
		this.nameOfCusGood = nameOfCusGood;
	}

	public double getPriceOfCusGood() {
		return priceOfCusGood;
	}

	public void setPriceOfCusGood(double priceOfCusGood) {
		this.priceOfCusGood = priceOfCusGood;
	}

	public boolean ifAvailibleCus() {
		return isAvailibleCus;
	}

	public void isAvailibleCus(boolean isAvailibleCus) {
		this.isAvailibleCus = isAvailibleCus;
	}
	public String getWhatIsColour() {
		return whatIsColour;
	}

	public void setWhatIsColour(String whatIsColour) {
		this.whatIsColour = whatIsColour;
	}
	public static void main(String[] args){
		CustomerGoods apple = new CustomerGoods("Lemon", 15.75, false, "Green");
		CustomerGoods pineapple = new CustomerGoods();
		
		pineapple.setNameOfCusGood("Pineapple");
		
		pineapple.setPriceOfCusGood(90.75);
		
		pineapple.isAvailibleCus(true);
		
		pineapple.setWhatIsColour("Yellow");
		
		System.out.println("Sergii bought " + apple.getNameOfCusGood() + " Its price is " + apple.getPriceOfCusGood()
				+ ". Now its availability is " + apple.ifAvailibleCus()+". Its colour is " + apple.getWhatIsColour());
		System.out.println("Oleksii bought " + pineapple.getNameOfCusGood() + " Its price is " + pineapple.getPriceOfCusGood()
				+ ". Now its availability is " + pineapple.ifAvailibleCus()+". Its colour is " + pineapple.getWhatIsColour());	
	}
}
