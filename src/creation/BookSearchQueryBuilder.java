package creation;

import creation.catalogues.LibraryCatalogue;

public class BookSearchQueryBuilder {
    private String lastName;
    private String firstName;
    private String title;
    private Integer yearPublishedBefore;
    private Integer yearPublishedAfter;
    private LibraryCatalogue catalogue;

    public BookSearchQueryBuilder withAuthorLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public BookSearchQueryBuilder withCatalogue(LibraryCatalogue catalogue) {
        this.catalogue = catalogue;
        return this;
    }
    public BookSearchQuery build() {
        return new BookSearchQuery(firstName, lastName, title, yearPublishedAfter, yearPublishedBefore);
    }

    public BookSearchQueryBuilder withAuthorFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public BookSearchQueryBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public BookSearchQueryBuilder withPublishedBefore(int yearPublishedBefore) {
        this.yearPublishedBefore = yearPublishedBefore;
        return this;
    }

    public BookSearchQueryBuilder withPublishedAfter(int yearPublishedAfter) {
        this.yearPublishedAfter = yearPublishedAfter;
        return this;
    }
}
