class Grade{
	public static void main(String[] args) {
		int score=60;
		char grade='x';

		if(score>=75){
			grade='A';
		}else if(score>=60){
			grade='B';			
		}else if(score>=50){
			grade='C';
		}else if(score>=35){
				grade='D';
		}else{
				grade='F';
			}
			System.out.println("your grade is "+ grade);
		
	}
}