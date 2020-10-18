import java.io.*;

class ParityDetection {
    public static String outputText(int number, String type) {
        return String.valueOf(number) + "is an " + type + " number";
    }

    public static void main(String[] args) {
        String name = "./nums.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(name))){
            String text = "";
            String line;
            while ( null != (line = br.readLine()) ) {
               int num = Integer.parseInt(line);
               text += (num  % 2 == 0) ? outputText(num, "even") : outputText(num, "odd");
            }
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}