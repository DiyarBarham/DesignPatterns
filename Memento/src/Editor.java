public class Editor {
    private String txt;

    public void setTxt(String txt){
        this.txt = txt;
        System.out.println("Txt file is:\n"+txt);
    }

    public Memento saveToMemento(){
        System.out.println("Text is saved to Memento.");
        return new Memento(txt);
    }

    public void restoreFromMemento(Memento memento){
        txt = memento.getTxt();
        System.out.println("Txt resotred from Memento is:\n"+txt);
    }

    public static class Memento{
        private final String txt;

        public Memento(String txt) {
            this.txt = txt;
        }

        public String getTxt(){
            return txt;
        }
    }
}
