public class Clockdemo {

	public static void main(String[] args) {
		Clock firstclock=new Clock(1000);			
		System.out.println("to tick the firstclock 10 times");
		for(int i=0;i<=10;i++) {
			System.out.println(firstclock.tick());
		}
		System.out.println("-------------");
		
		Clock secondclock=new Clock(20,40,18);	 
		System.out.println("to tick the secondclock 10 times");
		for(int i=0;i<=10;i++) {
			System.out.println(secondclock.tick());
		}
		System.out.println("-------------");
		
		System.out.println("to add two clocks");
		System.out.println(firstclock.addclock(secondclock));		
		System.out.println("-------------");
		
		System.out.println("to subtract two clocks");
		System.out.println(firstclock.subclock(secondclock));		
		System.out.println("-------------");
		
		System.out.println("TO PRINT BOTH THE CLOCK OBJECT");
		
		System.out.println("to print firstclock object");
		System.out.println(firstclock.ToString(5000));
		System.out.println("-------------");
		
		System.out.println("to print secondclock object");	
		System.err.println(secondclock.ToString(6000));	
	}
}

