package Part3.Worker;

import Part2.Worker;

public class TopManager extends Worker {
	public boolean haveContract;
	public int whatFloorLocate;
	public boolean haveSecretary;
	public boolean isHaveContract() {
		return haveContract;
	}
	public void setHaveContract(boolean haveContract) {
		this.haveContract = haveContract;
	}
	public int getWhatFloorLocate() {
		return whatFloorLocate;
	}
	public void setWhatFloorLocate(int whatFloorLocate) {
		this.whatFloorLocate = whatFloorLocate;
	}
	public boolean isHaveSecretary() {
		return haveSecretary;
	}
	public void setHaveSecretary(boolean haveSecretary) {
		this.haveSecretary = haveSecretary;
	}
	
}
