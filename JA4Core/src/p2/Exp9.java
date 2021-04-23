package p2;

class Employee
{
	private String name;
	private String cmp;
	private String city;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCmp() {
		return cmp;
	}
	public void setCmp(String cmp) {
		this.cmp = cmp;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}

public class Exp9 
{
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.setName("Alekya");
		emp.setCmp("v^2S^2");
		emp.setCity("Hyd");
		
		System.out.println(emp.getName()+" "+emp.getCmp()+" "+emp.getCity());
		
	}

}
