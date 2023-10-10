package ie.atu.lab2exercise3mac.lab2exercise3mac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
public class LibraryController {
    private LibraryService libraryService;

    @Autowired
    public void setLibraryService(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @PostMapping("/addBook")
    public String getBook(@RequestBody Book book) {
        libraryService.addBook(book);
        return "Book added";
    }
}
