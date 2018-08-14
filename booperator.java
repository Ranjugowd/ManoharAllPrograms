class booperator{
	public static void main(String[] args) {
		int age=25;
		System.out.println(age>18&&age<120);
		//checking if eligible to vote or not
		int year=2020;
		System.out.println(year%4==0&&year%100!=0||(year%400==0));
		//checking if leap year or not
	}
}