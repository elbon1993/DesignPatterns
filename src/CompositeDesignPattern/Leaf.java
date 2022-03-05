package CompositeDesignPattern;

public class Leaf implements Employee {

	String name;
	Long salary;
	
	public Leaf(String name, Long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void showSalary() {
		System.out.println("name:"+this.name+"\t salary:"+this.salary);
	}

}
