package CompositeDesignPattern;

public class Client {
	public static void main(String[] args) {
		Employee developer = new Leaf("chandu", 1500000L);
		Employee qa = new Leaf("karthik", 1000000L);
		
		Composite lead = new Composite("Narender"); 
		Composite manager = new Composite("Venkat");
		Composite director = new Composite("Ram");
		Composite srDirector = new Composite("Prabhakar");
		
		srDirector.addEmployee(director);
		director.addEmployee(manager);
		manager.addEmployee(lead);
		lead.addEmployee(developer);
		lead.addEmployee(qa);
		
		manager.showSalary();
		
	}
}
