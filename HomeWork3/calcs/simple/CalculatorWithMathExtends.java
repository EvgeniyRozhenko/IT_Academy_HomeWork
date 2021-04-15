package HomeWork3.calcs.simple;
/*
4. Создать класс CalculatorWithMathExtends.
	4.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	4.2 Данный класс должен наследовать класс CalculatorWithOperator.
	4.3 В классе должны присутствовать
		4.3.1 4 базовых математических метода (деление, умножение, вычитание, сложение) НЕ ДОЛЖНЫ быть объявлены в классе,
		а должны быть унаследованы от родительского класса.
		4.3.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа). Данные
		методы должны ПЕРЕОПРЕДЕЛЯТЬ методы родительского класса и должны содержать в своём теле вызов библиотеки Math и
		возврат полученного результата .
	4.4 Создать класс CalculatorWithMathExtendsMain в котором будет точка входа (main метод). В main методе требуется
	создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в
	консоль результат.
 */


public class CalculatorWithMathExtends extends CalculatorWithOperator {
    @Override
    public double power(double value, int powValue) {
        if (value < 0){
            value = Math.abs(value);
        }
        return Math.pow(value, powValue);
    }

    @Override
    public int abs(int value) {
        return Math.abs(value);
    }

    @Override
    public double root(double value, double i) {
        if (i == 0){
            System.out.println("Ошибка! Степень не может быть нулевой.");
        }
        if (value < 0){
            value = Math.abs(value);
        }
        return Math.pow(value, 1/i);
    }
}
