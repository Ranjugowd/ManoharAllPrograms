class Employeetest{

	public static void main(String[] args) {
		Employee employee1=new Employee(1001,"chathrapathi",1000,'m');
		Employee employee2=new Employee(1002,"Shivaji",2000,'m');
		Employee employee3=new Employee(1003,"Vinay Noah",3000,'m');
		Car car=new Car();
		employee1.car=car;
		employee2.car=car;
		employee3.car=car;

		employee1.car.color="red car";
		employee2.car.color="blue car";
		employee3.car.color="white car";

		String[] tasklist={"work","eat","sleep"};
		employee1.tasklist=tasklist;
		employee2.tasklist=tasklist;
		employee3.tasklist=tasklist;

		System.out.println("==>tasklist of employeee 1");
		employee1.Displaytask();
		System.out.println("==>Details of Employee 1");
		employee1.PrintEmployeeDetails();
		employee1.DoSomething();
		employee1.car.color="red car";
		System.out.println(employee1.DoSomething()+employee1.car.color);
		System.out.println("----------------------");

		System.out.println("==>tasklist of employeee 2");
		employee2.Displaytask();
		System.out.println("==>Details of Employee 2");
		employee2.PrintEmployeeDetails();	
		employee2.DoSomething();
		employee2.car.color="blue car";
		System.out.println(employee2.DoSomething()+employee2.car.color);	
		System.out.println("----------------------");

		System.out.println("==>tasklist of employeee 3");
		employee3.Displaytask();
		System.out.println("==>Details of Employee 3");
		employee3.PrintEmployeeDetails();
		employee3.car.color="white car";
		System.out.println(employee3.DoSomething()+employee3.car.color);
		System.out.println("----------------------");

		System.out.println("==>Details of employee 1 with increased salary of 10%");
		Employee.raisesalary(employee1,10);
		employee1.PrintEmployeeDetails();
		System.out.println("----------------------");

		System.out.println("==>Details of employee 2 with increased salary of 10%");
		Employee.raisesalary(employee2,10);
		employee2.PrintEmployeeDetails();
		System.out.println("----------------------");

		System.out.println("==>Details of employee 3 with increased salary of 20%");
		Employee.raisesalary(employee3,20);
		employee3.PrintEmployeeDetails();

		
	}
}