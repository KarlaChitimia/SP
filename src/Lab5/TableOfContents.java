package Lab5;

public class TableOfContents implements Element {
        private String name;
        public TableOfContents(String name) {
            super();
            this.name = name;
        }
        public void print() {
            System.out.println("TableOfContents with name: " + name);
        }

        @Override
        public void add(Element e) throws Exception {

        }
        @Override
        public Element get(int poz) {
            return null;
        }
        @Override
        public void remove(Element e) {

        }
        @Override
        public boolean find(Element e) {
            return false;
        }
}

