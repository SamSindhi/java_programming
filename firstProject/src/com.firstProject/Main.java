import java.lang.reflect.Array;
import java.util.*;

class ErrorEmulator {
	public String errorEmulate (String initial) {
		String original = initial;
		final int originalLength = original.length();
		Random random = new Random();
		final int intervalChar = 35;
		for (int i = 0; i < originalLength; i+=3) {
			int intervalLength = 3;
			int nextRandom = random.nextInt(intervalLength) + i;

			char nextRandomChar = (char)(random.nextInt(intervalChar) + 65);
			System.out.println(nextRandom + "char:" + nextRandomChar);
			if (originalLength % 3 != 0 && nextRandom > originalLength - 2) {
				break;
			}
			if (nextRandom == originalLength) {
				original = original.substring(0, nextRandom - 2) + nextRandomChar;
			}
			original = original.substring(0, nextRandom) + nextRandomChar + original.substring(nextRandom + 1);
		}
		return original;
	}
}

//class JSObjectStringPrev {
//	private final String key;
//	private String value = "not found";
//
//	JSObjectStringPrev(String key) {
//		this.key = key;
//	}
//
//	public void setValue(String value) {
//		this.value = value;
//	}
//
//	public String getKey() {
//		return this.key;
//	}
//
//	public String getValue() {
//		return this.value;
//	}
//}

//class WebpageParserPrev {
//	private static final String notFound = "not found";
//
//	private final JSObjectString pass = new JSObjectString("pass");
//	private final JSObjectString port =  new JSObjectString("port");
//	private final JSObjectString cookie = new JSObjectString("cookie");
//	private final JSObjectString host = new JSObjectString("host");
//	private final String initial;
//
//	WebpageParser(String init) {
//		final int CROP_POINT = init.indexOf("?");
//		this.initial = init.substring(CROP_POINT + 1);
//		parseWebName();
//	}
//
//	private void parseEnter(String aux, JSObjectString objectString) {
//		final int CROP = aux.indexOf("=");
//		objectString.setValue(!aux.substring(CROP + 1).equals("") ? aux.substring(CROP + 1) : notFound);
//	}
//
//	private void parseWebName() {
//		String[] aux = this.initial.split("&");
//		for (String s : aux) {
////			System.out.println(s);
//			if (s.contains(port.getKey())) {
//				parseEnter(s, port);
//			}
//			if (s.contains(pass.getKey())) {
//				parseEnter(s, pass);
//			}
//			if (s.contains(cookie.getKey())) {
//				parseEnter(s, cookie);
//			}
//			if (s.contains(host.getKey()) ) {
//				parseEnter(s, host);
//			}
//		}
//	}
//
//	public void printParsedItems() {
//		System.out.println(port.getKey() + " : " + port.getValue());
//		if (!pass.getValue().equals(notFound)) {
//			System.out.println(pass.getKey() + " : " + pass.getValue());
//		}
//		System.out.println(cookie.getKey() + " : " + cookie.getValue());
//		System.out.println(host.getKey() + " : " + host.getValue());
//		if (!pass.getValue().equals(notFound)) {
//			System.out.println("password" + " : " + pass.getValue());
//		}
//	}
//
//	public String getInitial() {
//		return initial;
//	}
//}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Sort sort = new Sort();

//		String target = "https://target.com/index.html?/havenousername/java_programming/tree/master/programming/thirdHomework/book";
//		WebpageParser webpageParser = new WebpageParser(target);
//		webpageParser.printParsedItems();
//		webpageParser.printParsedItems();
//		String example = "send message to user with id #42354";
//		ErrorEmulator errorEmulator = new ErrorEmulator();
//		String error = errorEmulator.errorEmulate(example);

//		ErrorEmulator errorEmulator = new ErrorEmulator();
//		String error = errorEmulator.errorEmulate(example);
//		System.out.println(example);
//		System.out.println(error);
//		System.out.println(example.length());
//		System.out.println(error.length());


//		String date = scanner.next();
//		String[] newDate = date.split("-");
//		System.out.println(newDate[1] + "/" + newDate[2] + "/" + newDate[0]);

//		int[] numberArray = { 10, 14, 28, 11, 7, 16, 30, 50, 25, 18};
//		int[] sortedArray = sort.selectionSort(numberArray);
//		System.out.println(Arrays.toString(sortedArray));

//		int [] sortedArray = sort.mergeSort(numberArray);
//		System.out.println(Arrays.toString(sortedArray));

		int[] arr = {1, 5 ,8, 4, 9, 10};
//		int[] sorted = sort.mergeSort(numberArray);
//		int[] sortedArray = sort.insertionSort(numberArray);
//		System.out.println(Arrays.toString(sort.merge(arr, 0, arr.length / 2, arr.length )));
		System.out.println(Arrays.toString(sort.mergeSort(arr)));


//		int arrayLength = scanner.nextInt()
//		int[] numbers = new int[arrayLength];
//		for (int i = 0; i < arrayLength; i++) {
//			numbers[i] = scanner.nextInt();
//		}
//
//
//		for (int i = numbers.length - 1; i > 0; i--) {
//			for (int j = i - 1; j >= 0; j--) {
//				if(numbers[j] > numbers[i]) {
//					int aux = numbers[i];
//					numbers[i] = numbers[j];
//					numbers[j] = aux;
//				}
//			}
//		}
//
//		System.out.println(Arrays.toString(numbers));

//		Scanner scanner = new Scanner(System.in);
//
////        System.out.println("Please provide Lower Gaussian bound");
//		long K = scanner.nextLong();
////        System.out.println("Please provide number of gaussian numbers");
//		double N = scanner.nextDouble();
////        System.out.println("Please provide Upper Gaussian bound");
//		double M = scanner.nextDouble();
//
//		double gaussian = 100;
//
////		for (int i = 0; i <= N; i++) {
////			System.out.println(gaussian + " " + M + " " +  i);
////			while(gaussian > M) {
////				Random generator = new Random(K++);
////				gaussian = generator.nextGaussian();
//////				System.out.println(gaussian + " " + K + " " +  i);
////				if (gaussian <= M) {
////					seed = K;
////					break;
////				}
////			}
////		}
//
//		int count = 0;
//
//		while (count != N) {
//			count = 0;
//			Random generator = new Random(K);
//			for (int i = 0; i < N; i++) {
//				gaussian = generator.nextGaussian();
//				if (gaussian <= M) {
//					count++;
//				}
//			}
//			if (count != N) {
//				K++;
//			}
//		}
//
//
//		int seedInt = (int)K;
//		System.out.println(seedInt);
	}
}