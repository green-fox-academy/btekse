public class Book { //változó deklarálás
  String author;
  String title;
  int releaseYear;

  public Book(String author, String title, int releaseYear) { //konstruktor, példányosítás (könyv típusú elem létrehozása), mindenképpen szükséges érték kiosztás
    this.author = author;
    this.title = title;
    this.releaseYear = releaseYear;
  }
  @Override
  public String toString() {
    return author + " : " + title + " (" + releaseYear + ")";
  }
}
