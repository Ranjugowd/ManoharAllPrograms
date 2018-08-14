class Triangle{
	public static void main(String[] args) {
		for(int i=0;i<6;i++){
			for(int k=5;k>i;k--){
				System.out.print(" ");
			}
			for(int j=0;j<11;j++){
				if(j==0||j==i*2||i==5){
					System.out.print("*");
				}else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}