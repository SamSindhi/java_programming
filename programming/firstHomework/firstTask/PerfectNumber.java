
class PerfectNumber {
	public static void main(String[] args) {
		if(args.length == 1){
			int number = Integer.parseInt(args[0]);
			int divisorNumber = 0;
			for(int i = 1; i < number; i++){
				if (number % i == 0) {
					divisorNumber += i;
				}
			}
			String perfect = divisorNumber == number 
			? new String("Perfect")		
			: new String("Not Perfect");
			System.out.println(perfect); 
		} else {
			System.err.println("An invalid number of arguments");
			System.exit(1);
		}
	}
}
