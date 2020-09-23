
class PerfectNumberSequence {
	public static void main(String[] args) {
		if(args.length == 1){
			int number = Integer.parseInt(args[0]);
			int counter = 0;
			for (int i = 2; i <= number; i++) {
				int numberDiv = 0;
				for (int j = 1; j < i; j++) {
					if (i % j == 0) {
						numberDiv += j;
					}
					if (numberDiv == number) {
						break;
					}
				}
				if (numberDiv == i) {
					counter++;
				}
			}
			System.out.println(counter); 
		} else {
			System.err.println("An invalid number of arguments");
			System.exit(1);
		}
	}
}
