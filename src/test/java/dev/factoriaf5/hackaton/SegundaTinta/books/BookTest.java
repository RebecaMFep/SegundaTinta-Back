package dev.factoriaf5.hackaton.SegundaTinta.books;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;
public class BookTest {

    @Test
    void testEventProperties() {
        Book book = new Book();

        assertThat(book.getClass().getDeclaredFields().length, is(5));
        assertThat(book.getId(), is(1L));
        assertThat(book.getTitle(), is("Un apartamento en Urano: Crónicas del cruce"));
        assertThat(book.getAuthor(), is("Paul B. Preciado"));
        assertThat(book.getGenre(), is("Ensayo, Filosofía contemporánea, Estudios de género, Autobiografía, LGTBIQA+"));
        assertThat(book.getDescription(), is("foo"));
        
    }

    

}
