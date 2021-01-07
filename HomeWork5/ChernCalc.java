package HomeWork5;

public class ChernCalc {
    public static void main (String[]args){
        int i =17;
        while(i<=28){
            if (i%13==0){
                break;
            }
            i++;
        }
        System.out.println("First num is: "+i);
        printFirstFiveNums(9);
    }


    public static void printFirstFiveNums(int count){
        for (int i =1; i<=count; i++){
            System.out.println(i);
            if (i==5) return;
        }
    }
}
