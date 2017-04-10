package beginner;

public class Task10 {

	private static void print(int n){
		String s = "";
		for(int i=1;i<=n;i++){
			s+="*";
			System.out.println(s);
		}
		int f=n;
		for(int j=1;j<f;j++){
			n-=1;
		for(int i=n;i>0;i--){
			System.out.print("*");
		}
		System.out.println("");
		}
	}
	public static void main(String[] args) {
		print(10);

	}

}

