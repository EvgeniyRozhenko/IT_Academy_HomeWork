package HomeWork3;
/*3. Выполнить сортировку массива с числами:
 3.1 пузырьком
 3.2 выбором
 3.3 Сортировка методов Шейкера.
 */

import java.util.Arrays;
import java.util.Random;

public class MySortings {
    public static void main(String[] args) {
        int [] array = new int[10]; // Создаём массив с 10-ю элементами.
        Random nums = new Random(); // Созд. переменную с классом Random для генерации псевдослучайных чисел.
        System.out.println("Создали случайные значения для массива:");
        for (int i = 0; i < array.length; i++){  // Заполняем массив случайными числами и выводим в консоль.
            array[i] = nums.nextInt(13);  // Задаём макс. радиус для генер.чисел. От 0 до 12.
            System.out.print(array[i] + "  ");  // Выводим каждую новую сгенерированную цифру.
        }

        bubbleMethod(array);
        selectionMethod(array);
        shakerMethod(array);
    }

    public static void bubbleMethod(int [] array){
        boolean sorted = false; // Создаём булиновскую переменную - будет показателем отсортирован массив или нет.
        while (!sorted) {       // Т.к. мы не знаем сколько циклов нам нужно для сортировки исп. while с условием.
            sorted = true;
            for (int i = 0; i < array.length-1; i++) { // Т.к. мы сравниваем попарно 2 элемента (i и i+1), чтоб не выйти
                if(array[i] > array[i+1]){          // за пределы массива, делаем на 1 цикл меньше (array.length-1).
                    sorted = false;         // В случае, если бул.переменная =false, делаем перестановку пары элементов.
                    int cache = array[i];        // Обмен между 2-мя переменными с использованием третьей буферной.
                    array[i] = array[i+1];
                    array[i+1] = cache;
                }
            }
        }
        System.out.println('\n' + "Выполнили сортировку массива с числами методом пузырька:");
        System.out.println(Arrays.toString(array)); /* Выполнили сортировку по возрастанию и вывели значения в консоль
                                                     в виде строки.*/
    }

    public static void selectionMethod(int [] array){
        for (int i = 0; i < array.length; i++) { // Цикл для сравнения минимального элемента с первым элементом
            // неотсортированного массива.
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i){  // Условие при котором идёт сравнени двух элементов массива.
                int cache = array[i]; // Обмен между 2-мя переменными с использованием третьей буферной.
                array[i] = array[min];
                array[min] = cache;
            }
        }
        System.out.println("Выполнили сортировку массива с числами методом выборки:");
        System.out.println(Arrays.toString(array)); // Выводим уже отсортированный массив на консоль.
    }

    public static void shakerMethod(int[] array){
        int leftSide = 0, rightSide = array.length - 1; // Сортировка массива Шейкером
        System.out.println("Выполнили сортировку массива с числами методом шейкера:");
        int temp;
        do {

            for (int i = leftSide; i < rightSide; i++){ // Сортировка идёт вправо, ищем макс. значение

                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            rightSide--; // Уменьшаем количество проходов
            for (int i = rightSide; i > leftSide; i--){ // Сортируем уже в обратную сторону и ищём миним. значение
                if (array[i] < array[i - 1]){
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            leftSide++; // Уменьшаем количество проходов, т.к. мы шли с конца

        } while (leftSide < rightSide); // Условие при котором будут происходить прохождения
        for (int i : array){ // Здесь перебираем каждый индекс массива и выводим его значение
            System.out.print(i + "  ");
        }

    }
}
