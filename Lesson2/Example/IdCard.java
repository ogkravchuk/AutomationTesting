package Example;

import java.text.SimpleDateFormat;
import java.util.Date;
public  class IdCard{
	private Date dateExpire;
	private int number;
	public IdCard(int n){
		number = n;
	}
	public void setNumber(int newNumber){
		number = newNumber;
	}
	public int getNumber(){
		return number;
	}
	public void setDateExpire(Date newDateExpire){
		dateExpire = newDateExpire;
	}
	public Date getDateExpire(){
		return dateExpire;
	}

	/*public static void main(String[] args) {
		IdCard card=new IdCard(123);
		card.setDateExpire(new SimpleDateFormat("yyyy-MM-dd").parse("2015-12-31"));
		sysEngineer.setIdCard(card);
		System.out.println(sysEngineer.getName()+"работает в должности "+sysEngineer.getPositiion(());
		
		System.out.println("Удостовирение действет до "+new SimpleDateFormat("yyyy-MM-dd").format(sysEngineer.getIdCard().getDateExpire());
		
	
}
*/
}