package HomeWork3;

public class CalculatorWithOperator {
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
