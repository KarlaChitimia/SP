package Lab2;

public class TableOfContents implements Element {
	private String name;


	public TableOfContents(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("mesaj");
	}

	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
	}

	@Override
	public Element get(int poz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean find(Element e) {
		// TODO Auto-generated method stub
		if (!(e instanceof TableOfContents)) {
			return false;
		}
		else {
			return ((TableOfContents) e).name.equals(this.name);
		}
	}
}
