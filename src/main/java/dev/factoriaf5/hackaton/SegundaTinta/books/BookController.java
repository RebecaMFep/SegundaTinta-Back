package dev.factoriaf5.hackaton.SegundaTinta.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
    


@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Obtener todos los libros
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.findAll();
    }

    // Obtener un libro por ID
    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) {
        return bookService.findById(id);
    }

 

   

}




