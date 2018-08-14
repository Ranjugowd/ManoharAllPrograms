public class Complex {
	 double realpart;
	 double imgpart;
	  
	 public Complex() {
		realpart=0.0;
		imgpart=0.0;
	}	 
	public Complex(double realpart,double imgpart) {
		this.realpart=realpart;
		this.imgpart=imgpart;
	}	
	String Add(Complex com) {
		Complex temp=new Complex();
		temp.realpart=this.realpart+com.realpart;
		temp.imgpart=this.imgpart+com.imgpart;
		return ToString(temp.realpart,temp.imgpart);		
	}	 
	String subtract(Complex com) {
		Complex temp=new Complex();
		temp.realpart=this.realpart-com.realpart;
		temp.imgpart=this.imgpart-com.imgpart;
		return ToString(temp.realpart,temp.imgpart);		 
	}	
	String multiply(Complex com) {
		Complex temp=new Complex();
		temp.realpart=this.realpart*com.realpart;
		temp.imgpart=this.imgpart*com.imgpart;
		return ToString(temp.realpart,temp.imgpart);
	}	 
	String division(Complex com) {
		Complex temp=new Complex();
		temp.realpart=this.realpart/com.realpart;
		temp.imgpart=this.imgpart/com.imgpart;
	    return ToString(temp.realpart,temp.imgpart);
	}	 
	public String Setrealpart(double Realpart) {
		return ToString(Realpart,0.0);
	}	
	public String Setimgpart(double imgpart) {  
		return ToString(realpart,imgpart);
	}	
	public double getrealpart() {
		return realpart;
 	}	
	public double  getimgpart() {
		return imgpart;
	}
	String ToString(double realpart,double imgpart) {
		return (realpart+" + "+ imgpart+"i");
	}	
}
