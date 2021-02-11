package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoCompositeInterface;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.RoundingForSum;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithCounterAutoCompositeInterface calc = new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathExtends());

        System.out.println(calc.getCountOperation());
        System.out.println("sum: " + RoundingForSum.rounding(calc.addition(calc.addition(4.1, calc.multiplication(15, 7)),(calc.power(calc.division(28, 5), 2)))));
        System.out.println(calc.getCountOperation());
    }
}
