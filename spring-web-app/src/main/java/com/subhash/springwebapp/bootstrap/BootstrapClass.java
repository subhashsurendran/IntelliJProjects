package com.subhash.springwebapp.bootstrap;

import com.subhash.springwebapp.domain.Author;
import com.subhash.springwebapp.domain.Book;
import com.subhash.springwebapp.domain.Publisher;
import com.subhash.springwebapp.repositories.AuthorRepository;
import com.subhash.springwebapp.repositories.BookRepository;
import com.subhash.springwebapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapClass implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;


    public BootstrapClass(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher1 = new Publisher();
        publisher1.setName("SFG Publishing");
        publisherRepository.save(publisher1);

        Author eric = new Author("Eric", "Evans");
        Book ericBook = new Book("Domain Driven Design", "dd1254");
        String jsonString = "Your JSON string";
        HashMap<String,String> map = new Gson().fromJson(jsonString,
                new TypeToken<HashMap<String, String>>(){}.getType());

        eric.getBooks().add(ericBook);
        ericBook.getAuthors().add(eric);
        ericBook.setPublisher(publisher1);
        publisher1.getBooks().add(ericBook);

        authorRepository.save(eric);
        bookRepository.save(ericBook);
        publisherRepository.save(publisher1);

        System.out.println("Publisher Count "+publisherRepository.count());

        Author rod = new Author("Rod", "Johnson");
        Book rodBook = new Book("J2EE Development", "DD5245");
        rod.getBooks().add(rodBook);
        rodBook.getAuthors().add(rod);
        rodBook.setPublisher(publisher1);
        publisher1.getBooks().add(rodBook);

        authorRepository.save(rod);
        bookRepository.save(rodBook);
        publisherRepository.save(publisher1);
        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books "+bookRepository.count());
        System.out.println("Number of books assigned to publisher "+publisher1.getBooks().size());


    }
}
