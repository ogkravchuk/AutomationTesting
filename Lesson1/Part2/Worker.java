package Part2;

public class Worker {
	private String workerName;
	private String workerSurname;
	private int workerAge;
	private int salary;
	private int experience;
	private String position;
	private String gender;
	private boolean family;
	private int child;
	private String duties;
	
	public Worker() {
		super();
	}

	public Worker(String workerName, String workerSurname, int workerAge, int salary, int experience, String position,
			String gender, boolean family, int child, String duties) {
		super();
		this.workerName = workerName;
		this.workerSurname = workerSurname;
		this.workerAge = workerAge;
		this.salary = salary;
		this.experience = experience;
		this.position = position;
		this.gender = gender;
		this.family = family;
		this.child = child;
		this.duties = duties;
	}

	public String getWorkerName() {
		return workerName;
	}
	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}
	public String getWorkerSurname() {
		return workerSurname;
	}
	public void setWorkerSurname(String workerSurname) {
		this.workerSurname = workerSurname;
	}
	public int getWorkerAge() {
		return workerAge;
	}
	public void setWorkerAge(int workerAge) {
		this.workerAge = workerAge;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isFamily() {
		return family;
	}
	public void setFamily(boolean family) {
		this.family = family;
	}
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}
	public String getDuties() {
		return duties;
	}
	public void setDuties(String duties) {
		this.duties = duties;
	}
	public static void main(String[] args){
		Worker one = new Worker("Oleksii", "Kravchuk", 28, 99526565, 15, "manager",
			"male" , true, 2, "test");
		System.out.println(one.workerName+" "+ one.workerSurname+" is "+one.workerAge+" age."+"His salary is "
			+ one.salary+". "+one.workerName+" has "+one.experience+" years experience of work."+" He is "+ one.position);
	}
}


