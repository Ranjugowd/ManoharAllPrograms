class CarFactory{

	public static void main(String[] args) {
		Car ford=new Car();
		ford.height=150;
		ford.weight=200;
		ford.speed=250;
		ford.color="red";
		System.out.println("Details of Car Ford");
		System.out.println("Weight : "+ford.weight+" Kg");
		System.out.println("Height : "+ford.height+" Cm");
		System.out.println("Speed : "+ford.speed+" Kmph");
		System.out.println("Color : "+ford.color);
		System.out.println("----------");

		Car audi=new Car();
		audi.height=150;
		audi.weight=200;
		audi.color="blue";
		audi.speed=310;
		System.out.println("Details of Car audi");
		System.out.println("Weight : "+audi.weight+" Kg");
		System.out.println("Height : "+audi.height+" Cm");
		System.out.println("Speed : "+audi.speed+" Kmph");
		System.out.println("Color : "+audi.color);
		System.out.println("----------");

		Car bmw=new Car();
		bmw.height=130;
		bmw.weight=500;
		bmw.color="white";
		bmw.speed=400;
		System.out.println("Details of Car bmw");
		System.out.println("Weight : "+bmw.weight+" Kg");
		System.out.println("Height : "+bmw.height+" Cm");
		System.out.println("Speed : "+bmw.speed+" Kmph");
		System.out.println("Color : "+bmw.color);
	}
}