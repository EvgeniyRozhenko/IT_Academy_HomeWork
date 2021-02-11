package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoComposite;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;
import HomeWork3.calcs.simple.RoundingForSum;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite(new CalculatorWithMathExtends());
//        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite(new CalculatorWithOperator());

        System.out.println(calc.getCountOperation());
        System.out.println("sum: " + RoundingForSum.rounding(calc.addition(calc.addition(4.1, calc.multiplication(15, 7)),(calc.power(calc.division(28, 5), 2)))));
        System.out.println(calc.getCountOperation());
    }
}
