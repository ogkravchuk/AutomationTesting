package Part2;

public class Passcard {
	private String nameOfUser;
	private int whatFloor;
	private boolean availibility;
	
	
	public Passcard(int whatFloor) {
		this.whatFloor = whatFloor;
	}


	public Passcard() {
		// TODO Auto-generated constructor stub
	}


	public String getNameOfUser() {
		return nameOfUser;
	}


	public void setNameOfUser(String nameOfUser) {
		this.nameOfUser = nameOfUser;
	}


	public int getWhatFloor() {
		return whatFloor;
	}


	public void setWhatFloor(int whatFloor) {
		this.whatFloor = whatFloor;
	}


	public boolean isAvailibility() {
		return availibility;
	}


	public void setAvailibility(boolean availibility) {
		this.availibility = availibility;
	}


	public static void main(String[] args){
		Passcard one = new Passcard();
		Passcard two = new Passcard();
		one.setNameOfUser("Oleksii");
		two.setNameOfUser("Sergii");
		one.setWhatFloor(2);
		two.setWhatFloor(4);
		one.setAvailibility(false);
		two.setAvailibility(true);
		System.out.println(one.getNameOfUser()+" can go to "+ one.getWhatFloor()+" floor"+" because his passcards is "+two.isAvailibility());
		System.out.println(two.getNameOfUser()+" can't go to "+ two.getWhatFloor()+" floor"+" because his passcards is "+one.isAvailibility());

		
		
	}
}
