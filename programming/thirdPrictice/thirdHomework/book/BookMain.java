package book;

class BookMain {
  public static void main(String [] args) {
    // to test constructor try to put empty string or null into constructor's (result: runtime exception)
    // first two args
    Book bookOne = new Book("Peace and War", "Tolstoi", 1865, 1600, false);
    Book bookTwo = new Book("Manga", "J. Koko", 1920, 300, true);
    Book bookThree = new Book("Peace and War", "Tolstoi", 1865, 1600, true);
   

    // test .toString method here
    System.out.println(bookOne.toString());

    // test .sameAs method here
    System.out.println("Books are same: " + bookOne.sameAs(bookOne));
    System.out.println("Books are same: " + bookOne.sameAs(bookThree)); 
    System.out.println("Books are same: " + bookOne.sameAs(bookTwo));
  }
}
