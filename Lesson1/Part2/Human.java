package Part2;

public class Human {
private String humanName;
private String humanSurname;
private int humanAge;
private Goods myGood;
private Passcard myPasscard;


	public String getHumanName() {
	return humanName;
}


public void setHumanName(String humanName) {
	this.humanName = humanName;
}


public String getHumanSurname() {
	return humanSurname;
}


public void setHumanSurname(String humanSurname) {
	this.humanSurname = humanSurname;
}


public int getHumanAge() {
	return humanAge;
}


public void setHumanAge(int humanAge) {
	this.humanAge = humanAge;
}


public Goods getMyGood() {
	return myGood;
}


public void setMyGood(Goods myGood) {
	this.myGood = myGood;
}


public Passcard getMyPasscard() {
	return myPasscard;
}


public void setMyPasscard(Passcard myPasscard) {
	this.myPasscard = myPasscard;
}


	public static void main(String[] args) {
		Passcard oleksiiPasscard = new Passcard(2);
		
		Human oleksii = new Human();
		oleksii.setMyPasscard(oleksiiPasscard);
		System.out.println(oleksii.getMyPasscard());

	}

}
