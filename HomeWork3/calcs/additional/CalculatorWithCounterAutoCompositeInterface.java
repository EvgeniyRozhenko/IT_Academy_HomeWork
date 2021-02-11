package HomeWork3.calcs.additional;
/*
9. Создать класс CalculatorWithCounterAutoCompositeInterface.
	9.1 Внутри класса нельзя создавать объекты, можно пользоваться только тем что передал вам пользователь вашего класса.
	9.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	9.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
	9.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики другим калькуляторам
	переданным в конструктор
	9.5 В классе должны присутствовать все методы объявленные в интерфейсе.
	9.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного
	калькулятора. При вызове данного метода счётчик учёта не увеличивается.
	9.7 Создать класс CalculatorWithCounterAutoCompositeInterfaceMain в котором будет точка входа (main метод). В main
	методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из
	задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */
public class CalculatorWithCounterAutoCompositeInterface implements ICalculator{
    long countOperation;
    ICalculator calculator;

    public CalculatorWithCounterAutoCompositeInterface(ICalculator obj){
        this.calculator = obj;
    }

    void incrementCountOperation(){
        countOperation++;
    }

    public long getCountOperation(){
        return countOperation;
    }

    public double division (double a, double b){
        incrementCountOperation();
        return this.calculator.division(a, b);
    }

    public double multiplication (double a, double b){
        incrementCountOperation();
        return this.calculator.multiplication(a, b);
    }

    public double subtraction (double a, double b){
        incrementCountOperation();
        return this.calculator.subtraction(a, b);
    }

    public double addition (double a, double b){
        incrementCountOperation();
        return this.calculator.addition(a, b);
    }

    public double power(double value, int powValue) {
        incrementCountOperation();
        return this.calculator.power(value, powValue);
    }

    public int abs(int value) {
        incrementCountOperation();
        return this.calculator.abs(value);
    }

    public double root(double value, double i) {
        incrementCountOperation();
        return this.calculator.root(value, i);
    }
}
