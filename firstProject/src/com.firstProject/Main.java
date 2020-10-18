import java.util.*;

public class Main {
	static int countBits(int number)
	{

		// log function in base 2
		// take only integer part
		return (int)(Math.log(number) /
				Math.log(2) + 1);
	}


	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
		Sort sort = new Sort();
		int[] fiveItemArray = {2,3,1,4,6};
		Sort.sortFiveElements(fiveItemArray);
		System.out.println(Arrays.toString(fiveItemArray));
//		Convert convert = new Convert();
////		IntegerBinary integerBinary = new IntegerBinary(11111);
//		Clock clock = new Clock();
//		for (int i = 0; i < 1000; i++) {
//			clock.next();
//		}
////		System.out.println(clock.minutes);
////		System.out.println(clock.hours);
//		User user = new User();
//		user.setFirstName("lava");
////		System.out.println(user.getFullName());
//
////		System.out.println(convert.fromDecToBinary());
////		int n = scanner.nextInt();
//		int[] arr = {1,23, 34, 23, 2};
//		int[] newArr = Sort.sortByMerge(arr);
//		System.out.println(Arrays.toString(newArr));
////		System.out.println(Arrays.toString(sort.mergeSort(arr)));
////		int[] arr1 = sort.merge(arr, 0, arr.length /2, arr.length );
////		System.out.println(Arrays.toString(arr1));
////		for (int i = 0; i < arr.length; i++) {
////			arr[i] = scanner.nextInt();
////		}
////		String[] numberArray = { "hello", "pidar"};
////		String[] stringArr = {"jimbo"};
////		System.out.println(Arrays.toString(arr));
////		System.out.println(Arrays.toString(sort.concatecate(numberArray, stringArr)));
////		System.out.println(Arrays.toString(sort.mergeSort(arr)));
////		System.out.println(integerBinary.getBinary());
////
////		System.out.println(convert.numberLength(0, NumberLengthVariants.ARITHMETIC));
////		System.out.println(convert.numberLength(100101, NumberLengthVariants.TRICKY));
////		System.out.println(convert.fromBinaryToDec(1011101));
////		System.out.println(countBits(146));
////		String target = "https://target.com/index.html?/havenousername/java_programming/tree/master/programming/thirdHomework/book";
////		WebpageParser webpageParser = new WebpageParser(target);
////		webpageParser.printParsedItems();
////		webpageParser.printParsedItems();
////		String example = "send message to user with id #42354";
////		ErrorEmulator errorEmulator = new ErrorEmulator();
////		String error = errorEmulator.errorEmulate(example);
//
////		ErrorEmulator errorEmulator = new ErrorEmulator();
////		String error = errorEmulator.errorEmulate(example);
////		System.out.println(example);
////		System.out.println(error);
////		System.out.println(example.length());
////		System.out.println(error.length());
//
//
////		String date = scanner.next();
////		String[] newDate = date.split("-");
////		System.out.println(newDate[1] + "/" + newDate[2] + "/" + newDate[0]);
//
////		int[] numberArray = { 10, 14, 28, 11, 7, 16, 30, 50, 25, 18};
////		int[] sortedArray = sort.selectionSort(numberArray);
////		System.out.println(Arrays.toString(sortedArray));
//
////		int [] sortedArray = sort.mergeSort(numberArray);
////		System.out.println(Arrays.toString(sortedArray));
//
////		int[] arr = {1, 5 ,8, 4, 9, 10};
////		int[] sorted = sort.mergeSort(numberArray);
////		int[] sortedArray = sort.insertionSort(numberArray);
////		System.out.println(Arrays.toString(sort.merge(arr, 0, arr.length / 2, arr.length )));
////		System.out.println(Arrays.toString(sort.quickSort(arr)));
//
//
////		int arrayLength = scanner.nextInt()
////		int[] numbers = new int[arrayLength];
////		for (int i = 0; i < arrayLength; i++) {
////			numbers[i] = scanner.nextInt();
////		}
////
////
////		for (int i = numbers.length - 1; i > 0; i--) {
////			for (int j = i - 1; j >= 0; j--) {
////				if(numbers[j] > numbers[i]) {
////					int aux = numbers[i];
////					numbers[i] = numbers[j];
////					numbers[j] = aux;
////				}
////			}
////		}
////
////		System.out.println(Arrays.toString(numbers));
//
////		Scanner scanner = new Scanner(System.in);
////
//////        System.out.println("Please provide Lower Gaussian bound");
////		long K = scanner.nextLong();
//////        System.out.println("Please provide number of gaussian numbers");
////		double N = scanner.nextDouble();
//////        System.out.println("Please provide Upper Gaussian bound");
////		double M = scanner.nextDouble();
////
////		double gaussian = 100;
////
//////		for (int i = 0; i <= N; i++) {
//////			System.out.println(gaussian + " " + M + " " +  i);
//////			while(gaussian > M) {
//////				Random generator = new Random(K++);
//////				gaussian = generator.nextGaussian();
////////				System.out.println(gaussian + " " + K + " " +  i);
//////				if (gaussian <= M) {
//////					seed = K;
//////					break;
//////				}
//////			}
//////		}
////
////		int count = 0;
////
////		while (count != N) {
////			count = 0;
////			Random generator = new Random(K);
////			for (int i = 0; i < N; i++) {
////				gaussian = generator.nextGaussian();
////				if (gaussian <= M) {
////					count++;
////				}
////			}
////			if (count != N) {
////				K++;
////			}
////		}
////
////
////		int seedInt = (int)K;
////		System.out.println(seedInt);
	}
}