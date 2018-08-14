public class Car{
	
		double height;
		double weight;
		String color;
		double speed;

		public void Start(){
			System.out.println(color+" car started");
		}
		
		public void Move(){
			speed++;
			System.out.println("Car is moving");		
		}
		public void Stop(){
			speed=0;
	    System.out.println("Car stopped");
		}	
}
