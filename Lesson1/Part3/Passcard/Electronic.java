package Part3.Passcard;

import Part2.Passcard;

public class Electronic extends Passcard {
	private String whereStore;
	private String whyElectronic;
	private int whenCreate;
	
	public String getWhereStore() {
		return whereStore;
	}
	public void setWhereStore(String whereStore) {
		this.whereStore = whereStore;
	}
	public String getWhyElectronic() {
		return whyElectronic;
	}
	public void setWhyElectronic(String whyElectronic) {
		this.whyElectronic = whyElectronic;
	}
	public int getWhenCreate() {
		return whenCreate;
	}
	public void setWhenCreate(int whenCreate) {
		this.whenCreate = whenCreate;
	}
	
}
