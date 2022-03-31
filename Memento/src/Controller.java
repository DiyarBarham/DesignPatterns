import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args){
        List<Editor.Memento> savedTxts = new ArrayList<Editor.Memento>();

        Editor editor = new Editor();

        editor.setTxt("abc");
        savedTxts.add(editor.saveToMemento());
        editor.setTxt("Abc");
        savedTxts.add(editor.saveToMemento());
        editor.setTxt("ABc");
        savedTxts.add(editor.saveToMemento());
        editor.setTxt("ABC");
        savedTxts.add(editor.saveToMemento());

        editor.restoreFromMemento(savedTxts.get(0));
    }
}
