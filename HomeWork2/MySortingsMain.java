package HomeWork2;

import java.util.Arrays;

public class MySortingsMain {
    public static void main(String[] args) {
        final int [] test1 = {1, 2, 3, 4, 5, 6};
        System.out.println("Массив test1 до сортировки:");
        System.out.println(Arrays.toString(test1) + '\n'); // вывод в консоль элементов переданного массива
        System.out.println("Выполнили сортировку массива test1 с числами методом пузырька:");
        System.out.println(Arrays.toString(MySortings.bubbleMethod(test1)));
        System.out.println("Выполнили сортировку массива test1 с числами методом выборки:");
        System.out.println(Arrays.toString(MySortings.selectionMethod(test1)));
        System.out.println("Выполнили сортировку массива test1 с числами методом шейкера:");
        System.out.println(Arrays.toString(MySortings.shakerMethod(test1)) + '\n');

        final int [] test2 = {1,1,1,1};
        System.out.println("Массив test2 до сортировки:");
        System.out.println(Arrays.toString(test2) + '\n'); // вывод в консоль элементов переданного массива
        System.out.println("Выполнили сортировку массива test2 с числами методом пузырька:");
        System.out.println(Arrays.toString(MySortings.bubbleMethod(test2)));
        System.out.println("Выполнили сортировку массива test2 с числами методом выборки:");
        System.out.println(Arrays.toString(MySortings.selectionMethod(test2)));
        System.out.println("Выполнили сортировку массива test2 с числами методом шейкера:");
        System.out.println(Arrays.toString(MySortings.shakerMethod(test2)) + '\n');

        final int [] test3 = {9,1,5,99,9,9};
        System.out.println("Массив test3 до сортировки:");
        System.out.println(Arrays.toString(test3) + '\n'); // вывод в консоль элементов переданного массива
        System.out.println("Выполнили сортировку массива test3 с числами методом пузырька:");
        System.out.println(Arrays.toString(MySortings.bubbleMethod(test3)));
        System.out.println("Выполнили сортировку массива test3 с числами методом выборки:");
        System.out.println(Arrays.toString(MySortings.selectionMethod(test3)));
        System.out.println("Выполнили сортировку массива test3 с числами методом шейкера:");
        System.out.println(Arrays.toString(MySortings.shakerMethod(test3)) + '\n');

        final int [] test4 = {};
        System.out.println("Массив test3 до сортировки:");
        System.out.println(Arrays.toString(test4) + '\n'); // вывод в консоль элементов переданного массива
        System.out.println("Выполнили сортировку массива test4 с числами методом пузырька:");
        System.out.println(Arrays.toString(MySortings.bubbleMethod(test4)));
        System.out.println("Выполнили сортировку массива test4 с числами методом выборки:");
        System.out.println(Arrays.toString(MySortings.selectionMethod(test4)));
        System.out.println("Выполнили сортировку массива test4 с числами методом шейкера:");
        System.out.println(Arrays.toString(MySortings.shakerMethod(test4)) + '\n');

        int [] myArray = MySortings.randomArray(); // создаём массив и присваиваем ему массив созданный через метод рэндом
        System.out.println("Массив random до сортировки:");
        System.out.println(Arrays.toString(myArray)); // вывод в консоль элементов переданного массива
        System.out.println("Выполнили сортировку массива с числами методом пузырька:");
        System.out.println(Arrays.toString(MySortings.bubbleMethod(myArray)) + '\n');

        myArray = MySortings.randomArray();
        System.out.println("Массив random до сортировки:");
        System.out.println(Arrays.toString(myArray)); // вывод в консоль элементов переданного массива
        System.out.println("Выполнили сортировку массива с числами методом выборки:");
        System.out.println(Arrays.toString(MySortings.selectionMethod(myArray)) + '\n');

        myArray = MySortings.randomArray();
        System.out.println("Массив random до сортировки:");
        System.out.println(Arrays.toString(myArray)); // вывод в консоль элементов переданного массива
        System.out.println("Выполнили сортировку массива с числами методом шейкера:");
        System.out.println(Arrays.toString(MySortings.shakerMethod(myArray)) + '\n');

        final int [] myConsoleArray = MySortings.ArrayByConsole(); // создаём массив и присваиваем ему массив созданный через консольный метод
        System.out.println("Массив черезконсольный до сортировки:");
        System.out.println(Arrays.toString(myConsoleArray) + '\n'); // вывод в консоль элементов переданного массива
        System.out.println("Выполнили сортировку массива с числами методом пузырька:");
        System.out.println(Arrays.toString(MySortings.bubbleMethod(myConsoleArray)));
        System.out.println("Выполнили сортировку массива с числами методом выборки:");
        System.out.println(Arrays.toString(MySortings.selectionMethod(myConsoleArray)));
        System.out.println("Выполнили сортировку массива с числами методом шейкера:");
        System.out.println(Arrays.toString(MySortings.shakerMethod(myConsoleArray)) + '\n');
    }
}
