package Part5.OOPProgramming.ObjectsAndReferences;

public class Book {
    private String bookName;
    private int publicationYear;

    public Book(String bookName, int publicationYear) {
        this.bookName = bookName;
        this.publicationYear = publicationYear;

    }
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Book)) {
            return false;
        }
        Book comparedBook = (Book) compared;

        return (this.bookName.equals(comparedBook.bookName) &&
                this.publicationYear == comparedBook.publicationYear);
    }
}
