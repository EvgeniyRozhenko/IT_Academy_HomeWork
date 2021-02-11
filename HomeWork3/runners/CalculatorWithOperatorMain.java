package HomeWork3.runners;
/*
2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод). В main методе требуется
	создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в
	консоль результат.
 */

import HomeWork3.calcs.simple.CalculatorWithOperator;
import HomeWork3.calcs.simple.RoundingForSum;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithOperator calc = new CalculatorWithOperator();

        System.out.println("sum: " + RoundingForSum.rounding(calc.addition(calc.addition(4.1, calc.multiplication(15, 7)),(calc.power(calc.division(28, 5), 2)))));
    }
}
