package begginer;

public class Task3 {
	static int a;

	public Task3(int a) {
		this.a = a;
	}


	public boolean checkNumbers(int a){
		boolean result=false;
		if ((a>=0)&&((a%3==0)||(a%5==0)))
			result=true;
		return result;
	}
	public static void main(String[] args){
		Task3 Three=new Task3(555);
		System.out.println(Three.checkNumbers(a));
		
		}


}
