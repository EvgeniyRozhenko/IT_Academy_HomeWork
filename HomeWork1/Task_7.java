package HomeWork1;
/* 7.** Создать СТАТИЧЕСКИЙ метод String toBinaryString(byte number) и возвращает двоичное представление числа. В методе можно использовать обычную математику которая описана в теории. Теория https://planetcalc.ru/747. Если число отрицательное то выдавать дополнительный код. Пример:
	7.1 Вводим: 42.  Возвращает: 00101010
	7.2 Вводим: 15.  Возвращает: 00001111
	7.3 Вводим: -42. Возвращает: 11010110
	7.4 Вводим: -15. Возвращает: 11110001
 */ // я еще разбираюсь с этим заданием
public class Task_7 {
    public static String toBinaryString(byte number){
        String currentBinary = Integer.toBinaryString(number);
        if (number>=0) {
            return String.format("%8s", Integer.toBinaryString(number)).replace(' ', '0');
        }else{
            return currentBinary.substring(currentBinary.length() - 8);
        }
    }

    public static void main(String[] args) {

        System.out.println(toBinaryString((byte) 42));
        System.out.println(toBinaryString((byte) 15));
        System.out.println(toBinaryString((byte) -42));
        System.out.println(toBinaryString((byte) -15));
        System.out.println("");
        System.out.println(toBinaryString((byte) -123));
        System.out.println(toBinaryString((byte) -25));
        System.out.println(toBinaryString((byte) 128));
        System.out.println(toBinaryString((byte) 0));
        // я еще разбираюсь с этим заданием
    }
}
