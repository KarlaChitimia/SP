public class VisitorStatistics implements Visitor{

    int pretPizza, pretPaste, pretSalate;

    public VisitorStatistics() {
        pretPaste = pretPizza = pretSalate = 0;
    }

    @Override
    public void visitPizza(Pizza _Pizza) {
        pretPizza +=_Pizza.getPret();
    }

    @Override
    public void visitPaste(Paste _Paste) {
        pretPaste += _Paste.getPret();
    }

    @Override
    public void visitSalate(Salate _Salate) {
        pretSalate += _Salate.getPret();
    }

    @Override
    public void visitComanda(Comanda _Comanda) {

    }

    @Override
    public void visitSubComanda(SubComanda _SubComanda) {

    }

    public void print(){
        if(pretPizza > 0)
            System.out.println("Pret pizza: " + pretPizza);

        if(pretPaste > 0)
            System.out.println("Pret paste: " + pretPaste);

        if(pretSalate > 0)
            System.out.println("Pret salata: " + pretSalate);
        float total = pretPizza + pretPaste + pretSalate;
        System.out.println("Pret total: " + total);
        pretPaste = pretPizza = pretSalate = 0;
    }

}
