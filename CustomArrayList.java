import java.util.ArrayList;
import java.util.Collection;

// CustomArrayList расширяет ArrayList и принимает коллекцию в качестве параметра конструктора
public class CustomArrayList<E> extends ArrayList<E> {
    // Конструктор, принимающий коллекцию и передающий её в конструктор суперкласса
    public CustomArrayList(Collection<? extends E> collection) {
        super(collection); 
    }
}