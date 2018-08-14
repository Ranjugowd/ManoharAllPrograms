public class Clock {
	int hours;
	int minutes;
	int seconds;

	public Clock() {
		hours=12;
		minutes=10;
		seconds=25;		
	}	
	public Clock(int hour,int minute,int second) {
		this.hours=hour;
		this.minutes=minute;
		this.seconds=second;		
	}	
	public Clock(int second) {
		if(second>=60) {
			hours=second/3600;
			minutes=second%3600/60;
			seconds=second%3600%60;
		}else {
			this.seconds=second;	
		}		
	}	
	void setClock(int second) {           //.1
		if(second>=60) {
			hours=second/3600;
			minutes=second%3600/60;
			seconds=second%3600%60;
		}else {
			this.seconds=second;	
		}	
	}
	int gethour() {                       
		return hours;
		
	}	
	int getminutes() {						
		return minutes;
		
	}	
	int getseconds() {						
		return seconds;
		
	}
	int sethours(int hour) {                      
		if(hour>=24) {
			hours=hour-24;
		}
		return hours;		
	}	
	void setminutes(int minute) {                     
		if(minute>=60) {
			this.minutes=minute/60;
		}	
	}	
	void setseconds(int second) {
		if(second>=60) {
			this.seconds=second%60;
		}	
	}	
	String tick() {                           
		seconds=hours*3600+minutes*60+seconds;	
		return ToString(seconds++);
	}	
	String tickDown() {                          
		seconds=hours*3600+minutes*60+seconds;
		return ToString(seconds--);		 
	}	
	String addclock(Clock clock) {	
		int second1=(clock.hours*3600)+(clock.minutes*60)+(clock.seconds);
		int second2=(this.hours*3600)+(this.minutes*60)+(this.seconds);
		return ToString(second1+second2);		
	}	
	String subclock(Clock clock) {		
		int second1=clock.hours*3600+clock.minutes*60+clock.seconds;
		int second2=this.hours*3600+this.minutes*60+this.seconds;
		return ToString(second2-second1);
	}
	 String ToString(int sec) {						
		hours=sec/3600;
		minutes=sec%3600/60;
		seconds=sec%3600%60;
		return hours+" : "+minutes+" : "+seconds;
	 }	
}
