 class PrimeRange {

	public static void main(String[] args) {
		int i=20,j,k;
		for(j=2;j<=i;j++) {
			for(k=2;k<j;k++) {
				if(j%k==0){
					break;
				}
			}
			if(j==k) {
				System.out.print(j+" ");
			}
		
		}

	}

}
