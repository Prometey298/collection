import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BubbleSorter2 {
    public static <E extends Comparable<? super E>> void sort(Collection<E> collection) {
        List<E> list = new ArrayList<>(collection);
        Collections.sort(list);
        collection.clear();
        collection.addAll(list);
    }
}