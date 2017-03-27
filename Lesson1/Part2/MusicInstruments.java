package Part2;


public class MusicInstruments {
private String InstrumentClass;
private String Type;
private int Size;
private int DateCreate;
private String WhoCreate;
private int Weight;
private int MaxVolume;
private String WhatMaterials;


public MusicInstruments() {
	super();
}
public MusicInstruments(String instrumentClass, String type, int size, int dateCreate, String whoCreate, int weight,
		int maxVolume, String whatMaterials) {
	InstrumentClass = instrumentClass;
	Type = type;
	Size = size;
	DateCreate = dateCreate;
	WhoCreate = whoCreate;
	Weight = weight;
	MaxVolume = maxVolume;
	WhatMaterials = whatMaterials;
}
public String getInstrumentClass() {
	return InstrumentClass;
}
public void setInstrumentClass(String instrumentClass) {
	InstrumentClass = instrumentClass;
}
public String getType() {
	return Type;
}
public void setType(String type) {
	Type = type;
}
public int getSize() {
	return Size;
}
public void setSize(int size) {
	Size = size;
}
public int getDateCreate() {
	return DateCreate;
}
public void setDateCreate(int dateCreate) {
	DateCreate = dateCreate;
}
public String getWhoCreate() {
	return WhoCreate;
}
public void setWhoCreate(String whoCreate) {
	WhoCreate = whoCreate;
}
public int getWeight() {
	return Weight;
}
public void setWeight(int weight) {
	Weight = weight;
}
public int getMaxVolume() {
	return MaxVolume;
}
public void setMaxVolume(int maxVolume) {
	MaxVolume = maxVolume;
}
public String getWhatMaterials() {
	return WhatMaterials;
}
public void setWhatMaterials(String whatMaterials) {
	WhatMaterials = whatMaterials;
}
public static void main(String[] args){
	MusicInstruments violin=new MusicInstruments("Stringed","violin", 50, 1988, "Paganini", 345,
			50, "wood");
	System.out.println("I bought a"+" "+violin.getType());
}
}