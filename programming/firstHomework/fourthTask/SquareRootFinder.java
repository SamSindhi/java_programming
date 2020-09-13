
public class SquareRootFinder {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("Please provide square root and prefered precition value");
			System.exit(1);
		}
		double number = Double.parseDouble(args[0]);
		final double precition = Double.parseDouble(args[1]);
		double estimation = 1;
		double original = number;
		while(number - estimation > precition) {
			number = (number + estimation) / 2;
			estimation = original / number;	
		}	
		System.out.println(number);
		
	}
}
