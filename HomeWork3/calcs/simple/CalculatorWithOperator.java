package HomeWork3.calcs.simple;

import HomeWork3.calcs.additional.ICalculator;

/*
2. Создать класс CalculatorWithOperator.
	2.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	2.2 В классе должны присутствовать математические методы:
		2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение) каждый из этих методов должен
		принимать два параметра (определитесь с их типами) и должны возвращать результат (определиться с возвращаемым
		типом результата) при помощи ключевого слово return.
		2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
	2.3 В методах можно использовать любые арифметические операторы.
	2.4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня). Если у Вас плохо с математикой, то для
	реализации метода "Корень из числа" можно воспользоваться библиотекой Math.
	2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод). В main методе требуется
	создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в
	консоль результат.
 */
public class CalculatorWithOperator implements ICalculator {
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
        double result = 1;
        if (value < 0){
            value *= -1;
        }
        for (int i = 0; i < powValue; i++){
            result *= value;
        }
        return result;
    }

    public int abs (int value){
        if (value < 0){
            return -value;
        }else {
            return value;
        }
    }

    public double root (double value, double i){
        if (i == 0){
            System.out.println("Ошибка! Степень не может быть нулевой.");
        }
        if (value < 0){
            value *= -1;
        }
        return Math.pow(value, 1/i);
    }
}
