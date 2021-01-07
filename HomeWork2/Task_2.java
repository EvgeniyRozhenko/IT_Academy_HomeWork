package HomeWork2;
import java.util.Scanner;

/*2. Массивы:
 2.1 Вывести все элементы в консоль при помощи do....while, while, for, foreach.
 Элементы массива вводить через консоль. Массив хранит в себе числа.
 2.2 Вывести каждый второй элемент массива

*/
public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Введите кол-во элементов для всех массивов:");
        Scanner input = new Scanner(System.in); // Создаём класс сканнер, чтоб задать кол-во элементов массива через консоль.
        int lengthArray = input.nextInt();
        int array[] = new int[lengthArray];

        System.out.println("Нужно ввести" + " " + lengthArray + " " + "числа(чисел) для array#1 массива");
        for (int i = 0; i < array.length; i++) {  // Создаём цикл "for", чтоб разбить длину массива на составляющие элементы.
            System.out.println("Введите число для массива array#1:");
            array[i] = input.nextInt();
        }
        int a = 0;
        System.out.println("Так выглядит наш массив array#1 целых чисел:");
        while (a < array.length){  // исп. цикл "while" для того, чтобы дать каждому элементу цикла вводимое значение.
            System.out.println(a + " = " + array[a]); // цикл не закончится, пока условие не будет false.
            a++;
        }
        System.out.println("Выводим каждый второй элемент массива array#1:");
        a = 0;
        while (a < array.length){
            if ((a + 1) % 2 == 0 ) {
                System.out.println(a + " = " + array[a]);
            }
            a++;
        }

        System.out.println("Нужно ввести" + " " + lengthArray + " " + "числа(чисел) для array#2 массива");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число для массива array#2:");
            array[i] = input.nextInt();
        }
        int b = 0;
        System.out.println("Так выглядит наш массив array#2 целых чисел:");

        do { // Отличается этот цикл от "while" тем, что условие заданное в начале цикла хотя бы раз выполняется, а потом
            System.out.println(b + " = " + array[b]); // возвращается на петлю, пока условие "while" не будет false.
            b++;
        } while (b < array.length);
        System.out.println("Выводим каждый второй элемент массива array#2:");
        b = 0;
        do {
            if ((b+1) % 2 == 0) {
                System.out.println(b + " = " + array[b]);
            }
            b++;
        } while (b < array.length);

        System.out.println("Нужно ввести" + " " + lengthArray + " " + "числа(чисел) для array#3 массива");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число для массива array#3:");
            array[i] = input.nextInt();
        }
        System.out.println("Так выглядит наш массив array#3 целых чисел:");
        for (int c = 0; c < array.length; c++) {  //(задаётся начальное значение;условие выхода из цикла;оператор счётчика)
            System.out.println(c + " = " + array[c]);
        }
        System.out.println("Выводим каждый второй элемент массива array#3:");
        for (int c = 0; c < array.length; c++) {
            if ((c+1) % 2 == 0){
                System.out.println(c + " = " + array[c]);
            }
        }

        System.out.println("Нужно ввести" + " " + lengthArray + " " + "числа(чисел) для array#4 массива");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число для массива array#4:");
            array[i] = input.nextInt();
        }
        System.out.println("Так выглядит наш массив array#4 целых чисел:");
        int d = 0;
        for (int num : array) { // В этом цикле перебираем все элементы массива (тип и имя переменной куда последовательно
            System.out.println(d + " = " + num); //присваивается значение каждого элемента : имя массива).
            d++;
        }
        System.out.println("Выводим каждый второй элемент массива array#4:");
        d = 0;
        for (int num : array) {
            if ((d+1) % 2 == 0) {
                System.out.println(d + " = " + num);
            }
            d++;
        }
    }
}
