import java.io.*;

class ReadTextFile {
  public static int numberOfLines(File input) {
    String i;
    int j = 0;
    try (BufferedReader br = new BufferedReader(new FileReader(input))) {
      while ((i = br.readLine()) != null) {
        j++;
      }
    } catch (IOException e) {
      System.out.println("File not found");
    }

    return j;
  }
  
  public static void writeFileContent(String file, long skipper) {
    File input = new File(file);
 
    int linesCount = numberOfLines(input);
    try (BufferedReader br = new BufferedReader(new FileReader(input))) {
      String line = "";
      int i;
      while ((i = br.read()) != -1) {
        line += (char)i;
        long skipperLocal = skipper;
        if (skipperLocal != 0 && skipperLocal < linesCount) {
          while((char)(i = br.read()) != '\n')  {}
          while (skipperLocal != 0) {
            while((char)(i = br.read()) != '\n')  {}
            skipperLocal--;
          }
        } 
      }
      if(linesCount <= skipper) {
        System.out.println("Warning: There are no so much lines to skip in the file");
      }
      System.out.println("Output: ");
      System.out.println(line);
    } catch (IOException e) {
      System.out.println("Error: File not found: " + input);
      System.out.println(e.getMessage());
    }

  }

  public static void main(String[] args) {
    if (args.length < 1 || args.length > 2) {
      System.err.println("Error: Please provide filename(required) and long number(not required)");
      System.exit(1);
    }
    File input = new File(args[0]);
    long skipper = 0;

    if (args.length == 2) {
      try {
       skipper = Long.valueOf(args[1]);
     } catch (NumberFormatException e) {
        System.out.println("Warning: If you enter second argument if should be a number");
      } 
    }  
    
    writeFileContent(args[0], skipper);    
  }
}
