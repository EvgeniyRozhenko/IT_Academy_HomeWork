package HomeWork3.calcs.simple;

import HomeWork3.calcs.additional.ICalculator;

/*
3. Создать класс CalculatorWithMathCopy.
	3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	3.2 В классе должны присутствовать математические методы:
		3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение). Скопировать базовые математические
		операции из CalculatorWithOperator.
		3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа). Данные
		методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
	3.3 Создать класс CalculatorWithMathCopyMain в котором будет точка входа (main метод). В main методе требуется создать
	экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль
	результат.
 */
public class CalculatorWithMathCopy implements ICalculator {

    public double division (double a, double b){
        if(b == 0) {
            System.out.println("Ошибка! Нельзя делить на ноль.");
        }
        return a / b;
    }

    public double multiplication (double a, double b){
        return a * b;
    }

    public double subtraction (double a, double b){
        return a - b;
    }

    public double addition (double a, double b){
        return a + b;
    }

    public double power (double value, int powValue){
        if (value < 0){
            Math.abs(value);
        }
        return Math.pow(value, powValue);
    }

    public int abs (int value){
        return Math.abs(value);
    }

    public double root (double value, double i){
        if (i == 0){
            System.out.println("Ошибка! Степень не может быть нулевой.");
        }
        if (value < 0){
            Math.abs(value);
        }
        return Math.pow(value, 1/i);
    }
}
