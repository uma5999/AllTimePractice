
public class passByValueExample {

	public static void main(String[] args) {

		Address a = new Address();
		a.setCity("blore");
		Employee1 e1 = new Employee1("mahesh",a);
		System.out.println(e1);
		a.setCity("pune");
		System.out.println(e1);
		
	}

}

final class Employee1{
	
	private final String ename;
	private final Address adress;
	public Employee1(String ename,Address adress) {
		this.ename = ename;
		this.adress = adress;
	}
	@Override
	public String toString() {
		return ""+this.ename+""+this.adress;
	}
	
}

class Address{
	String city;
	public Address(String city) {
		this.city = city;
	}
	Address(){}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return " "+this.city+" ";
	}
}