package HomeWork5;
/* 4. Создать класс CalculatorWithMathExtends.
4.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
4.2 Данный класс должен наследовать класс CalculatorWithOperator.
4.3 В классе должны присутствовать
    4.3.1 4 базовых математических метода (деления, умножение, вычитание, сложение) НЕ ДОЛЖНЫ быть объявлены в
    классе, а должны быть унаследованы от родительского класса.
    4.3.2 3 метода (Возведение в степень дробного положительного числа в целую степень, Модуль числа, Корень из числа).
    Данные методы должны ПЕРЕОПРЕДЕЛЯТЬ методы родительского класса и должны содержать в своём теле вызов библиотеки Math
    и возврат полученного результата .
4.4 Создать класс CalculatorWithMathExtendsMain в котором будет точка входа (main метод). В main методе требуется
создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в
консоль результат.
 */

public class CalculatorWithMathExtendsMain{
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithMathExtends value1 = new CalculatorWithMathExtends();
        CalculatorWithMathExtends value2 = new CalculatorWithMathExtends();
        CalculatorWithMathExtends value3 = new CalculatorWithMathExtends();
        CalculatorWithMathExtends value4 = new CalculatorWithMathExtends();
        CalculatorWithMathExtends sum = new CalculatorWithMathExtends();
        System.out.println("sum: " + sum.addition(value4.addition(4.1, value3.multiplication(15, 7)),(value2.power(value1.division(28, 5), 2))));
    }
}
