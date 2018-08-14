class MultipleOfThree {
	public static void main(String[] args) {
		for(int i=300;i>1;i--)
			if(i%3==0)
				System.out.print(i+" ");
			else if(i==100&&i==200){
				System.out.println();
			}
	}
}