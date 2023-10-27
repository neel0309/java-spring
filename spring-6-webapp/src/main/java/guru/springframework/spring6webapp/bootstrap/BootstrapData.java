package guru.springframework.spring6webapp.bootstrap;

import guru.springframework.spring6webapp.repositories.AuthorRepository;
import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

   private  final AuthorRepository authorRepository;
   private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author neil = new Author();
        neil.setFirstName("Neil");
        neil.setLastName("Das");

        Book ddd = new Book();
        ddd.setTitle("something");
        ddd.setIsbn("something");

        Author neilsaved = (Author) authorRepository.save(neil);
        Book booksaved = (Book) bookRepository.save(ddd);

        neilsaved.getBooks().add(booksaved);

        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());
        }
    }

