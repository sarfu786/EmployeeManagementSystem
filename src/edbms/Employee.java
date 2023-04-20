package edbms;

public class Employee {
	private String id;
	private  String name;
	private int age;
	private Double Sal;
	
	static int count = 101;
	
	public Employee(String name,int age,Double Sal) {
		this.id="Jsp"+count;
		this.name=name;
		this.age=age;
		this.Sal=Sal;
		count++;
	}
	public String getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		
		this.name=name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		
		this.age=age;
	}
	public double getSal() {
		return Sal;
	}
	public void setSal(double Sal) {
		this.Sal=Sal;
	}
	
	public String toString() {
		return"Id "+id+" name "+name+" age "+age+" sal "+Sal;
	}

}
