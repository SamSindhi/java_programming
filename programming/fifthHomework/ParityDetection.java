import java.io.*;

class ParityDetection {
    public static String outputText(int number, String type) {
        return String.valueOf(number) + " is an " + type + " number\n";
    }

    public static void main(String[] args) {
        final String name = "./nums.txt";
        final String output = "./out.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(name))){
            String text = "";
            String line;
            while ( null != (line = br.readLine()) ) {
               try {
                  int num = Integer.parseInt(line);
                  text += (num  % 2 == 0) ? outputText(num, "even") : outputText(num, "odd");
               } catch (NumberFormatException e) {
                  System.out.println("Warning: Can't parse to integer line: \n" + line);
               }
            }
            try (BufferedWriter out = new BufferedWriter(new FileWriter(output))) {
              out.write(text);
              out.close();
            } catch (IOException e) {
              System.out.println("No such file to write in: " + output);
              System.out.println(e.getMessage());
            } 
            //System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
