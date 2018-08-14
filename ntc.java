class typecasting{
	public static void main(String[] args) {
		byte b=100;
		int i=b;
		System.out.println(i);

		float f=i;
		System.out.println(f);

		double d=10.1;
		f=(float)d;
		System.out.println(f);

		Float var = (float) 128.128;
		System.out.println(var);

		int num=(int) var;
		System.out.println(num);

		b=(byte)num;
		System.out.println(b);



	}

}