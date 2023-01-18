package org.telran.hw_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Author author() {
        return new Author("John");
    }

    @Bean
    public Reader reader() {
        Reader reader = new Reader();
        reader.setName("Anna");
        reader.setBook(book());
        return reader;
    }

    @Bean("book")
    public Book book() {
        return new Book(author(), "The next");
    }
}
