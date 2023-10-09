package ie.atu.lab2exercise3mac.lab2exercise3mac;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String title;
    private String author;
    private String isbn;
    private String publishedYear;
}
