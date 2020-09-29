package correcter;

import java.util.Random;


class ErrorEmulator {
    public String errorEmulate (String initial) {
        String original = initial;
        final int originalLength = original.length();
        Random random = new Random();
        Random charRandom = new Random();
        final int intervalChar = 35;
        int intervalLength = 3;
        for (int i = 0; i < originalLength; i+=3) {
            int nextRandom = random.nextInt(intervalLength) + i;

            char nextRandomChar = (char)(charRandom.nextInt(intervalChar) + 65);
            if (originalLength % 3 != 0 && nextRandom > originalLength - 2) {
                break;
            }
            original = original.substring(0, nextRandom) + nextRandomChar + original.substring(nextRandom + 1);
        }
        return original;
    }
}
