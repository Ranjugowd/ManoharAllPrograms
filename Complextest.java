public class Complextest {

	public static void main(String[] args) {
		 Complex comp1=new Complex(16.5,15.6);
		 Complex comp2=new Complex(5.5,11.5);
				 				 
		System.out.println("To add two complex number");
		System.out.println(comp1.Add(comp2));
		System.out.println("--------------");
				 
		System.out.println("To sub two complex number");
		System.out.println(comp1.subtract(comp2));
		System.out.println("--------------");
				
		System.out.println("To mul two complex number");
		System.out.println(comp1.multiply( comp2));
		System.out.println("--------------");
				 
		System.out.println("To div two complex number");
		System.out.println(comp1.division( comp2));
		System.out.println("--------------");
		 
		System.out.println("To get real part of complex number");
		System.out.println(comp1.getrealpart());
		System.out.println("--------------");
				 
		System.out.println("To get imaginary part of complex number");
		System.out.println(comp1.getimgpart());
		System.out.println("--------------");
		 
		System.out.println("To set real part of complex number");
		System.out.println(comp1.Setrealpart(13.5));
		System.out.println("--------------");
		 		 
		System.out.println("To set imaginary part of complex number");
		System.out.println(comp1.Setimgpart(17.3));
		System.out.println("--------------");
		 		 
		 		
	}

}
