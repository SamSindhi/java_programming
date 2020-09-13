
public class Gcd {
	public static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static long abs(long a) {
		if (a < 0) {
			return -a;
		} 
		return a;
	}

	public static void main(String[] args) {
		if(args.length < 2) {
			System.err.println("Gcd needs at least two numbers!");
			System.exit(1);
		}
		long[] numbers = new long[args.length];
		for(int i = 0; i < args.length; i++){
			numbers[i] = Long.parseLong(args[i]);
		} 
		long greatest = numbers[0];
		for(int i = 1; i < numbers.length; i++){
			if(greatest == 1){
				break;
			}
			greatest = gcd(abs(numbers[i]), abs(greatest));
		}
		System.out.println(greatest);
	}	
}
