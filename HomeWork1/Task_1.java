package HomeWork1;

/* 1. Побитовые операции:
 1.1. http://developer.alexanderklimov.ru/android/java/bitwise.php
 1.2 Использовать ВСЕ возможные побитовые операции с числами 42 и 15.
 1.3 Использовать ВСЕ возможные побитовые операции с числами -42 и -15.
 1.4 В комментариях к каждой операции написать двоичный код каждого числа и результата операции.
 1.5 Попробуйте сделать побитовую операцию с числова 42.5
 */

public class Task_1 {
    public static void main(String[] args) {
        int x = 42, y = 15;
        int a = -42, b = -15;
        double z = 42.5; // Побитовые операции в Java можно проводить только над целочисленными типами данных.
                        // То есть long, int, short, char, byte.

        System.out.println("Бит-число x" + " " + Integer.toBinaryString(x)); //Бит-число x 101010
        System.out.println("Бит-число ~x" + " " + Integer.toBinaryString(~x)); //Бит-число ~x 11111111111111111111111111010101
        System.out.println(~x); //-43
//        System.out.println("Бит-число x" + " " + Integer.toBinaryString(z));
        System.out.println(" ");
        System.out.println("Бит-число y" + " " + Integer.toBinaryString(y)); //Бит-число y 1111
        System.out.println("Бит-число ~y" + " " + Integer.toBinaryString(~y)); //Бит-число ~y 11111111111111111111111111110000
        System.out.println(~y); //-16
        System.out.println(" ");
        System.out.println("Бит-число x&y" + " " + Integer.toBinaryString(x&y)); //Бит-число x&y 1010
        System.out.println(x&y); //10
        System.out.println(" ");
        System.out.println("Бит-число x|y" + " " + Integer.toBinaryString(x|y)); //Бит-число x|y 101111
        System.out.println(x|y); //47
        System.out.println(" ");
        System.out.println("Бит-число x^y" + " " + Integer.toBinaryString(x^y)); //Бит-число x^y 100101
        System.out.println(x^y); //37
        System.out.println(" ");
        System.out.println("Бит-число x>>y" + " " + Integer.toBinaryString(x>>y)); //Бит-число x>>y 0
        System.out.println(x>>y); //0
        System.out.println(" ");
        System.out.println("Бит-число x>>>y" + " " + Integer.toBinaryString(x>>>y)); //Бит-число x>>>y 0
        System.out.println(x>>>y); //0
        System.out.println(" ");
        System.out.println("Бит-число x<<y" + " " + Integer.toBinaryString(x<<y)); //Бит-число x<<y 101010000000000000000
        System.out.println(x<<y); //1376256
        System.out.println(" ");
        System.out.println("Бит-число x&=y" + " " + Integer.toBinaryString(x&=y)); //Бит-число x&=y 1010
        System.out.println(x&=y); //10
        System.out.println(" ");
        System.out.println("Бит-число x|=y" + " " + Integer.toBinaryString(x|=y)); //Бит-число x|=y 1111
        System.out.println(x|=y); //15
        System.out.println(" ");
        System.out.println("Бит-число x^=y" + " " + Integer.toBinaryString(x^=y)); //Бит-число x^=y 0
        System.out.println(x^=y); //15
        System.out.println(" ");
        System.out.println("Бит-число x>>=y" + " " + Integer.toBinaryString(x>>=y)); //Бит-число x>>=y 0
        System.out.println(x>>=y); //0
        System.out.println(" ");
        System.out.println("Бит-число x<<=y" + " " + Integer.toBinaryString(x<<=y)); //Бит-число x<<=y 0
        System.out.println(x<<=y); //0
        System.out.println(" ");
        System.out.println("Бит-число x>>>=y" + " " + Integer.toBinaryString(x>>>=y)); //Бит-число x>>>=y 0
        System.out.println(x>>>=y); //0
        System.out.println(" ");

        System.out.println("Теперь с отрицательными значениями");
        System.out.println("Бит-число a" + " " + Integer.toBinaryString(a)); //Бит-число a 11111111111111111111111111010110
        System.out.println("Бит-число ~a" + " " + Integer.toBinaryString(~a)); //Бит-число ~a 101001
        System.out.println(~a); //41
        System.out.println(" ");
        System.out.println("Бит-число b" + " " + Integer.toBinaryString(b)); //Бит-число b 11111111111111111111111111110001
        System.out.println("Бит-число ~b" + " " + Integer.toBinaryString(~b)); //Бит-число ~b 1110
        System.out.println(~b); //14
        System.out.println(" ");
        System.out.println("Бит-число a&b" + " " + Integer.toBinaryString(a&b)); //Бит-число a&b 11111111111111111111111111010000
        System.out.println(a&b); //-48
        System.out.println(" ");
        System.out.println("Бит-число a|b" + " " + Integer.toBinaryString(a|b)); //Бит-число a|b 11111111111111111111111111110111
        System.out.println(a|b); //-9
        System.out.println(" ");
        System.out.println("Бит-число a^b" + " " + Integer.toBinaryString(a^b)); //Бит-число a^b 100111
        System.out.println(a^b); //39
        System.out.println(" ");
        System.out.println("Бит-число a>>b" + " " + Integer.toBinaryString(a>>b)); //Бит-число a>>b 11111111111111111111111111111111
        System.out.println(a>>b); //-1
        System.out.println(" ");
        System.out.println("Бит-число a>>>b" + " " + Integer.toBinaryString(a>>>b)); //Бит-число a>>>b 111111111111111
        System.out.println(a>>>b); //32767
        System.out.println(" ");
        System.out.println("Бит-число a<<b" + " " + Integer.toBinaryString(a<<b)); //Бит-число a<<b 11111111101011000000000000000000
        System.out.println(a<<b); //-5505024
        System.out.println(" ");
        System.out.println("Бит-число a&=b" + " " + Integer.toBinaryString(a&=b)); //Бит-число a&=b 11111111111111111111111111010000
        System.out.println(a&=b); //-48
        System.out.println(" ");
        System.out.println("Бит-число a|=b" + " " + Integer.toBinaryString(a|=b)); //Бит-число a|=b 11111111111111111111111111110001
        System.out.println(a|=b); //-15
        System.out.println(" ");
        System.out.println("Бит-число a^=b" + " " + Integer.toBinaryString(a^=b)); //Бит-число a^=b 0
        System.out.println(a^=b); //-15
        System.out.println(" ");
        System.out.println("Бит-число a>>=b" + " " + Integer.toBinaryString(a>>=b)); //Бит-число a>>=b 11111111111111111111111111111111
        System.out.println(a>>=b); //-1
        System.out.println(" ");
        System.out.println("Бит-число a<<=b" + " " + Integer.toBinaryString(a<<=b)); //Бит-число a<<=b 11111111111111100000000000000000
        System.out.println(a<<=b); //0
        System.out.println(" ");
        System.out.println("Бит-число a>>>=b" + " " + Integer.toBinaryString(a>>>=b)); //Бит-число a>>>=b 0
        System.out.println(a>>>=b); //0
    }
}
