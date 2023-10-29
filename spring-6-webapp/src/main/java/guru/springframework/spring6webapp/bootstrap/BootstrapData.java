package guru.springframework.spring6webapp.bootstrap;

import guru.springframework.spring6webapp.domain.Publisher;
import guru.springframework.spring6webapp.repositories.AuthorRepository;
import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.repositories.BookRepository;
import guru.springframework.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

   private  final AuthorRepository authorRepository;
   private final BookRepository bookRepository;
   private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author neil = new Author();
        neil.setFirstName("Neil");
        neil.setLastName("Das");

        Book ddd = new Book();
        ddd.setTitle("something");
        ddd.setIsbn("something");

        Publisher pub = new Publisher();
        pub.setPublisherName("Shubs");
        pub.setAddress("Germnay");
        pub.setCity("Hamburg");
        pub.setZip(70005);

        Author neilsaved = (Author) authorRepository.save(neil);
        Book booksaved = (Book) bookRepository.save(ddd);
        Publisher pubsaved = publisherRepository.save(pub);
        ddd.setPublisher(pubsaved);

        neilsaved.getBooks().add(booksaved);

        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());
        System.out.println("Publisher Count: " + publisherRepository.count());
        }
    }

