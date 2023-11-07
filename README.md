# java-spring


1. **Controllers/BookControllers** - The browser is going to be doing an HTTP GET against port 8080 that is going to we're doing a GET operation against books. 
                                      So right now this request mapping says I'm going to handle handle that books.

   2. BookService(Interface which is like a Dependency Injection) - We are going to the book service. So if we're coming to the book service, 
                                                                    we have that one implementation. If we follow that, that is going to be calling the book repository,
                                                                    the book repository(Which is in BookServeiceImplemenation) that is provided by Spring Data JPA, 
                                                                    that is going to be working in conjunction with Hibernate to go through the database
                                                                    and get a list of all books in the database, return that value.
                                                                    So this is going to return back in Iterable of Books through the book service.
                                                                    The book controller is apending that to the model. So the Spring framework's going to be 
                                                                    passing that model into getBooks to find all operation provides an iterable of books 
                                                                    against that. And then with ThymeLeaf, what happens there is when ThymeLeaf processes 
                                                                    this template using the template language.
