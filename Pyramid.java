class Pyramid{
	public static void main(String[] args) {
		for(int i=0;i<6;i++){
			for(int k=5;k>i;k--){
				System.out.print(" ");
			}
			for(int j=0;j<i*2;j++){
				if(j%2==0){
					System.out.print("*");
				}else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}