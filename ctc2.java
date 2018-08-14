class ctc2{
	public static void main(String[] args) {
		int unicodeofA='A';
		int unicodeof1='1';
		char ch='*';
		int unicodeofstar=ch;

		System.out.println("unicode of A is " +unicodeofA);
		System.out.println("unicode of 1 is " +unicodeof1);
		System.out.println("unicode of * is " +unicodeofstar);
		System.out.println("unicode of x is " +(int)'x');
		System.out.println("unicode of # is " +(int)'#');
		System.out.println("unicode of 6 is " +(int)'6');

		 int num=111;
		 char var=(char)num;
		 System.out.println("Character for unicode 111 is "+var);
		 System.out.println("Character for unicode 60 is "+(char)60);
		 System.out.println("Character for unicode 61 is "+(char)61);
		 System.out.println("Character for unicode 121 is "+(char)(120+1));


	}
}