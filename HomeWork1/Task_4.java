package HomeWork1;
/* 4.* Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методом main. (Взято с https://codingbat.com/prob/p187868).
	4.1 Данный метод будет принимает два параметра
	4.2 Будет отвечать на вопрос спать ли дальше (возвращать true либо false).
	4.3 Первый параметр boolean weekday обозначает рабочий день
	4.4 Второй параметр boolean vacation обозначает отпуск.
	4.5 Если у нас отпуск или не рабочий день то мы можем спать дальше
	4.6 На основании ответа от метода sleepIn вывести сообщение можем спать дальше или пора идти на работу
 */
public class Task_4 {
    public static boolean sleepIn(boolean weekday, boolean vacation){
        boolean w = weekday;
        boolean v = vacation;
        if (w == false && v == true){ // если у нас не рабочий день и отпуск, то = можем спать
            return true;
        }else if (w == false && v == false){ // если у нас не рабочий день и не отпуск, то у нас выходной = можем спать
            return true;
        }else if (w == true && v == true){ // если у нас рабочий день, но у нас отпуск = можем спать
            return true;
        }else { // у нас и рабочий день и нет отпуска = не спим
            return false;
        }
    }
    public static void main(String[] args) {
        boolean sleepOrWork = sleepIn(true,false);
        if (sleepOrWork == true){
            System.out.println("можем спать дальше");
        }else {
            System.out.println("пора идти на работу");
        }
    }
}
