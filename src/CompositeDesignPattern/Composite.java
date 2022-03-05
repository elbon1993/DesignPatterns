package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Employee{

	String name;
	List<Employee> employees = new ArrayList<>();
	
	public Composite(String name) {
		super();
		this.name = name;
	}

	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}
	
	@Override
	public void showSalary() {
		System.out.println(name);
		for(Employee employee: employees) {
			employee.showSalary();
		}
	}

}
