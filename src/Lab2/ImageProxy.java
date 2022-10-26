package Lab2;


public class ImageProxy implements Picture, Element {
	private String url;
	private Dimension dim;
	private Image realImage;
	
	public ImageProxy(String url) {
		// TODO Auto-generated constructor stub
		this.url = url;
		this.dim = new Dimension(5, 10);
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		Image img = loadImage();
		img.print();
	}

	@Override
	public void add(Element e) throws Exception {
		// TODO Auto-generated method stub
		// nu se implementeaza
	}

	@Override
	public Element get(int poz) {
		// TODO Auto-generated method stub
		// nu se implementeaza
		return null;
	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		// nu se implementeaza
	}

	@Override
	public boolean find(Element e) {
		// TODO Auto-generated method stub
		// nu se implementeaza
		return false;
	}

	@Override
	public String url() {
		// TODO Auto-generated method stub
		return url;
	}

	@Override
	public Dimension dim() {
		// TODO Auto-generated method stub
		return dim;
	}
	
	public Image loadImage() {
		if (realImage == null) {
			realImage = new Image(url);
		}
		return realImage;
	}
}
