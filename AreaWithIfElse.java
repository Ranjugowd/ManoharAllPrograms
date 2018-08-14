class AreaWithIfElse{
	public static void main(String[] args) {
		final double PI = 3.412;
		double radius= -123.123;
		if(radius>0){
			double area=radius*radius*PI;
			System.out.println(area);
		}else
		System.out.println("Radius should be greater than zero");
	}
}