package correcter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ErrorEmulator errorEmulator = new ErrorEmulator();
        StringManipulations stringManipulations = new StringManipulations();

        String example = scanner.nextLine();
        String encoded = stringManipulations.encode(example);
        String error = errorEmulator.errorEmulate(encoded);
        String decoded = stringManipulations.decode(error);

        System.out.println(example);
        System.out.println(encoded);
        System.out.println(error);
        System.out.println(decoded);
    }
}
