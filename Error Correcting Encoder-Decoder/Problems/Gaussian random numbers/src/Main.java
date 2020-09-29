import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long K = scanner.nextLong();
        double N = scanner.nextDouble();
        double M = scanner.nextDouble();

        int count = 0;
        double gaussian;

        while (count != N) {
            count = 0;
            Random generator = new Random(K);
            for (int i = 0; i < N; i++) {
                gaussian = generator.nextGaussian();
                if (gaussian <= M) {
                    count++;
                }
            }
            if (count != N) {
                K++;
            }
        }


        int seedInt = (int)K;
        System.out.println(seedInt);
    }
}