import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookShelf {
  List<Book> bookList = new ArrayList<>();

  public void put(String author, String title, int releaseYear) { // put method
    bookList.add(new Book(author, title, releaseYear));
  }

  public void remove(String title) {
    for (int i = 0; i < bookList.size(); i++) {
      if (bookList.get(i).title.equals(title))
        bookList.remove(i);
    }
  }

  public Book earliestBook() {
    //return bookList.stream().min((book1, book2) -> book1.releaseYear - book2.releaseYear).get();

    if (bookList.isEmpty())
      return new Book("N/A", "N/A", 0);
    Book bookMin = bookList.get(0);
    for (int i = 1; i < bookList.size(); i++) {
      if (bookList.get(i).releaseYear < bookMin.releaseYear) {
        bookMin = bookList.get(i);
      }
    } return bookMin;
  }

  public Book latestBook() {
    // return bookList.stream().max((book1, book2) -> book1.releaseYear - book2.releaseYear).get();

    if (bookList.isEmpty())
      return new Book("N/A", "N/A", 0);
    Book bookMax = bookList.get(0);
    for (int i = 1; i < bookList.size(); i++) {
      if (bookList.get(i).releaseYear > bookMax.releaseYear) {
        bookMax = bookList.get(i);
      }
    } return bookMax;
  }

  public String favouriteAuthor() {

    //return bookList.stream().collect(Collectors.groupingBy(i -> i.author, Collectors.counting())).entrySet().stream().max((entry1, entry2) -> (int)(entry1.getValue() - entry2.getValue())).get().getKey();

    Map<String, Integer> authorList = new HashMap<>();
    int maxNumAuthor = 0;
    for (Book actualBook : bookList) {
      if (authorList.containsKey(actualBook.author)) {
        int occurrence = authorList.get(actualBook.author) + 1;
        authorList.put(actualBook.author, occurrence);
        maxNumAuthor = Math.max(maxNumAuthor, occurrence);
      } else {
        int occurrence = 1;
        authorList.put(actualBook.author, occurrence);
        maxNumAuthor = Math.max(maxNumAuthor, occurrence);
      }
    }

    for (Map.Entry<String, Integer> entity : authorList.entrySet()) {
      if(entity.getValue() == maxNumAuthor)
        return entity.getKey();
    }

    return "N/A";
  }

  @Override
  public String toString() {
    if (bookList.size() == 0) {
      return "You have no books here.";
    } else {
      return "You have " + bookList.size() + " books.\nEarliest released: " + earliestBook() + "\nLatest released: " + latestBook() + "\nFavourite author: " + favouriteAuthor();
    }
  }
}

