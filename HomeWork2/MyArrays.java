package HomeWork2;
import java.util.*;


/*2. Массивы:
 2.1 Вывести все элементы в консоль при помощи do....while, while, for, foreach.
 Элементы массива вводить через консоль. Массив хранит в себе числа.
 2.2 Вывести каждый второй элемент массива
 _______________________________________________________________________________
UPDATED!
2. Массивы. Получится два класса:
2.1 Написать метод public static int[] arrayFromConsole() рядом с main. Данный метод размер массива и каждый его элемент
 запрашивает у пользователя через консоль. Пример int[] container = arrayFromConsole(). Результат: В методе
 arrayFromConsole будет запрошена информация у пользователя, пользователь вводит размер (3) и его элементы по порядку
 {4, 17, 32}. Соответсвенно будет создан массив размером 3 с элементами {4, 17, 32} и сохранён в переменную container.
2.2 Перебор массива при помощи do....while, while, for, foreach. Элементы массива вводить используя метод arrayFromConsole().
Все задачи в одном классе, в отдельных методах.
	2.2.1 Вывести все элементы в консоль.
	2.2.2 Вывести каждый второй элемент массива в консоль.
	2.2.3 Вывести все элементы массива в консоль в обратном порядке.
2.3 Написать метод public static int[] arrayRandom(int size, int maxValueExclusion) рядом с main. Данный метод принимает
два аргумента. Первый (size) указывает размер массива который мы хотим получить. Второй (maxValueExclusion) указывает до
какого числа генерировать рандомные числа. Пример: int[] container = arrayRandom(5, 100). Результат: В методе arrayRandom
будет создан массив размером 5 с числами от 0 до 99 (использовать класс Random) и сохранён в переменную container.
2.4 Задачи взяты с сайта https://taskcode.ru/array. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах.
	2.4.1 Сумма четных положительных элементов массива
	2.4.2 Максимальный из элементов массива с четными индексами
	2.4.3 Элементы массива, которые меньше среднего арифметического
	2.4.4 Найти два наименьших (минимальных) элемента массива
	2.4.5 Сжать массив, удалив элементы, принадлежащие интервалу
	2.4.6 Сумма цифр массива
*/
public class MyArrays {

    /** метод позволяющий посчитать сумму чисел элементов передаваемого массива
     * @param array передаваемый массив для посчёта
     */
    public static void sumOfArrayDigits(int [] array){
        int sumOfDigits = 0;
        int num;
        System.out.print("Сумма цифр массива " + java.util.Arrays.toString(array) + " = ");
        for (int i = 0; i < array.length; i++){
            num = array[i];
            while (num > 0){
                sumOfDigits += num % 10;
                num /= 10;
            }
        }
        System.out.println(sumOfDigits);
    }

    /** метод сжатия массива, путём удаления элементов заданного диапазона
     * @param array передаваемый массив
     * @param from начало диапазона для удаления элементов
     * @param to конец диапазона для удаления элементов
     */
    public static int[] compressArray(int [] array, int from, int to){
        int a = from;
        int b = to;
        int length = array.length;
        int i = 0;
        System.out.println("Удаляемый диапазон: " + a + "...." + b);
        while (i < length){
            if (array[i] >= a && array[i] <= b){
                length -= 1;
                for (int j = i; j < length; j++){
                    array[j] = array[j+1];
                }
            }else{
                i += 1;
            }
        }
        for (int x = length; x < array.length; x++){
            array[x] = 0;
        }
        return Arrays.copyOf(array, length);
    }

    /** метод находящий два найменьших элемента массива
     * @param array передаваемый массив
     */
    public static void findTwoTheSmallestElemtsOfArray(int [] array){
        int min = array[1];
        int secMin = array[0];
        int numbEl = 1;
        int secNumbEl = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
                numbEl = i;
            }
        }
        for (int i = 1; i < array.length; i++){
            if (array[i] < secMin && array[i] > min){
                secMin = array[i];
                secNumbEl = i;
            }
        }
        if (min < secMin){
            System.out.println("Выявили два минимальных элемента массива: " + '\n' + "№" + numbEl + ": " + min + " и " + "№" + secNumbEl + ": " + secMin);
        }else{
            System.out.println("Выявили два минимальных элемента массива: " + '\n' + "№" + secNumbEl + ": " + secMin + " и " + "№" + numbEl + ": " + min);
        }
    }

    /** метод выявления элементов, значения которых меньше среднего арифметического
     * @param array массив передаваемый для поиска
     */
    public static void findElemtsWithLessThanArithmeticMean(int [] array){
        int sumOfElemts = 0;
        for (int elem: array){
            sumOfElemts += elem;
        }
        float arithmeticMean = (float) sumOfElemts / array.length;
        for (int i = 0; i < array.length; i++){
            if (array[i] < arithmeticMean){
                System.out.println("[" + i + "]" + " элемент со значением " + array[i] + " меньше, нежели среднее арифм. (" + arithmeticMean + ") значение элементов массива");
            }
        }
    }

    /** метод для нахождения максимального значения чётного элемента передаваемого массива
     * @param array массив передаваемый для поиска
     */
    public static void findMaxElemOfEvenElemtsOfArray(int [] array){
        int maxElem = 0;
        for (int i = 0; i < array.length; i++){
            if (i % 2 == 0){
                if (maxElem < array[i]){
                    maxElem = array[i];
                }
            }
        }
        System.out.println("Max значение чётного элемента массива: " + maxElem);
    }

    /** метод для выявления положительного и чётного элемента передаваемого массива
     * и подсчёта суммы таких элементов
     * @param array массив, который мы хотим проверить\перебрать
     */
    public static void determineTheNumberOfPositiveEvenNumbers(int [] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0 && ((array[i] % 2) == 0)){
                sum += array[i];
            }
        }
        System.out.println("Сумма всех положительных и чётных элементов: " + sum);
    }

    /** метод для печати массива через цикл While
     * @param array массив передаваемый из сканера
     */
    public static void printArrayByWhileMethod(int [] array){
        int a = 0;
        System.out.println("Так выглядит наш массив целых чисел по элементам: ");
        while (a < array.length){
            System.out.println(a + " = " + array[a]);
            a++;
        }
        System.out.println("Выводим каждый второй элемент массива: ");
        a = 0;
        while (a < array.length){
            if ((a + 1) % 2 == 0 ) {
                System.out.println(a + " = " + array[a]);
            }
            a++;
        }
        System.out.println("Так выглядит наш массив целых чисел по элементам в обратном порядке: ");
        a = array.length-1;
        while (a >= 0){
            System.out.println(a + " = " + array[a]);
            a--;
        }
    }

    /** метод для печати массива через цикл For
     * @param array массив передаваемый из сканера
     */
    public static void printArrayByForMethod(int [] array){
        int a;
        System.out.println("Так выглядит наш массив целых чисел по элементам: ");
        for (a = 0; a < array.length; a++){
            System.out.println(a + " = " + array[a]);
        }
        System.out.println("Выводим каждый второй элемент массива: ");
        for (a = 0; a < array.length; a++){
            if ((a+1) % 2 == 0 ) {
                System.out.println(a + " = " + array[a]);
            }
        }
        System.out.println("Так выглядит наш массив целых чисел по элементам в обратном порядке: ");
        for (a = array.length-1; a >= 0; a--){
            System.out.println(a + " = " + array[a]);
        }
    }

    /** метод для печати массива через цикл Do-While
     * @param array массив передаваемый из сканера
     */
    public static void printArrayByDoWhileMethod(int [] array){
        int a = 0;
        System.out.println("Так выглядит наш массив целых чисел по элементам: ");
        do {
            System.out.println(a + " = " + array[a]);
            a++;
        } while (a < array.length);

        System.out.println("Выводим каждый второй элемент массива: ");
        a = 0;
        do {
            if ((a + 1) % 2 == 0 ) {
                System.out.println(a + " = " + array[a]);
            }
            a++;
        } while (a < array.length);
        System.out.println("Так выглядит наш массив целых чисел по элементам в обратном порядке: ");
        a = array.length-1;
        do {
            System.out.println(a + " = " + array[a]);
            a--;
        }
        while (a >= 0);
    }

    /** метод для печати массива через цикл Foreach
     * @param array массив передаваемый из сканера
     */
    public static void printArrayByForeachMethod(int [] array){
        System.out.println("Так выглядит наш массив целых чисел по элементам: ");
        int i = 0;
        for (int a: array) {
            System.out.println(i + " = " + a);
            i++;
        }
        System.out.println("Выводим каждый второй элемент массива: ");
        i = 0;
        for (int a : array) {
            if (a % 2 == 0 ) {
                System.out.println(i + " = " + a);
            }
            i++;
        }
        System.out.println("Так выглядит наш массив целых чисел по элементам в обратном порядке: ");
        i = array.length-1;
        int x = 0;
        int temp;
        for (int a: array){
            temp = array[(array.length-1)-x];
            System.out.println(i + " = " + temp);
            i--;
            x++;
        }

    }

    /** Создаём класс сканнер, чтоб задать кол-во элементов массива через консоль.
     * @return новый массив с заданной длинной
     */
    public static int[] arrayFromConsole(){
        System.out.println("Введите кол-во элементов для массива:");
        Scanner input = new Scanner(System.in);
        int lengthArray = input.nextInt();
        int array[] = new int[lengthArray];
        System.out.println("Нужно ввести" + " " + lengthArray + " " + "числа(чисел) для массива");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число для массива:");
            array[i] = input.nextInt();
        }
        return array;
    }

    /** метод arrayRandom возвращает созданный массив с указанной длинной и случайными значениями элементов
     * @param size указывает размер массива который мы хотим получить
     * @param maxValueExclusion указывает до
     * какого числа генерировать рандомные числа
     * @return готовый массив
     */
    public static int[] arrayRandom(int size, int maxValueExclusion){
        Random rnd = new Random();
        int [] array = new int[size];
        for (int i = 0;i < array.length; i++){
            array[i] = rnd.nextInt(maxValueExclusion);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        printArrayByWhileMethod(container);
        printArrayByForMethod(container);
        printArrayByDoWhileMethod(container);
        printArrayByForeachMethod(container);
        int[] container2 = arrayRandom(5, 100);
        System.out.println(java.util.Arrays.toString(container2));
        determineTheNumberOfPositiveEvenNumbers(container2);
        findMaxElemOfEvenElemtsOfArray(container2);
        findElemtsWithLessThanArithmeticMean(container2);
        findTwoTheSmallestElemtsOfArray(container2);
        System.out.println(Arrays.toString(compressArray(container2, 19, 45)));
        sumOfArrayDigits(container2);

        // Старая работа ___________________________________________________________________________________________
//        System.out.println("Введите кол-во элементов для всех массивов:");
//        Scanner input = new Scanner(System.in); // Создаём класс сканнер, чтоб задать кол-во элементов массива через консоль.
//        int lengthArray = input.nextInt();
//        int array[] = new int[lengthArray];
//
//        System.out.println("Нужно ввести" + " " + lengthArray + " " + "числа(чисел) для array#1 массива");
//        for (int i = 0; i < array.length; i++) {  // Создаём цикл "for", чтоб разбить длину массива на составляющие элементы.
//            System.out.println("Введите число для массива array#1:");
//            array[i] = input.nextInt();
//        }
//        int a = 0;
//        System.out.println("Так выглядит наш массив array#1 целых чисел:");
//        while (a < array.length){  // исп. цикл "while" для того, чтобы дать каждому элементу цикла вводимое значение.
//            System.out.println(a + " = " + array[a]); // цикл не закончится, пока условие не будет false.
//            a++;
//        }
//        System.out.println("Выводим каждый второй элемент массива array#1:");
//        a = 0;
//        while (a < array.length){
//            if ((a + 1) % 2 == 0 ) {
//                System.out.println(a + " = " + array[a]);
//            }
//            a++;
//        }
//
//        System.out.println("Нужно ввести" + " " + lengthArray + " " + "числа(чисел) для array#2 массива");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Введите число для массива array#2:");
//            array[i] = input.nextInt();
//        }
//        int b = 0;
//        System.out.println("Так выглядит наш массив array#2 целых чисел:");
//
//        do { // Отличается этот цикл от "while" тем, что условие заданное в начале цикла хотя бы раз выполняется, а потом
//            System.out.println(b + " = " + array[b]); // возвращается на петлю, пока условие "while" не будет false.
//            b++;
//        } while (b < array.length);
//        System.out.println("Выводим каждый второй элемент массива array#2:");
//        b = 0;
//        do {
//            if ((b+1) % 2 == 0) {
//                System.out.println(b + " = " + array[b]);
//            }
//            b++;
//        } while (b < array.length);
//
//        System.out.println("Нужно ввести" + " " + lengthArray + " " + "числа(чисел) для array#3 массива");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Введите число для массива array#3:");
//            array[i] = input.nextInt();
//        }
//        System.out.println("Так выглядит наш массив array#3 целых чисел:");
//        for (int c = 0; c < array.length; c++) {  //(задаётся начальное значение;условие выхода из цикла;оператор счётчика)
//            System.out.println(c + " = " + array[c]);
//        }
//        System.out.println("Выводим каждый второй элемент массива array#3:");
//        for (int c = 0; c < array.length; c++) {
//            if ((c+1) % 2 == 0){
//                System.out.println(c + " = " + array[c]);
//            }
//        }
//
//        System.out.println("Нужно ввести" + " " + lengthArray + " " + "числа(чисел) для array#4 массива");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Введите число для массива array#4:");
//            array[i] = input.nextInt();
//        }
//        System.out.println("Так выглядит наш массив array#4 целых чисел:");
//        int d = 0;
//        for (int num : array) { // В этом цикле перебираем все элементы массива (тип и имя переменной куда последовательно
//            System.out.println(d + " = " + num); //присваивается значение каждого элемента : имя массива).
//            d++;
//        }
//        System.out.println("Выводим каждый второй элемент массива array#4:");
//        d = 0;
//        for (int num : array) {
//            if ((d+1) % 2 == 0) {
//                System.out.println(d + " = " + num);
//            }
//            d++;
//        }
    }
}
