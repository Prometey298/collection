// Класс BubbleSorter, который сортирует массив целых чисел с использованием алгоритма пузырьковой сортировки
public class BubbleSorter {
    public static void sort(int[] array) {
        boolean swapped;
        
        // Перебор элементов массива
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false; 
            
            // Сравнение каждой пары соседних элементов и их обмен при необходимости
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true; 
                }
            }
            
            // Если обменов не было, массив уже отсортирован
            if (!swapped) break;
        }
    }
}
