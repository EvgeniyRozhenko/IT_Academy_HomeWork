package HomeWork3.calcs.additional;
/*
8. Создать интерфейс ICalculator.
	8.1 В данном интерфейсе должны быть объявлены методы:
		8.1.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
		8.1.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
	8.2 На данный момент данный интерфейс вы должны прописать во всех классах калькуляторов созданных нами в пакетах
	calcs.simple
 */
public interface ICalculator {
    double division (double a, double b);
    double multiplication (double a, double b);
    double subtraction (double a, double b);
    double addition (double a, double b);
    double power(double value, int powValue);
    int abs(int value);
    double root(double value, double i);
}
