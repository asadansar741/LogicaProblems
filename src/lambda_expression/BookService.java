package lambda_expression;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksInSort(){
        List<Book> books = new BookDAO().getBooks();
//        Collections.sort(books,new MyComparator());
        Collections.sort(books,(book1,book2) -> book1.getName().compareTo(book2.getName()));//use lambda
//        Collections.sort(books,(book1,book2) -> book1.getId() - book2.getId());//sort with id asc
//        Collections.sort(books,(book1,book2) -> book2.getId() - book1.getId());//sort with id dsc
//        Collections.sort(books, Comparator.comparing(Book::getName));//use Function
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSort());
    }
}

class MyComparator implements Comparator<Book>{

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getName().compareTo(book2.getName());//Ascending order
//        return book2.getName().compareTo(book1.getName());// descending order
    }
}
