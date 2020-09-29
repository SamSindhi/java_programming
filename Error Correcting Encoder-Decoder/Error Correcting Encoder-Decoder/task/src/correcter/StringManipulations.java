package correcter;

public class StringManipulations {
    private String repeatString(String msg, int times) {
        if (times == 0) {
            return msg;
        }
        return msg + repeatString(msg, times - 1);
    }

    public String encode(String message) {
        String msg = "";
        for (int i = 0; i < message.length(); i++) {
            String tripled = this.repeatString(String.valueOf(message.charAt(i)), 2);
            msg = msg.concat(tripled);
        }
        return msg;
    }

    public String decode(String message) {
        String msg = "";
        for (int i = 0; i < message.length(); i+=3) {
            char firstSymbol = message.charAt(i);
            if(message.charAt(i+2) == message.charAt(i+1)) {
                firstSymbol = message.charAt(i+1);
            }

            msg = msg.concat(String.valueOf(firstSymbol));
        }
        return msg;
    }
}
