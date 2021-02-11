package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoSuper;
import HomeWork3.calcs.simple.RoundingForSum;

/*
6.7 Создать класс CalculatorWithCounterAutoSuperMain в котором будет точка входа (main метод). В main методе
	требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
	Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */
public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();

        System.out.println(calc.getCountOperation());
        System.out.println("sum: " + RoundingForSum.rounding(calc.addition(calc.addition(4.1, calc.multiplication(15, 7)),(calc.power(calc.division(28, 5), 2)))));
        System.out.println(calc.getCountOperation());


    }
}
