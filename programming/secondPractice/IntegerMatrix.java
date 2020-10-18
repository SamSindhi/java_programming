public IntegerMatrix {
  private int rowNum;
  private int colNum;
  private[][] int data;

  public IntegerMatrix(int rowNum, int colNum, int[] linearData) {
    if(rowNum * colNum != linearData.length) {
      throw new IllegalArgumentException("row number * column number doesnt match with the length");
    }
    this.rowNum = rowNum;
    this.colNum = colNum;
    this.data = new int[this.rowNum][this.colNum];

    for (int i = 0; i < linearData.length; i++) {
      int row = (int) Math.floor(i/ colNum);
      int col = i % colNum;
      System.out.println(i + " " + row + " " + col);
      data[row][col] = linearData[i];
    }
  }

  private String toString3() {
    StringBuilder sb = new StringBuilder();
    String rowDelim = "";
    String colDelim = "";


    if (data.length < 0) {
      return s;
    }

    for(int[] item : data) {
      sb.append(rowDelim);
      rowDelim = ";";
      for(int i : item) {
        sb.append(colDelim);
        colDelim = ",";
        sb.append(elem);
      }
      colDelim = "";
    }

    return sb.toString();
  }

  public String toString() {
    return toString3;
  }
}
