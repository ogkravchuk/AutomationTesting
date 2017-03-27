package Part3.MusicInstruments;

import Part2.MusicInstruments;
import Part3.Human.Yellow;

public class AutomaticallyCreate extends MusicInstruments {
	public String nameOfFactory;
	public String nameOfRobot;
	public int howMany;
	public String getNameOfFactory() {
		return nameOfFactory;
	}
	public void setNameOfFactory(String nameOfFactory) {
		this.nameOfFactory = nameOfFactory;
	}
	public String getNameOfRobot() {
		return nameOfRobot;
	}
	public void setNameOfRobot(String nameOfRobot) {
		this.nameOfRobot = nameOfRobot;
	}
	public int getHowMany() {
		return howMany;
	}
	public void setHowMany(int howMany) {
		this.howMany = howMany;
	}
	public void checkavailable() {
		
		System.out.println("check who create");
    }	
	public void checkMark() {
		
		System.out.println("check why Create");
    }
	
		public static void main(String[] args) {
	
		AutomaticallyCreate Auto = new AutomaticallyCreate();
		Auto.checkavailable();
		Auto.checkMark();
	}

}
