package HomeWork1;

/*0. Создать папку HomeWork1 и в ней выполнять данное ДЗ
1. Побитовые операции:
 1.1. http://developer.alexanderklimov.ru/android/java/bitwise.php
 1.2 Использовать ВСЕ возможные побитовые операции с числами 42 и 15.
 1.3 Использовать ВСЕ возможные побитовые операции с числами -42 и -15.
 1.4 В комментариях к каждой операции написать двоичный код каждого числа и результата операции.*/

public class Task_1 {
    public static void main(String[] args) {
        int x = 42, y = 15;
        int a = -42, b = -15;

        System.out.println("Бит-число x" + " " + Integer.toBinaryString(x));
        System.out.println("Бит-число ~x" + " " + Integer.toBinaryString(~x));
        System.out.println(~x);
        System.out.println(" ");
        System.out.println("Бит-число y" + " " + Integer.toBinaryString(y));
        System.out.println("Бит-число ~y" + " " + Integer.toBinaryString(~y));
        System.out.println(~y);
        System.out.println(" ");
        System.out.println("Бит-число x&y" + " " + Integer.toBinaryString(x&y));
        System.out.println(x&y);
        System.out.println(" ");
        System.out.println("Бит-число x|y" + " " + Integer.toBinaryString(x|y));
        System.out.println(x|y);
        System.out.println(" ");
        System.out.println("Бит-число x^y" + " " + Integer.toBinaryString(x^y));
        System.out.println(x^y);
        System.out.println(" ");
        System.out.println("Бит-число x>>y" + " " + Integer.toBinaryString(x>>y));
        System.out.println(x>>y);
        System.out.println(" ");
        System.out.println("Бит-число x>>>y" + " " + Integer.toBinaryString(x>>>y));
        System.out.println(x>>>y);
        System.out.println(" ");
        System.out.println("Бит-число x<<y" + " " + Integer.toBinaryString(x<<y));
        System.out.println(x<<y);
        System.out.println("Бит-число x&=y" + " " + Integer.toBinaryString(x&=y));
        System.out.println(x&=y);
        System.out.println(" ");
        System.out.println("Бит-число x|=y" + " " + Integer.toBinaryString(x|=y));
        System.out.println(x|=y);
        System.out.println(" ");
        System.out.println("Бит-число x^=y" + " " + Integer.toBinaryString(x^=y));
        System.out.println(x^=y);
        System.out.println(" ");
        System.out.println("Бит-число x>>=y" + " " + Integer.toBinaryString(x>>=y));
        System.out.println(x>>=y);
        System.out.println(" ");
        System.out.println("Бит-число x<<=y" + " " + Integer.toBinaryString(x<<=y));
        System.out.println(x<<=y);
        System.out.println(" ");
        System.out.println("Бит-число x>>>=y" + " " + Integer.toBinaryString(x>>>=y));
        System.out.println(x>>>=y);

        System.out.println("Бит-число a" + " " + Integer.toBinaryString(a));
        System.out.println("Бит-число ~a" + " " + Integer.toBinaryString(~a));
        System.out.println(~a);
        System.out.println(" ");
        System.out.println("Бит-число b" + " " + Integer.toBinaryString(b));
        System.out.println("Бит-число ~b" + " " + Integer.toBinaryString(~b));
        System.out.println(~b);
        System.out.println(" ");
        System.out.println("Бит-число a&b" + " " + Integer.toBinaryString(a&b));
        System.out.println(a&b);
        System.out.println(" ");
        System.out.println("Бит-число a|b" + " " + Integer.toBinaryString(a|b));
        System.out.println(a|b);
        System.out.println(" ");
        System.out.println("Бит-число a^b" + " " + Integer.toBinaryString(a^b));
        System.out.println(a^b);
        System.out.println(" ");
        System.out.println("Бит-число a>>b" + " " + Integer.toBinaryString(a>>b));
        System.out.println(a>>b);
        System.out.println(" ");
        System.out.println("Бит-число a>>>b" + " " + Integer.toBinaryString(a>>>b));
        System.out.println(a>>>b);
        System.out.println(" ");
        System.out.println("Бит-число a<<b" + " " + Integer.toBinaryString(a<<b));
        System.out.println(a<<b);
        System.out.println(" ");
        System.out.println("Бит-число a&=b" + " " + Integer.toBinaryString(a&=b));
        System.out.println(a&=b);
        System.out.println(" ");
        System.out.println("Бит-число a|=b" + " " + Integer.toBinaryString(a|=b));
        System.out.println(a|=b);
        System.out.println(" ");
        System.out.println("Бит-число a^=b" + " " + Integer.toBinaryString(a^=b));
        System.out.println(a^=b);
        System.out.println(" ");
        System.out.println("Бит-число a>>=b" + " " + Integer.toBinaryString(a>>=b));
        System.out.println(a>>=b);
        System.out.println(" ");
        System.out.println("Бит-число a<<=b" + " " + Integer.toBinaryString(a<<=b));
        System.out.println(a<<=b);
        System.out.println(" ");
        System.out.println("Бит-число a>>>=b" + " " + Integer.toBinaryString(a>>>=b));
        System.out.println(a>>>=b);
    }
}
