package ie.atu.lab2exercise3mac.lab2exercise3mac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
    private List<Book> Library = new ArrayList<>();

    public void addBook(Book book) {
        //Code to add new book
        Library.add(book);
    }

    public List<Book> getBooks() {
        //Code to get books
        return Library;
    }

}
