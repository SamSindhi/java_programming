// public class wasn't dead
// wrong name of the program 
// which doesn't show the purpose of exiting code
// either we change the name or we change the functionality
public class OddOrEven {
	public static void main( String[] args ){
		if( args.length != 1 ){
			System.err.println("Give exactly one integer number as an argument!");
		} else {
			// Integer.parseInt() returns object, while valueOf returns primitive
			int num = Integer.valueOf(args[0]);
			String answer = (num % 2 == 1) ?
			"odd" : "even";
			System.out.println( answer );
		}		
	}	
}
