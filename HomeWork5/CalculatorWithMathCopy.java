package HomeWork5;

public class CalculatorWithMathCopy {

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
