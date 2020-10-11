import java.util.Random;

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