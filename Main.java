import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> initialList = new ArrayList<>(Arrays.asList("Apple", "Samsung", "Huawei"));
        CustomArrayList<String> customList = new CustomArrayList<>(initialList);
        String ios = customList.get(0);
        customList.remove(0);
        System.out.println(ios);
        ArrayList<String> anotheList = new ArrayList<>();
        anotheList.add("Honor");
        anotheList.add("Xiaomi");
        customList.addAll(1, anotheList);
        System.out.println(customList);
        sort(customList);
        System.out.println(customList);
        Collection<String> strings = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry"));
        BubbleSorter2.sort(strings);
        System.out.println(strings);
    }
}