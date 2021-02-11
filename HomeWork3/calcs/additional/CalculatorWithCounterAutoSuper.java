package HomeWork3.calcs.additional;
/*
6. Создать класс CalculatorWithCounterAutoSuper.
	6.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
	6.2 Данный класс наследует класс CalculatorWithMathExtends.
	6.5 Данный класс переопределяет все методы полученные в результате наследования и в этих методах должен быть
	реализован механизм учёта их использования (учёт общий для всех методов класса), а вместо реализации математики при
	помощи ключевого слова super вызывает данный метод у родителя. Например вызвали метод plus(7, 3) который должен
	сложить два числа и вернуть результат сложения. Внутри метода plus() пишем реализацию учета, а после делаем вызов
	super.plus(7, 3). Использование super позволит вызвать реализацию из родительского класса.
	6.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного
	калькулятора. При вызове данного метода счётчик учёта не увеличивается.
	6.7 Создать класс CalculatorWithCounterAutoSuperMain в котором будет точка входа (main метод). В main методе
	требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
	Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
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
        return super.division(a, b);
    }

    @Override
    public double multiplication (double a, double b){
        incrementCountOperation();
        return super.multiplication(a,b);
    }

    @Override
    public double subtraction (double a, double b){
        incrementCountOperation();
        return super.subtraction(a,b);
    }

    @Override
    public double addition (double a, double b){
        incrementCountOperation();
        return super.addition(a,b);
    }

    @Override
    public double power(double value, int powValue) {
        incrementCountOperation();
        return super.power(value,powValue);
    }

    @Override
    public int abs(int value) {
        incrementCountOperation();
        return super.abs(value);
    }

    @Override
    public double root(double value, double i) {
        incrementCountOperation();
        return super.root(value,i);
    }
}
