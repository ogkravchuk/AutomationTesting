package Part3.Passcard;

import Part2.Passcard;

public class Temporary extends Passcard {
	private String whatDocument;
	private int howManyDays;
	private String nameOfCompany;
	public String getWhatDocument() {
		return whatDocument;
	}
	public void setWhatDocument(String whatDocument) {
		this.whatDocument = whatDocument;
	}
	public int getHowManyDays() {
		return howManyDays;
	}
	public void setHowManyDays(int howManyDays) {
		this.howManyDays = howManyDays;
	}
	public String getNameOfCompany() {
		return nameOfCompany;
	}
	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}
	
	
}
