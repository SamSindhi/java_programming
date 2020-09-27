package book;

class Book {
  
  private String title;
  private String author;
  private int publishedYear;
  private int pagesNumber;
  private boolean canBeBorrowed;

  private boolean isNullOrEmpty(String str) {
    if(str == null || str.isEmpty()) {
      return true;
    }
    return false;
  }

  Book(String title, String author, int publishedYear, int pagesNumber, boolean canBeBorrowed) {
    if(!isNullOrEmpty(title) && !isNullOrEmpty(author)) {
      this.title = title;
      this.author = author;
      this.publishedYear = publishedYear;
      this.pagesNumber = pagesNumber;
      this.canBeBorrowed = canBeBorrowed;
    } else {
      throw new RuntimeException("Not all parameters were put into the constructor.");
    }
  }

  public String toString() {
    String bookData = 
      "title: " + title + "\n" + 
      "author: " + author + "\n" + 
      "published year: "  + String.valueOf(publishedYear) + "\n" +
      "number of pages: " + String.valueOf(pagesNumber) + "\n" +
      "can be borrowed" + String.valueOf(canBeBorrowed);
    return bookData;
  }
  
  public boolean sameAs(Book book) {
    final boolean areSame =
      book.title.equals(this.title) && book.author.equals(this.author) 
      && this.publishedYear == book.publishedYear
      && this.pagesNumber == book.pagesNumber ? true : false;
    return areSame;
  }
}
