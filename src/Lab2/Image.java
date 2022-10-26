
package Lab2;

import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    private String imageName;
    private Dimension dim;

    public Image(String imageName) {
        this.imageName = imageName;
        try {
        	TimeUnit.SECONDS.sleep( 5 );
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
        this.dim = new Dimension(1, 2);
    }
    
    public void print(){
        System.out.println("Image with name: " + imageName);
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
		if (!(e instanceof Image)) {
			return false;
		}
		else {
			return ((Image) e).imageName.equals(this.imageName);
		}
	}

	@Override
	public String url() {
		// TODO Auto-generated method stub
		return imageName;
	}

	@Override
	public Dimension dim() {
		// TODO Auto-generated method stub
		return this.dim;
	}
}
