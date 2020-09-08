
class IfElse {
	public static void main(String[] args){
		if(args.length != 1){
			System.err.println("Invalid number of command line arguments");
		} else {
			System.out.println("Hello" + args[0] + "!");
		}
	}
}
