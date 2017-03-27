package Part2;

public class Devices {
	private String devicesName;
	private String devicesModel;
	private String devicesOperationSystem;
	private boolean devicesHaveTouchScreen;
	private String devicesColor;
	private double devicesSize;
	private double devicesWeight;
	private boolean devicesCamera;
	private int devicesCamPix;
	private boolean devicesFrontCam;
	private boolean devicesButtons;
	
	public Devices() {
	}
	public Devices(String devicesName, String devicesModel, String devicesOperationSystem,
			boolean devicesHaveTouchScreen, String devicesColor, double devicesSize, double devicesWeight,
			boolean devicesCamera, int devicesCamPix, boolean devicesFrontCam, boolean devicesButtons) {
		this.devicesName = devicesName;
		this.devicesModel = devicesModel;
		this.devicesOperationSystem = devicesOperationSystem;
		this.devicesHaveTouchScreen = devicesHaveTouchScreen;
		this.devicesColor = devicesColor;
		this.devicesSize = devicesSize;
		this.devicesWeight = devicesWeight;
		this.devicesCamera = devicesCamera;
		this.devicesCamPix = devicesCamPix;
		this.devicesFrontCam = devicesFrontCam;
		this.devicesButtons = devicesButtons;
	}
	public String getDevicesName() {
		return devicesName;
	}
	public void setDevicesName(String devicesName) {
		this.devicesName = devicesName;
	}
	public String getDevicesModel() {
		return devicesModel;
	}
	public void setDevicesModel(String devicesModel) {
		this.devicesModel = devicesModel;
	}
	public String getDevicesOperationSystem() {
		return devicesOperationSystem;
	}
	public void setDevicesOperationSystem(String devicesOperationSystem) {
		this.devicesOperationSystem = devicesOperationSystem;
	}
	public boolean isDevicesHaveTouchScreen() {
		return devicesHaveTouchScreen;
	}
	public void setDevicesHaveTouchScreen(boolean devicesHaveTouchScreen) {
		this.devicesHaveTouchScreen = devicesHaveTouchScreen;
	}
	public String getDevicesColor() {
		return devicesColor;
	}
	public void setDevicesColor(String devicesColor) {
		this.devicesColor = devicesColor;
	}
	public double getDevicesSize() {
		return devicesSize;
	}
	public void setDevicesSize(double devicesSize) {
		this.devicesSize = devicesSize;
	}
	public double getDevicesWeight() {
		return devicesWeight;
	}
	public void setDevicesWeight(double devicesWeight) {
		this.devicesWeight = devicesWeight;
	}
	public boolean isDevicesCamera() {
		return devicesCamera;
	}
	public void setDevicesCamera(boolean devicesCamera) {
		this.devicesCamera = devicesCamera;
	}
	public int getDevicesCamPix() {
		return devicesCamPix;
	}
	public void setDevicesCamPix(int devicesCamPix) {
		this.devicesCamPix = devicesCamPix;
	}
	public boolean getDevicesFrontCam() {
		return devicesFrontCam;
	}
	public void setDevicesFrontCam(boolean devicesFrontCam) {
		this.devicesFrontCam = devicesFrontCam;
	}
	public boolean isDevicesButtons() {
		return devicesButtons;
	}
	public void setDevicesButtons(boolean devicesButtons) {
		this.devicesButtons = devicesButtons;
	}
	public static void main(String[] args){
		Devices iphone=new Devices("Iphone", "6S", "IOS", true, "Black", 64.65, 361.75, true, 21, true, false);
		System.out.println(iphone.getDevicesName()+iphone.getDevicesModel()+iphone.getDevicesColor()
		+iphone.getDevicesOperationSystem());
	}
}
