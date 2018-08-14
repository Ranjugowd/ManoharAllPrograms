class whileexample2{
	public static void main(String[] args) {
		int from=10;
		int to=20;
		int loopcontrol=from;

		while(loopcontrol<=to){
			if(loopcontrol%2==0)
				System.out.println(loopcontrol);
			loopcontrol++;
		}
	}
}