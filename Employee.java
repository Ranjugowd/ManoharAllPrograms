public class Employee{
		int Id;	
		String name;	
		double salary;
		char gender;
		String[] tasklist;
		Car car;

    public Employee(int Id,String name,double salary,char gender){
      	this.Id=Id;
      	this.name=name;
      	this.salary=salary;
      	this.gender=gender;
        }	    
    public Employee(){
	    Id=-1;
		name="not spesified";
		salary=-1;
		gender='x';
	    }	
	String DoSomething(){
		return(name+" is doing something in his ");
		}	
	void PrintEmployeeDetails(){
		System.out.println(Id);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(salary);
		}	 
	void Displaytask(){
		for( String task:tasklist){
			System.out.println(task);
			}
		}
	public static double raisesalary( Employee emp,double percentage){
		emp.salary=emp.salary+((emp.salary*percentage)/100);
		return emp.salary;
	}
}