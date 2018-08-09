package app.test.stream;

import java.util.List;

public class Student {
    private List<String> books;

    Student(List<String> books) {
        this.books = books;
    }

    List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }
}
