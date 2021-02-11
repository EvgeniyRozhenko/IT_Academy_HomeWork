package HomeWork3.calcs.additional;
/*
5. Создать класс CalculatorWithCounterClassic.
	5.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	5.2 Данный класс должен наследовать класс CalculatorWithMathExtends.
	5.3 В классе должен быть метод void incrementCountOperation() который должен увеличивать внутренний счётчик в калькуляторе.
	5.4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора.
	5.5 Создать класс CalculatorWithCounterClassicMain в котором будет точка входа (main метод). В main методе требуется
	создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в
	консоль результат.
 */

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long count;

    void incrementCountOperation(){
        count++;
    }

    public long getCountOperation(){
        return count;
    }

    @Override
    public double division (double a, double b){
        incrementCountOperation();
        if(b == 0) {
            System.out.println("Ошибка! Нельзя делить на ноль.");
        }
        return a / b;
    }

    @Override
    public double multiplication (double a, double b){
        incrementCountOperation();
        return a * b;
    }

    @Override
    public double subtraction (double a, double b){
        incrementCountOperation();
        return a - b;
    }

    @Override
    public double addition (double a, double b){
        incrementCountOperation();
        return a + b;
    }

    @Override
    public double power(double value, int powValue) {
        incrementCountOperation();
        if (value < 0){
            Math.abs(value);
        }
        return Math.pow(value, powValue);
    }

    @Override
    public int abs(int value) {
        incrementCountOperation();
        return Math.abs(value);
    }

    @Override
    public double root(double value, double i) {
        incrementCountOperation();
        if (i == 0){
            System.out.println("Ошибка! Степень не может быть нулевой.");
        }
        if (value < 0){
            Math.abs(value);
        }
        return Math.pow(value, 1/i);
    }

}
