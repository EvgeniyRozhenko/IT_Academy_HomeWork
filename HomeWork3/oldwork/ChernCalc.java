package HomeWork3.oldwork;

import java.util.Objects;

public class ChernCalc {
    public static void main (String[]args){
        int a = 2_147_483_647;
        int b = 1;
        int f = a+b;
        long x = a+1;
        long y = a+(long)b;
        long z = a+1L;
        System.out.println(f);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

//        int i =17;
//        while(i<=28){
//            if (i%13==0){
//                break;
//            }
//            i++;
//        }
//        System.out.println("First num is: "+i);
//        printFirstFiveNums(9);
    }


    public static void printFirstFiveNums(int count){
        for (int i =1; i<=count; i++){
            System.out.println(i);
            if (i==5) return;
        }
    }
}
