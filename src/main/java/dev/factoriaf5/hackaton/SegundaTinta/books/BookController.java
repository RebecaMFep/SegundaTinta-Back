package dev.factoriaf5.hackaton.SegundaTinta.books;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



  
@RestController
@RequestMapping(path = "${api-endpoint}/announcements")
public class BookController {
    
    private final BookService service;

    @Autowired
    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Book> index() {
        return service.getAllBooks();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Book> getOneById(@PathVariable("id") Long id) {
        Book book = service.getBookById(id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
} 






