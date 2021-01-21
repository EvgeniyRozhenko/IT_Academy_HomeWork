package HomeWork3;

public class CalculatorWithMathExtends extends CalculatorWithOperator{
    @Override
    public double power(double value, int powValue) {
        if (value < 0){
            Math.abs(value);
        }
        return Math.pow(value, powValue);
    }

    @Override
    public int abs(int value) {
        return abs(value);
    }

    @Override
    public double root(double value, double i) {
        if (i == 0){
            System.out.println("Ошибка! Степень не может быть нулевой.");
        }
        if (value < 0){
            Math.abs(value);
        }
        return Math.pow(value, 1/i);
    }
}
