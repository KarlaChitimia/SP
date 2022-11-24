package models;

import services.Visitor;

import java.util.ArrayList;

public class Book extends Section implements Element{
    private String title;
    private ArrayList<Author> authors;

    public Book(String name) {
        super();
        this.title = name;
    }
    public void print() {
        System.out.println("Book: " + this.title);
        System.out.println("Authors:");
        for(Author a : authors) {
            a.print();
        }
        super.print();
    }
    public void addAuthor(Author a) {
        if(authors == null) {
            authors = new ArrayList<>();
        }
        authors.add(a);
    }
    public void addContent(Element e) throws Exception {
        super.add(e);
    }

    @Override
    public void accept(Visitor v) {
        super.accept(v);
    }
}