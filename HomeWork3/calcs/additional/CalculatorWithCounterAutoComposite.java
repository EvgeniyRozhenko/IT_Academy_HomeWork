package HomeWork3.calcs.additional;
/*
7. Создать класс CalculatorWithCounterAutoComposite.
	7.1 Внутри класса нельзя создавать объекты, можно пользоваться только тем что передал вам пользователь вашего класса.
	7.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	7.3 В данном классе должны быть следующие варианты конструктора:
		7.3.1 Принимающий объект типа CalculatorWithOperator
		7.3.2 Принимающий объект типа CalculatorWithMathCopy
		7.3.3 Принимающий объект типа CalculatorWithMathExtends
	7.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики другим калькуляторам
	переданным в конструктор
	7.5 В классе должны присутствовать математические методы:
		7.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
		7.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
	7.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного
	калькулятора. При вызове данного метода счётчик учёта не увеличивается.
	7.7 Создать класс CalculatorWithCounterAutoCompositeMain в котором будет точка входа (main метод). В main методе
	требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
	Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    private CalculatorWithOperator object1;
    private CalculatorWithMathCopy object2;
    private CalculatorWithMathExtends object3;
    long countOperation;

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator obj) {
        this.object1 = obj;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy obj){
        this.object2 = obj;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends obj){
        this.object3 = obj;
    }


    void incrementCountOperation(){
        countOperation++;
    }

    public long getCountOperation(){
        return countOperation;
    }

    public double division (double a, double b){
        incrementCountOperation();
        if (object2 == null && object3 == null){
            return this.object1.division(a, b);
        }else if (object1 == null && object3 == null){
            return this.object2.division(a, b);
        }else{
            return this.object3.division(a, b);
        }
    }

    public double multiplication (double a, double b){
        incrementCountOperation();
        if (object2 == null && object3 == null){
            return this.object1.multiplication(a, b);
        }else if (object1 == null && object3 == null){
            return this.object2.multiplication(a, b);
        }else{
            return this.object3.multiplication(a, b);
        }
    }

    public double subtraction (double a, double b){
        incrementCountOperation();
        if (object2 == null && object3 == null){
            return this.object1.subtraction(a, b);
        }else if (object1 == null && object3 == null){
            return this.object2.subtraction(a, b);
        }else{
            return this.object3.subtraction(a, b);
        }
    }

    public double addition (double a, double b){
        incrementCountOperation();
        if (object2 == null && object3 == null){
            return this.object1.addition(a, b);
        }else if (object1 == null && object3 == null){
            return this.object2.addition(a, b);
        }else{
            return this.object3.addition(a, b);
        }
    }

    public double power(double value, int powValue) {
        incrementCountOperation();
        if (object2 == null && object3 == null){
            return this.object1.power(value, powValue);
        }else if (object1 == null && object3 == null){
            return this.object2.power(value, powValue);
        }else{
            return this.object3.power(value, powValue);
        }
    }

    public int abs(int value) {
        incrementCountOperation();
        if (object2 == null && object3 == null){
            return this.object1.abs(value);
        }else if (object1 == null && object3 == null){
            return this.object2.abs(value);
        }else{
            return this.object3.abs(value);
        }
    }

    public double root(double value, double i) {
        incrementCountOperation();
        if (object2 == null && object3 == null){
            return this.object1.root(value, i);
        }else if (object1 == null && object3 == null){
            return this.object2.root(value, i);
        }else{
            return this.object3.root(value, i);
        }
    }
}
