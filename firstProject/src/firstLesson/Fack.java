import java.util.Scanner;

class Fack {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int fack = scanner.nextInt();
		int res = 1;
		while(fack > 1){
		//	System.out.println(fack+ " " +res);
			res = res * fack;
			fack--;
		} 
		System.out.println(res);
	}
}
