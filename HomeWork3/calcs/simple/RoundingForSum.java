package HomeWork3.calcs.simple;

public class RoundingForSum {
    public static double rounding(double numb){
        numb *= 1000;
        int tmp = (int) Math.round(numb);
        return (double)tmp / 1000;
    }
}
