package dev.factoriaf5.hackaton.SegundaTinta.books;

import dev.factoriaf5.hackaton.SegundaTinta.books.BookService;


// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatusCode;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;
// import java.util.Optional;
    


// @RestController
// @RequestMapping(path = "${api-endpoint}/books")
// public class BookController {

//     private final BookService bookService;

//     @Autowired
//     public BookController(BookService bookService) {
//         this.bookService = bookService;
//     }

//     // Obtener todos los libros
//     @GetMapping(path = "")
//     public List<Book> index() {

//         List<Book> books = service.getAll();
//         return books;
//     }

//     // Obtener un libro por ID
//     @GetMapping(path = "/{id}")
//       public ResponseEntity<Book> getOneById(@PathVariable("id") Long id) throws Exception {

//         Book book = service.getById(id);

//         return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(book);
//     }
//     }

 
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
        return service.getAll();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Book> getOneById(@PathVariable("id") Long id) {
        Book book = service.getById(id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
} 






