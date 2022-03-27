
public class NamesRepository implements Container{
    private String names[]= new String[100];
    private int num = 0;
    public void addName(String name) {
        if (num< names.length){
            names[num] = name;
            num++;
        }
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            if(index<num) return true;
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) return names[index++];
            return null;
        }
    }
}
