
class ForLoop {
	public static void main(String[] args){
		float number = 0.5f;
		int count = 0;
		for(int i = 1; i <= 4; i++){
			System.out.println(number);
			number += 0.5f;
		}
		System.out.println("Altogether" + count + "numbers");
	}
}
