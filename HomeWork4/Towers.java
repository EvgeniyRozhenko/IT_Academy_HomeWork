package HomeWork4;
import java.util.Scanner;

/*1. Дать возможность указать количество колец, минимальное 3
2. Есть два режима игры:
2.1 Ручной. В данном режиме пользователь указывает какой элемент и куда он передвигает
2.2* Автоматический. Пользователь наблюдает за каждым шагом самостоятельной игры компьютера
3. Стартовое поле выглядит следующим образом:
1**
2**
3**
Где цифра - это кольцо определённого размера, * - это пустое место на стержне
 */
public class Towers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Добро пожаловать в Ханойские Башни! Введите кол-во колец для игры: от 3-х до 5-ти.");
        int ringsNum = input.nextInt();
        int pillars = 3;
        int[][] towers = new int[ringsNum][pillars];

        if (ringsNum < 3 || ringsNum > 5) {
            System.out.println("Нужно было ввести от 3-х до 5-ти. Запустите программу заново.");
            return;
        }
        for (int i = 0; i < towers.length; i++) {
            towers[i][0] = i + 1;
        }

        printTowers(towers);


        while (!checkEndGame(towers)){
            int operation = getNextOper();
            if (operation == 7){
                System.out.println("Нам очень жаль, что вы решили выйти :-(");
                break;
            }
            int[] indexes = getIndexForOper(operation);
            movingOper(indexes [0], indexes [1], towers);
            printTowers(towers);
        }
    }

    /**
     * Печать игрового поля в консоль
     * @param towers - игровое поле (башни)
     */
    public static void printTowers(int [][] towers){
        for (int i = 0; i < towers.length; i++) {
            for (int j = 0; j < towers[i].length; j++) {
                int value = towers [i][j];
                if (value == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Перемещение кольца со столпа на столп
     * @param from индекс откуда перемещаем
     * @param to индекс куда перемещаем
     * @param towers игровое поле (башни)
     */
    public static void movingOper(int from, int to, int[][] towers) {
        if (from < 0 || to < 0) {
            System.out.println("Вы ввели неизвестный номер операции");
            return;
         }

        // Итерируем ячейки необходимого столпа.
        for (int i = 0; i < towers.length; i++) {
            int fromValue = towers[i][from];
            if (fromValue != 0) {
                for (int j = 0; j < towers.length; j++) {
                    int toValue = towers [j][to];
                    if (j == 0 && toValue != 0) {
                        System.out.println("Столп " + to + " переполнен");
                        continue;
                    } else if (toValue < fromValue && toValue != 0) {
                        System.out.println("Со столпа " + (from + 1) + " на столп " + (to + 1) + " нельзя переместить кольцо");
                        continue;
                    } else if (toValue > fromValue) {
                        towers[i][from] = 0;
                        towers [j-1][to] = fromValue;
                        break;
                    } else if (j + 1 == towers.length) {
                        towers[i][from] = 0;
                        towers[j][to] = fromValue;
                    }
                }
                break;
            }
        }
    }

    /**
     * Запрос пользователя на перемещение кольца
     * @return номер действия
     */
    public static int getNextOper() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите куда будем ходить:");
        System.out.println("1) 1 ->> 2");
        System.out.println("2) 1 ->> 3");
        System.out.println("3) 2 ->> 1");
        System.out.println("4) 2 ->> 3");
        System.out.println("5) 3 ->> 1");
        System.out.println("6) 3 ->> 2");
        System.out.println("7) Выйти из игры");

        return input.nextInt();
    }

    /**
     * Получить индексы со столпов с которых и на которые перемещаем кольца
     * @param operation номер действия пользователя
     * @return массив, 1 элемент откуда перемещаем, 2-й куда перемещаем
     */
    public static int[] getIndexForOper(int operation) {
        int from = -1;
        int to = -1;
        switch (operation) {
            case 1:
                from = 0;
                to = 1;
                break;
            case 2:
                from = 0;
                to = 2;
                break;
            case 3:
                from = 1;
                to = 0;
                break;
            case 4:
                from = 1;
                to = 2;
                break;
            case 5:
                from = 2;
                to = 0;
                break;
            case 6:
                from = 2;
                to = 1;
                break;
        }
        return new int[]{from, to};
    }

    /**
     * Проверяем закончена ли игра
     * @param towers иговое поле (башни)
     * @return true = закончена, false = нет
     */
    public static boolean checkEndGame(int[][] towers){
        for (int i = 0; i < towers.length; i++) {
            if (towers[i][towers[i].length-1] == 0) {
                return false;
            }
        }
        System.out.println("Game over!");
        return true;
    }
}
