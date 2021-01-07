package HomeWork8;

import java.security.SecureRandom;

public class RandomString {
    static String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz" + "АБВГДЕЁЖЗИКЛМНОПРСТУФХЦЧШЩЪЬЫЭЮЯ" + "абвгдеёжзиклмнопрстуфхцчшщъьыэюя" + ' ';
    static SecureRandom random = new SecureRandom();


    public static String random(int stringLength){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringLength; i++){
            sb.append(alphabets.charAt(random.nextInt(alphabets.length())));
        }
        return sb.toString();
    }
}
