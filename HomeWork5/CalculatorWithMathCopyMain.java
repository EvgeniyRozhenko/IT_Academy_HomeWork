package HomeWork5;
/* 3. Создать класс CalculatorWithMathCopy.
3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
3.2 В классе должны присутствовать математические методы:
3.2.1 4 базовых математических метода (деления, умножение, вычитание, сложение). Скопировать базовые математические
операции из CalculatorWithOperator.
3.2.2 3 метода (Возведение в степень дробного положительного числа в целую степень, Модуль числа, Корень из числа).
Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
3.3 Создать класс CalculatorWithMathCopyMain в котором будет точка входа (main метод). В main методе требуется создать
экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 */
public class CalculatorWithMathCopyMain{
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithMathCopy value1 = new CalculatorWithMathCopy();
        CalculatorWithMathCopy value2 = new CalculatorWithMathCopy();
        CalculatorWithMathCopy value3 = new CalculatorWithMathCopy();
        CalculatorWithMathCopy value4 = new CalculatorWithMathCopy();
        CalculatorWithMathCopy sum = new CalculatorWithMathCopy();
        System.out.println("sum: " + sum.addition(value4.addition(4.1, value3.multiplication(15, 7)),(value2.power(value1.division(28, 5), 2))));
    }
}
