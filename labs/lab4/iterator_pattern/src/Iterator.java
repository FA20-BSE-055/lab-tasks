
import java.util.ArrayList;
import java.util.List;
interface Iterator<T> {
    boolean hasNext();
    T next();
    void previous();
    void moveToLast();
    void moveToFirst();
}
