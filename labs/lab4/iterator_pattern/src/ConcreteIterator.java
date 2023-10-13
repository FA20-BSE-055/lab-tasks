
import java.util.ArrayList;
import java.util.List;
class ConcreteIterator<T> implements Iterator<T> {
    private List<T> collection;
    private int index;

    public ConcreteIterator(List<T> collection) {
        this.collection = collection;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < collection.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            T item = collection.get(index);
            index++;
            return item;
        }
        return null;
    }

    @Override
    public void previous() {
        if (index > 0) {
            index--;
        }
    }

    @Override
    public void moveToLast() {
        index = collection.size() - 1;
    }

    @Override
    public void moveToFirst() {
        index = 0;
    }
}
