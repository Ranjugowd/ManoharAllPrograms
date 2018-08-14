class uddtest{
	public static void main(String[] args) {
		employee emp3=new employee();
		emp3.Id=12345;
		emp3.name="vinay noah";
		emp3.salary=404040;
		emp3.gender='m';
		System.out.println(emp3.car);
		emp3.car=new car();
		emp3.car.height=100;
		emp3.car.weight=500;
		emp3.car.color="red";

		System.out.println(emp3.Id);
		System.out.println(emp3.name);
		System.out.println(emp3.salary);
		System.out.println(emp3.gender);
		System.out.println("vinay noah his car details");
		System.out.println(emp3.car.height);
		System.out.println(emp3.car.weight);
		System.out.println(emp3.car.color);

		emp3.car.start();
	}
}