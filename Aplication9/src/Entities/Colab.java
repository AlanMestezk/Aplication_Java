package Entities;

public class Colab {
	
	
	private String name;
	private int userId;
	private String role;
	public double salary;
	
	public Colab(String name, int userId, String role, double salary) {
		super();
		this.name = name;
		this.userId = userId;
		this.role = role;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public String toString() {
		return "User: Id"+ userId + " || Nome: "+ name + " || Cargo: "+ role + " || Salário: "+ String.format("%.3f", salary)+"R$";
	}

	public Colab() {
		super();
	}
	
	
}
