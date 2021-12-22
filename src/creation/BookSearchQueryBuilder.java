package creation;

import creation.catalogues.BritishLibraryCatalogue;
import creation.catalogues.OfficeLibraryCatalogue;

public class BookSearchQueryBuilder {


    private String surname;
    private String firstname;
    private String title;
    private Integer beforePublicationYear;
    private Integer afterPublicationYear;

    public BookSearchQueryBuilder withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public BookSearchQuery build(){
        return new BookSearchQuery(firstname, surname, title, afterPublicationYear, beforePublicationYear, getCatalogue());
    }

    private OfficeLibraryCatalogue getCatalogue(){
        return BritishLibraryCatalogue.getInstance();
    }

    public BookSearchQueryBuilder withFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public BookSearchQueryBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public BookSearchQueryBuilder publishedBefore(Integer beforePublicationYear) {
        this.beforePublicationYear = beforePublicationYear;
        return this;
    }

    public BookSearchQueryBuilder publishedAfter(Integer afterPublicationYear) {
        this.afterPublicationYear = afterPublicationYear;
        return this;
    }
}
