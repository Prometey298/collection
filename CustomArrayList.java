import java.util.ArrayList;
import java.util.Collection;

public class CustomArrayList<E> extends ArrayList<E> {
    public CustomArrayList(Collection<? extends E> collection) {
        super(collection); 
    }
}