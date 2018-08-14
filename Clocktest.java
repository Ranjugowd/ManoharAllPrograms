public class Clocktest {

	public static void main(String[] args) {
	 Clock c1=new Clock();
	 Clock c2=new Clock(02,10,20);
	 Clock c3=new Clock(20);
	 System.out.println("values of explicit constructor");
	 c1.ToString(c1.hours,c2.minutes,c3.seconds);
	 System.out.println("------------");
	
	 System.out.println("values of explicit 3 varialble parameterised constructor");
	 c2.ToString(c1.hours,c2.minutes,c3.seconds);
	 System.out.println("------------");
	
	 System.out.println("values of explicit 1 variable parameterised constructor");
	 c3.ToString(c1.hours,c2.minutes,c3.seconds);
	 System.out.println("------------");
	 
	 System.out.println("to set clock");
	 c1.setClock(00);
	 System.out.println("------------");
	
	 System.out.println("to get methods");
	 System.out.println("hours: " +c2.gethour());
	 System.out.println("minutes: " +c2.getminutes());
	 System.out.println("seconds: " +c2.getseconds());
	 System.out.println("------------");
	 
	 System.out.println("to set hours");
	 c2.sethour();
	 System.out.println("to set minutes");
	 c2.setminutes();
	 System.out.println("to set seconds");
	 c2.setseconds();
	 System.out.println("------------");
	 
	 System.out.println("to tik one second");
	 c1.tick();
	 System.out.println("------------");
	 
	 System.out.println("to add two clocks");
	 Clock.addclock( c3,c1);
	 System.out.println("-------------");
	 
	 System.out.println("to tikdown one second");
	 c1.tickDown();
	 System.out.println("-------------");
	
	 System.out.println("to sub two clocks");
	 Clock.subclock( c3,c1);
	 System.out.println("-------------");
	}

}
