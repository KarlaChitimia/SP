import java.util.ArrayList;
import java.util.List;

public class Comanda implements Element{
    private String nume;

    private List<Element> listaC = new ArrayList<Element>();

    public Comanda(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Element> getListaC() {
        return listaC;
    }

    public void setListaC(List<Element> listaC) {
        this.listaC = listaC;
    }


    @Override
    public void print() {
        System.out.println("\n" + "Nume Comanda: " + this.nume);
        for(int i = 0; i < listaC.size(); i++){
            listaC.get(i).print();
        }
    }

    @Override
    public void add(Element addElement) {
        listaC.add(addElement);
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
        visitor.visitComanda(this);
        for (Element el: listaC)
        {
            el.accept(visitor);
        }
    }
}
