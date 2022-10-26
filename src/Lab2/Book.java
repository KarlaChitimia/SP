
package Lab2;

import java.util.ArrayList;
public class Book {
	private String title;
	private ArrayList<Author> authors;
	private ArrayList<Element> content = new ArrayList<>();
	

	public Book(String name) {
		this.title = name;
	}

	public void print() {
		System.out.println("Book: " + this.title + "\n");
		System.out.println("Authors: ");
		for(Author a : authors) {
			a.print();
		}
		
		System.out.println("\n");
		
		for(Element e: content) {
			e.print();
		}
	}

	public void addAuthor(Author a) {
		if(authors == null) {
			authors = new ArrayList<>();
		}
		authors.add(a);
	}

	public void addContent(Element e) {
		this.content.add(e);
	}
}
