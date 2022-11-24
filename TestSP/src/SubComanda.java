import java.util.ArrayList;
import java.util.List;

public class SubComanda implements Element{

    private String nume;
    private List<Element> listaSc = new ArrayList<Element>();

    public SubComanda(String nume) {
        this.nume = nume;
    }

    public SubComanda() {}

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Element> getListaSc() {
        return listaSc;
    }

    public void setListaSc(List<Element> listaSc) {
        this.listaSc = listaSc;
    }

    @Override
    public void print() {
        System.out.println(" Nume SubComanda: " + this.nume);
        for(int i = 0; i < listaSc.size(); i++){
            listaSc.get(i).print();
        }
    }

    @Override
    public void add(Element addElement) {
        listaSc.add(addElement);
    }

    @Override
    public void remove(Element removeElement) {

    }

    @Override
    public int get(Element getElement) {
        return 0;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSubComanda(this);
        for (Element el: listaSc)
        {
            el.accept(visitor);
        }
    }
}
