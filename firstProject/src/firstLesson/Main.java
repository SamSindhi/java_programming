

class Main {
	public static void main(String[] args) {
		String name = System.console().readLine();
		System.console().printf(name);
		String newCase = switch(number) {
			case 3, 4, 5 -> "nice choice";
			default -> "meh";
		}
	}	
}
