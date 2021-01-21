package HomeWork1;
/* 6.* Создать СТАТИЧЕСКИЙ метод createPhoneNumber рядом с методом main, данный метод будет принимает один параметр
и будет возвращать строку в отформатированном виде. В метод будет передаваться массив из 10 цифр (от 0 до 9). Данные
цифры должны быть помещены в строку формата: (XXX) XXX-XXXX. Например передан массив: {1,2,3,4,5,6,7,8,9,0},
возвращаемый результат: (123) 456-7890. (Взято с https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java).
В задании нельзя использовать колекции, стрима.
 */
public class Task_6 {
    public static String createPhoneNumber(int[] arr){
        if (arr.length > 10){
            return "Вы ввели больше 10 цифр номера телефона";
        }else if (arr.length < 10) {
            return "Вы ввели меньше 10 цифр номера телефона";
        }else{
            StringBuilder strNumber = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                if (i == 0){
                    strNumber.append('(');
                    strNumber.append(arr[i]);
                }else if (i == 3){
                    strNumber.append(") ");
                    strNumber.append(arr[i]);
                }else if (i == 6){
                    strNumber.append('-');
                    strNumber.append(arr[i]);
                }else
                    strNumber.append(arr[i]);
            }
            return strNumber.toString();
        }
    }
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11}));
    }
}
