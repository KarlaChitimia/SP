public class Main {
    public static void main(String[] args) {
        Comanda c = new Comanda("Comanda Karla");
        SubComanda s1 = new SubComanda("S1");
        SubComanda s2 = new SubComanda("S2");

        c.add(s1);
        c.add(s2);

        Pizza p1 = new Pizza("Diavola",28);
        Pizza p2 = new Pizza("Prosciutto", 20);
        Paste pas1 = new Paste("Carbonara", 16);
        Paste pas2 = new Paste("Bologneze", 18);
        Salate sal1 = new Salate("Caesar", 12);

        s1.add(p1);
        s1.add(pas1);
        s1.add(sal1);

        s2.add(p2);
        s2.add(pas2);

        VisitorStatistics vs = new VisitorStatistics();
        c.accept(vs);
        c.print();
        System.out.println();
        vs.print();
    }
}
