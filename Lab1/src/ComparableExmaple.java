import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

public class ComparableExmaple{
public static void main(String args[]) {
	
	Employee e1=new Employee(105, "Sri");
	Employee e2=new Employee(102, "uma");
	Employee e3=new Employee(104, "mahesh");
	Employee e4=new Employee(103, "rao");
	
	List list=new ArrayList<>();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);

	Iterator it=list.iterator();
//	while(it.hasNext()) {
//	System.out.println(it.next());
//	}
	Collections.sort(list); //comparable
	for(Object obj : list) {
		System.out.println(obj);
	}
}}
class Employee implements Comparable{

	private int eid;
	private String ename;
	Employee(int eid, String ename){
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public int compareTo(Object obj) {
		Employee emp = (Employee) obj;
		System.out.println("this"+this.eid);
		System.out.println("emp"+emp.getEid());
		return emp.getEname().length() - this.getEname().length();
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid() {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname() {
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		String str="["+eid+","+ename+"]";
		return str;
	}
	
	
}
