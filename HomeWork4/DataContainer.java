package HomeWork4;

import java.util.Arrays;
import java.util.Comparator;

/*Суть задания: Создать класс который может сохранять в себе почти любое количество данных обобщённого типа и при этом
внешне, благодаря инкапусляции, не будет иметь недостатков массива:
1. Данный класс умеет добавлять в себя данные обобщённого типа.
2. Данный класс умеет удалять данные из себя двумя способами: по индексу и конкретный элемент.
3. Данный класс умеет сортировать в себе данные. Но учитывайте что в данном функционале есть проблема. Как написать
универсальный код сортировки и объяснить что один объект больше другого?
	3.1 Короткий ответ: подсказывать нашему методу как сравнивать объекты сохранённые в нём.
	3.2 Полный ответ: Для того чтобы написать более универсальный код, а также не гадать какого типа передадут
	данные и не придумывать способы сравнения этих данных, мы, при вызове сортировки, заставим передать реализацию
	сравнения (реализацию интерфейса Comparator) к которой нам нужно будет обращаться каждый раз когда нам нужно будет
	сравнить два объекта и которая скажет какой объект больше, а какой меньше или они равны.
Задание:
1. Создать класс DataContainer у которого есть один дженерик (обобщение). Например T. Данный класс как раз и будет
решать задачу поставленную перед нами: хранить неограниченное количество передаваемых объектов обобщённого типа.
2. Внутри DataContainer должно быть поле T[] data, внутренний массив, которое предназначено для хранения передаваемых
объектов. Да, именно T[] а не Object[]. Если использовать Object[] то это будет опасно и постоянно придётся делать
приведеление типов.
3. Из-за особенностей дженериков в данном классе обязательно будет присутствовать один конструктор DataContainer(T[]).
Есть и другие способы, но в рамках обучения они будут сложными и с ними мы разбираться будем слишком сложно.
4. В данном классе должен быть метод int add(T item) который добавляет данные во внутреннее поле data и возвращает
номер позиции в которую были вставлены данные, начиная с 0.
4.1 Если поле data не переполнено то данные нужно добавлять в первую позицию (ячейку) после последней заполненной
	позиции (ячейки).
	4.1.1 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777, null, null].
	Метод add вернёт число 3.
	4.1.2 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(null). Должно получиться data = [1, 2, 3, null, null, null].
	Метод add вернёт число -1. -1 будет индикатором того что данный элемент в наш контейнер вставлять нельзя.
	4.1.3 Пример: data = [1, null, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 777, 3, null, null, null].
	Метод add вернёт число 1.
4.2 В случае если поле data переполнено, нужно придумать механизм который будет расширять пространство для новых
	элементов. Тут вам поможет Arrays.copyOf.
	4.2.1 Пример: data = [1, 2, 3]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777]. Метод add вернёт число 3.
5. В данном классе должен быть метод T get(int index). Данный метод получает из DataContainer'а, из поля data, предварительно
сохранённый объект который мы передали на предыдущем шаге через метод add.
	5.1 Пример: data = []. Вызвали add(9999). Получили data = [9999]. Метод add вернул число 0. Вызываем get(0).
	Метод get возвращает 9999
	5.2 Пример: data = [9999]. Вызываем get(1). Метод get возвращает null
6. В данном классе должен быть метод T[] getItems(). Данный метод возвращает поле data.
7. Добавить метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу.
7.1 Метод возвращает true если у нас получилось удалить данные.
	7.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(3). Должно получиться data = [1, 2, 3]. Метод delete вернёт true
7.2 Метод возвращает false если нет такого индекса.
	7.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(9). Должно получиться data = [1, 2, 3, 777]. Метод delete вернёт false
7.3. Освободившуюся ячейку в поеле data необходимо удалить полностью. Пустых элементов не должно быть.
	7.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(2). Должно получиться data = [1, 2, 777]. Метод delete вернёт true
8. Добавить метод boolean delete(T item) который будет удалять элемент из нашего поля data.
8.1 Метод возвращает true если у нас получилось удалить данные.
	8.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(777). Должно получиться data = [1, 2, 3]. Метод delete вернёт true
8.2 Метод возвращает false если нет такого элемента.
	8.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(111). Должно получиться data = [1, 2, 3, 777]. Метод delete вернёт false
8.3 Освободившуюся ячейку необходимо удалить полностью. Пустых элементов не должно быть.
	8.3.1 Пример data = [1, 2, 3, 777, 3]. Вызывают delete(3). Должно получиться data = [1, 2, 777, 3]. Метод delete вернёт true
9. Добавить НЕ СТАТИЧЕСКИЙ метод void sort(Comparator<.......> comparator). Данный метод занимается сортировкой
данных записанных в поле data используя реализацию сравнения из ПЕРЕДАННОГО объекта comparator.
10. Переопределить метод toString() в классе и выводить содержимое data без ячеек в которых хранится null.
11.* В даном классе должен быть СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container) который будет
принимать объект DataContainer с дженериком extends Comparable. Данный метод будет сортировать элементы в ПЕРЕДАННОМ
объекте DataContainer используя реализацию сравнения вызываемый у хранимых объектов.


 */
public class DataContainer<T>{
//    private T item;
    private T[] data;


//    public DataContainer(){
//    }
//    public DataContainer(T value){
//        this.item = value;
//    }
    public DataContainer(T[] arr){  // конструктор для создания дженерика-массива
        this.data = arr;
    }

//    public T getItem(){
//        return item;
//    }
//    public void setItem(T item){
//        this.item = item;
//    }

    /**
     * метод получения значения по передаваемому индексу
     * @param index индекс по которому хотим получить значение
     * @return возврат значения по заданному индексу
     */
    public T get(int index) {
        if (index > this.data.length-1 || this.data[index] == null){
            return null;
        }
        return this.data[index];
    }
    /**
     * метод возвращающий переменную data поля класса
     * @return
     */
    public T[] getItems(){
        return this.data;
    }

    /**
     * метод добавления значения в указанный элемент
     * @param item передаваемое значение
     * @param elem номер элемента куда мы добавляем значение
     */
    public void add(T item, int elem){
        if (this.data.length == 0){
            expandGenArrLength();
            this.data[this.data.length-1] = item; // в случае нулевой размерности массива
        }else if (this.data.length-1 < elem){
            this.data = Arrays.copyOf(this.data, this.data.length + (elem - (this.data.length-1)));
            this.data[elem] = item;
            sortArrayByNull();
        }else{
        data[elem] = item;
        }
    }

    /**
     * метод добавляющий значение в первую пустую ячейку
     * @param item значение, которое нужно поместить
     * @return индекс элемента, куда поместили значение
     */
    public int add(T item){
        if (item == null){ //проверка передают ли нам null
            return -1; // показатель, что null передавать нельзя.
        }
        if (this.data.length == 0){ //проверка на нулевую длинну массива
            expandGenArrLength(); //расширение массива на 1 элемент
        }

        int count = 0; //переменная для хранения индекса элемента, куда поместили значение
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null){ //условие, где в пустую ячейку помещаем переданное значение
                this.data[i] = item;
                count = i;
                return count;
            }
        }
        if (this.data[this.data.length-1] != null){ //условие: последняя ячейка занята, добавляем новую пустую ячейку и помещаем значение в неё
            expandGenArrLength();
            data[this.data.length-1] = item;
            count = this.data.length-1;
        }
        return count;
    }

    /**
     * метод добавления нескольких значений в массив
     * @param items массив хранящий значения, которые мы хотим передать в наш массив
     */
    public void add(T[] items){
        if (this.data.length == 0){ //проверка на длину массива = 0
            expandGenArrLength();  //расширение длины на 1 элемент
        }
        sortArrayByNull();
        int countOfNull = 0;
        for (T elem:this.data) {
            if (elem == null){
                countOfNull++;
            }
        }
        if (items.length > countOfNull){
            this.data = Arrays.copyOf(this.data, this.data.length + (items.length - countOfNull));
        }
        int numOfElem = 0; //стартовый индекс массива, переданного в параметр
        for (int i = 0; i < this.data.length; i++) {
            if (data[i] == null && numOfElem <= items.length-1){ //проверка: если элемент массива пуст и если не закончились элементы переданного массива
                    data[i] = items[numOfElem]; //присваиваем значение элемента передаваемого массива
                    numOfElem++;
            }
        }
    }

    /**
     * метод удаления по значению первого подходящего элемента
     * @param item переданный обьект , хранящий значение, которое нужно удалить из массива
     * @return возвращаем булевское значение: удачно удалили или нет
     */
    public boolean delete(T item){
        for (int i = 0; i < this.data.length; i++){
            if (this.data[i] == item){
                this.data[i] = null;
                sortArrayByNull();
                this.data = Arrays.copyOf(this.data, this.data.length - 1);
                return true;
            }
        }
        return false;
    }
    /**
     * метод удаляющий нужный элемент массива
     * @param index номер элемента, который нужно удалить
     * @return возвращаем булевское значение: удалили или нет
     */
    public boolean delete(int index){
        if (index > this.data.length-1){
            return false;
        }
        this.data[index] = null;
        sortArrayByNull();
        this.data = Arrays.copyOf(this.data, this.data.length - 1);
        return true;
    }


    /**
     * метод расширения массива на 1 элемент
     */
    private void expandGenArrLength(){
        this.data = Arrays.copyOf(this.data, this.data.length + 1);
    }

    /**
     * метод сортировки элементов с null вправо
     */
    private void sortArrayByNull(){
        for (int i = 0; i < this.data.length-1; i++){
            if (this.data[i] == null){
                T temp = data[i];
                data[i] = data[i+1];
                data[i+1] = temp;
            }
        }
    }

    /**
     * переопределённый метод, позволяющий получить строку из значений (включая null) массива
     * @return строка, которую мы возвращаем в разных случаях
     */
    public String toStringWithNull(){
        if (this.data == null){
            return "null";
        }else {
            int iMax = this.data.length-1;
            if (iMax == -1){
                return "[]";
            }else {
                StringBuilder str = new StringBuilder();
                str.append('[');
                int i = 0;
                while(true){
                    str.append(String.valueOf(this.data[i]));
                    if (i == iMax){
                        return str.append(']').toString();
                    }
                    str.append(", ");
                    ++i;
                }
            }
        }
    }

    /**
     * переопределённый метод, позволяющий получить строку из значений (исключая null) массива
     * @return возвращаем строку, в зависимости от ситуации
     */
    public String toString(){
        if (this.data == null){
            return "null";
        }else {
            int iMax = this.data.length-1;
            if (iMax == -1){
                return "[]";
            }else {
                StringBuilder str = new StringBuilder();
                str.append('[');
                int i = 0;
                while(true){
                    if (this.data[i] == null){
                        ++i;
                        continue;
                    }
                    str.append(this.data[i]);
                    if (i == iMax){
                        return str.append(']').toString();
                    }
                    str.append(", ");
                    ++i;
                }
            }
        }
    }


    /**
     * метод сортирующий данные поля data
     * @param comparator обьект, который даёт нам способ сравнения двух элементов массива
     */
    public void sort(Comparator<T> comparator){
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < this.data.length-1; i++){
                if (comparator.compare(this.data[i], this.data[i+1]) > 0){
                    DataContainer.swap(this.data, i, i + 1);
                    swap = true;
                }
            }
        }while (swap);
    }

//    public static void sort(DataContainer<? extends Comparable> container){
//        boolean swap;
//        do {
//            swap = false;
//            for (int i = 0; i < container.data.length-1; i++){
//                if (container.data[i].compareTo(container.data[i+1]) > 0){
//                    DataContainer.swap(container.data, i, i + 1);
//                    swap = true;
//                }
//            }
//        }while (swap);
//    }

    /**
     * метод обмена значениями внутри массива
     * @param arr массив, где мы хотим сделать обмен значений
     * @param from элемент из которого мы хотим передать значние
     * @param to элемент в который мы хотим передать значение
     */
    private static <T> void swap(T[] arr, int from, int to){
        T temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }


}
