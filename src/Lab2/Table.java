package Lab2;

public class Table implements Element{
    private String title;

    public Table(String title) {
        this.title = title;
    }
    
    public void print() {
        System.out.println(title);
    }

	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		// nu e nevoie sa le implementam ca astea sunt frunze
	}

	@Override
	public Element get(int poz) {
		// TODO Auto-generated method stub
		// nu e nevoie sa le implementam ca astea sunt frunze
		return null;
	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		// nu e nevoie sa le implementam ca astea sunt frunze
	}

	@Override
	public boolean find(Element e) {
		// TODO Auto-generated method stub
		if (!(e instanceof Table)) {
			return false;
		}
		else {
			return ((Table) e).title.equals(this.title);
		}
	}
}
