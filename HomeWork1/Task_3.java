package HomeWork1;

/* 3. Используя статью https://metanit.com/java/tutorial/2.9.php запросить у пользователя его имя.
Если имя будет равно имени Вася тогда в консоль должно вывести сообщение "Привет!" на одной строке,
а на второй "Я тебя так долго ждал". Если имя будет равно имени "Анастасия" тогда в консоль должно
вывести сообщени "Я тебя так долго ждал".
В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".
Написать ТРИ ОТДЕЛЬНЫХ решения при помощи if, else if, switch.
В примерах if и else if для сравнения имё использовать код на подобии Objects.equals("Имя1", "Имя2");
 */

import java.util.Objects;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите имя:");
        String userName1 = scanner1.nextLine();
        if (Objects.equals(userName1, "Вася")) {
            System.out.println("Привет!\n" + "Я тебя так долго ждал!");
        }
        if (Objects.equals(userName1, "Анастасия")) {
            System.out.println("Я так долго тебя ждал!");
        }
        if (!Objects.equals(userName1, "Вася") && !Objects.equals(userName1, "Анастасия")) {
            System.out.println("Добрый день, а вы кто?");
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите имя:");
        String userName2 = scanner2.nextLine();
        if (Objects.equals(userName2, "Вася")) {
            System.out.println("Привет! \n" + "Я так долго тебя ждал!");
        } else if (Objects.equals(userName2, "Анастасия")){
            System.out.println("Я так долго тебя ждал!");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите имя:");
        String userName3 = scanner3.nextLine();
        switch (userName3){
            case "Вася": {
                System.out.println("Привет! \n" + "Я так долго тебя ждал!");
                break;
            }
            case "Анастасия": {
                System.out.println("Я так долго тебя ждал!");
                break;
            }
            default: {
                System.out.println("Добрый день, а вы кто?");
                break;
            }
        }
    }
}
