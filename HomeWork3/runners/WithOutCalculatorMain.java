package HomeWork3.runners;

import HomeWork3.calcs.simple.RoundingForSum;

/* 1. Создать класс WithOutCalculatorMain в котором небходимо посчитать следующие выражения:
	1.1) 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^"
	обозначает возведение в степень.
*/
public class WithOutCalculatorMain {
    public static void main(String[] args) {
        double sum = 4.1 + 15 * 7 + (((float)28/5)*((float)28/5)); //

        /*   4.1 + 15 * 7 + (28 / 5) ^ 2   Сначала решаем деление в скобках и возводим в степень.Т.к. у нас знака
        возведения в степень в IDE нет, то я решил записать "(28 / 5) ^ 2" как (28/5)*(28/5) ну и поместить
        в скобки для приоритета. Из деления получаем 5.6 . Воводим в степень, т.е. умножаем на саму себя =31.36 . Теперь
        производим умножение 15*7 = 105. Потом складываем 4.1+105 = 109.1 . Потом 109.1 + 31.36 = 140.46 . Ответ из
        уравнения будет 140.46 .
        */
//        System.out.println(sum);
        System.out.println(RoundingForSum.rounding(sum)); //тут округлил числа суммы после запятой до сотых и получил нужный мне результат= 140.46
    }
}