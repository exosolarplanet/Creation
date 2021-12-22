package creation.catalogues;

import creation.Book;

import java.util.List;

public interface OfficeLibraryCatalogue {
    List<Book> searchFor(String query);
}
