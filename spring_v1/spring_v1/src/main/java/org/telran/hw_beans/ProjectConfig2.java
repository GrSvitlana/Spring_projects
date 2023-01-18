package org.telran.hw_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig2 {

    @Bean
    public Author author() {
        return new Author("John");
    }

    @Bean
    public Reader reader(Book book) {
        Reader reader = new Reader();
        reader.setName("Anna");
        reader.setBook(book);
        return reader;
    }

    @Bean
    public Book book(Author author) {
        return new Book(author(), "The next");
    }
}

