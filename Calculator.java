class Calculator{
	public static int add(int num1,int num2){					//1
		return num1+num2;
	}
	public static int add(int num1,int num2,int num3){			//2
		return num1+num2+num3;
	}	
	public static double add(double num1,double num2){			//3
		return num1+num2;
	}
	public static double speed(double time,double distance){	//4
		return distance/time;
	}
	public static double area(double radius){					//5
		final double PI=3.14;
		return PI*radius*radius;
	}
	public static int factorial(int factorial){					//6
		int j=1;
		if(factorial==0){
			return 1;
		} else {
			for(int i=factorial;i>=1;i--){
				j*=i;
			}
		}
		return j;
	}
	public static boolean isEven(int num){						//7
		return num%2==0?true:false;
	}
	public static boolean isOdd(int num){						//8
		return num%2!=0?true:false;
	}
	public static boolean isPrime(int num){						//9
		return num%2!=0||num==2?true:false;
	}
	public static boolean isPalidram(int num){					//10
		int sum=0;
		int j=num;
		while(num>0) {    
			int i=num%10;  
		    sum=(sum*10)+i;    
		    num=num/10; 
		} 
		return sum==j?true:false;
	}
	public static void fibonacci(int num){						//11
		int n1=0,n2=1,i,n3;
		System.out.print(n1+" "+n2);
		for(i=1;i<=num-2;i++){
			n3=n2+n1;		
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
		}
		System.out.println();
	}
	public static boolean isDivBySix(int num){					//12
		return num%6==0?true:false;
	}	
	public static String secondsToHours(int num){				//13
		int minutes=0,seconds=0;
		int hours=num/3600;
		return hours+":"+minutes+":"+seconds;
	}
	public static int numOfDigits(int num){						//14
		int i=0;
		while(num>1){
			num=num/10;
			 i++;
		}
		return i;	
	}
	public static String toRepeate(int num){					//15
		return num+""+num;
	}
	
	public static int hundredsDigit(int num){					//17
		int i=num%100;
		i=i/10;
		return i;
	}
	public static int requiredRunRate(int target,int maxOvers,int currentScore,int oversBowled){					//18
		int runsRequired=target-currentScore;
		int ballsRemaining=maxOvers-oversBowled;
		int requiredRunRate=((runsRequired*6)/(ballsRemaining*6));
		return requiredRunRate;
	}
	public static double makeDecimal(int a,int b,int c){					//19
		double i=(double)b/10;
		System.out.println(i);
		double j=(double)c/100;
		System.out.println(j);
		double k=a+i+j;
		return k;
	}
	public static int sumToDigit(int num){					//20
		int i=num%10;
		int j=num/10;
		i=i+j;
		return i;
	}
	public static boolean andBoolean(boolean num1,boolean num2,boolean num3){					//21
		return num1&num2&num3?true:false;
	}
	public static boolean largerThanOne(int num1,int num2,int num3){							//22
		boolean i= num1>num2?true:false;
		boolean j= num1>num3?true:false;
		return i||j?true:false;
	}
	public static boolean numberInAscending(int num1,int num2,int num3){						//23
		boolean i= num1<num2?true:false;
		boolean j= num2<num3?true:false;
		return i==j?true:false;
	}
	public static int sumOf4Digits(int num){					//24
		int i=0,j=0;
		while( j>4) {
		i+=num%10;
		j++;
	}
		return i;
	}

}