
class Sqrt2 {
	public static double approximation(int number) {
		if (number == 0) {
			return 0;
		}
		number--;
		return 1/(2 + approximation(number));
	
	}
	public static void main(String [] args) {
		double sqrt2 = approximation(5) + 1;
		System.out.println(sqrt2);
	}
}
