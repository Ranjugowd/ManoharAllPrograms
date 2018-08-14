class Familyfactory{
	public static void main(String[] args) {
		Husband husband=new Husband();

		Wife wife=new Wife();
		wife.name="Sonia Gandhi";

		Kid[] kids=new Kid[2];
		kids[0] =new Kid();
		kids[1] =new Kid();		

		Bicycle bicycle=new Bicycle();
		bicycle.model="Atlas";

		Barbie barbie=new Barbie();
		barbie.color="black";

		kids[0].name="Rahul Gandhi";
		kids[0].bicycle=bicycle;

		kids[1].name="Priyanka Gandhi";
		kids[1].barbie=barbie;

		husband.name="rajeev Gandhi";
		husband.wife=wife;
		husband.kids=kids;
		
		System.out.println(husband.name+" is the husband of "+husband.wife.name);
		System.out.println("they have "+husband.kids.length+" kids");
		System.out.println(husband.kids[0].name);
		System.out.println(husband.kids[1].name);
		System.out.print("the kid "+husband.kids[0].name+" has got :");
		System.out.println("Bicycle "+husband.kids[0].bicycle.model);
		System.out.print("the kid "+husband.kids[1].name+" has got :");
		System.out.println("Barbie "+husband.kids[1].barbie.color+" color toy");
	}
}