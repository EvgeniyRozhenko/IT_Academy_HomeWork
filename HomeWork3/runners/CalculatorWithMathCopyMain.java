package HomeWork3.runners;


import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.RoundingForSum;

/*
3.3 Создать класс CalculatorWithMathCopyMain в котором будет точка входа (main метод). В main методе требуется создать
	экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль
	результат.
 */
public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();

        System.out.println("sum: " + RoundingForSum.rounding(calc.addition(calc.addition(4.1, calc.multiplication(15, 7)),(calc.power(calc.division(28, 5), 2)))));
    }
}
