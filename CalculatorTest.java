
class CalculatorTest{
	public static void main(String[] args) {
		System.out.println(Calculator.add(12,2));
		System.out.println(Calculator.add(12,2,7));
		System.out.println(Calculator.add(12.4,26.51));
		System.out.println(Calculator.speed(12.4,26.51)+" kmps");
		System.out.println(Calculator.area(12.4));
		System.out.println(Calculator.factorial(5));
		System.out.println(Calculator.isEven(5));
		System.out.println(Calculator.isOdd(5));
		System.out.println(Calculator.isPrime(5));
		System.out.println(Calculator.isPalidram(61316));
		Calculator.fibonacci(10);
		System.out.println(Calculator.isDivBySix(36));
		System.out.println(Calculator.secondsToHours(60000));
		System.out.println(Calculator.toRepeate(36));
		System.out.println(Calculator.numOfDigits(36));
		System.out.println(Calculator.hundredsDigit(3655));
		System.out.println(Calculator.requiredRunRate(200,20,180,18));
		System.out.println(Calculator.makeDecimal(3,4,5));
		System.out.println(Calculator.sumToDigit(36));
		System.out.println(Calculator.andBoolean(true,true,false));
		System.out.println(Calculator.largerThanOne(13,10,80));
		System.out.println(Calculator.numberInAscending(13,50,80));
		System.out.println(Calculator.sumOf4Digits(35656464));

	}
}