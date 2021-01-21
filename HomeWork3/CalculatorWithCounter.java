package HomeWork3;
/* Задание посложнее. Для того чтобы преступить к данному заданию необходимо выполнить все предыдущие:
5*. Создать класс CalculatorWithCounter.
5.1 Данный класс предназначен для того чтобы подсчитывать количество использований калькулятора, внутри класса
нельзя создавать объекты, можно пользоваться только тем что передал вам пользователь вашего класса.
5.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
5.3 Данный класс напрямую не умеет считать математику
5.4 В данном классе должены быть следующие варианты конструктора:
    5.4.1 Принимающий объект класса CalculatorWithOperator
    5.4.2 Принимаюший объект класса CalculatorWithMathCopy
    5.4.3 Принимающий объект класса CalculatorWithMathExtends
5.5 В классе должны присутствовать математические методы:
    5.5.1  4 базовых математических метода (деления, умножение, вычитание, сложение).
    5.5.2  3 метода (Возведение в степень дробного положительного числа в целую степень, Модуль числа, Корень из числа).
5.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного калькулятора.
5.7 Создать класс CalculatorWithCounterMain в котором будет точка входа (main метод). В main методе требуется создать
экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 */
public class CalculatorWithCounter {
    private int counter = 0;

    public CalculatorWithCounter(CalculatorWithOperator obj){
        CalculatorWithOperator object = obj;
    }
    public CalculatorWithCounter(CalculatorWithMathCopy obj){
        CalculatorWithCounter object = new CalculatorWithCounter(obj);
    }
    public CalculatorWithCounter(CalculatorWithMathExtends obj){
        CalculatorWithCounter object = new CalculatorWithCounter(obj);
    }


    public long getCountOperation() {
        return counter;
    }
//    public double division(double a, double b){
//        this.counter++;
//            CalculatorWithCounter
//    }
    public double multiplication (double a, double b){
        this.counter++;
        return a * b;
    }
    public double subtraction (double a, double b){
        this.counter++;
        return a - b;
    }
    public double addition (double a, double b){
        this.counter++;
        return a + b;
    }
    public double power (double value, int powValue){
        this.counter++;
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
        this.counter++;
        if (value < 0){
            return -value;
        }else {
            return value;
        }
    }
    public double root (double value, double i){
        this.counter++;
        if (i == 0){
            System.out.println("Ошибка! Степень не может быть нулевой.");
        }
        if (value < 0){
            value *= -1;
        }
        return Math.pow(value, 1/i);
    }
}
