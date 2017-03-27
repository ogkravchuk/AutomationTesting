package Part3.Worker;

import Part2.Worker;

public class Economist extends Worker {
	private String whatToDo;
	private String whatArea;
	private String Projects;
	
	public String getWhatToDo() {
		return whatToDo;
	}
	public void setWhatToDo(String whatToDo) {
		this.whatToDo = whatToDo;
	}
	public String getWhatArea() {
		return whatArea;
	}
	public void setWhatArea(String whatArea) {
		this.whatArea = whatArea;
	}
	public String getProjects() {
		return Projects;
	}
	public void setProjects(String projects) {
		Projects = projects;
	}
	
}
