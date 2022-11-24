public interface Visitor {
    public void visitPizza(Pizza _Pizza);
    public void visitPaste(Paste _Paste);
    public void visitSalate(Salate _Salate);

    public void visitComanda(Comanda _Comanda);

    public void visitSubComanda(SubComanda _SubComanda);
}
