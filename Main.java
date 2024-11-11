import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {
        // Инициализация ArrayList с несколькими элементами
        ArrayList<String> initialList = new ArrayList<>(Arrays.asList("Apple", "Samsung", "Huawei"));
        
        // Создание CustomArrayList с использованием начального списка
        CustomArrayList<String> customList = new CustomArrayList<>(initialList);
        
        // Получение первого элемента (iOS) и его удаление из списка customList
        String ios = customList.get(0);
        customList.remove(0);
        
        // Вывод iOS
        System.out.println(ios);
        
        // Создание другого списка
        ArrayList<String> anotheList = new ArrayList<>();
        anotheList.add("Honor");
        anotheList.add("Xiaomi");
        
        // Вставка элементов из другого списка в customList с позицию 1
        customList.addAll(1, anotheList);
        
        // Вывод измененного customList
        System.out.println(customList);
        
        // Сортировка пузырьком customList в порядке возрастания 
        sort(customList);
        
        // Вывод отсортированного customList
        System.out.println(customList);
        
        // Создание коллекции строк для сортировки
        Collection<String> fruits = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry"));
        
        // Использование BubbleSorter2 для сортировки коллекции
        CollecSorter.sort(fruits);
        
        // Вывод отсортированной коллекции
        System.out.println(fruits);
    }
}