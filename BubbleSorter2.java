import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Класс BubbleSorter2, который сортирует коллекцию объектов, реализующих Comparable, с использованием Collections.sort
public class BubbleSorter2 {
    public static <E extends Comparable<? super E>> void sort(Collection<E> collection) {
        // Преобразование коллекции в список
        List<E> list = new ArrayList<>(collection);
        
        // Сортировка списка с использованием Collections.sort
        Collections.sort(list);
        
        // Очистка оригинальной коллекции и добавление отсортированных элементов
        collection.clear();
        collection.addAll(list);
    }
}