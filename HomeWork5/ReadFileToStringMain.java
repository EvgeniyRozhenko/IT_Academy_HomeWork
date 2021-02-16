package HomeWork5;

import java.util.*;

/*
2. Работа с коллекциями:
    2.1 Найти в тексте все использованные слова и поместить их в коллекцию Set.
Более подробное описание задачи, для понимания чего я хочу: Для решения данной задачи необходимо прочитать
текстовый файл и поместить текст из данного текстового файла в строку. Далее данную строку необходимо обработать таким
образом чтобы из неё можно было бы считывать слова. Далее каждое полученное слово поместить в Set. Благодаря возможностям
Set'ов в итоге мы получим коллекцию содержащую набор слов который был использован при написании данного текста. В конце
выводим в консоль количество использованных слов.
    2.2 Найти в тексте топ N (настраиваемое значение) слов и вывести количество этих слов используя Map и List.
Отсортировать по количеству. Распечатать в консоль.
Пример: Война - 200 раз, Мир - 100 раз и так далее. Знаки препинания, пробелы и переводы строк - это не слова.
Более подробное описание задачи, для понимания чего я хочу: Для решения данной задачи необходимо прочитать текстовый
файл  и поместить текст из данного текстового файла в строку.  Далее данную строку необходимо обработать таким образом
чтобы из неё можно было бы считывать слова. Далее каждое полученное слово поместить как ключ в Map, а количество
повторений в тексте ставить как значение. Для того чтобы это работало вам необходимо постоянно проверять наличие ключа
в Map, и если нужный нам ключ уже присутсвует в нашей коллекции то мы должны увеличить уже имеющееся значение в коллекции
на еденицу. После наполнения данной коллекции мы получим набор слов и их количество в тексте. Далее нам нужно придумать
как отсортировать получившуюся коллекцию но к сожалению непосредственно эту коллекцию отсортировать не получится, придётся
создавать для этого List и наполнять лист Entry из Map. В итоге из получившегося отсортированного набора данных вывести
первые N записей.

5. Используя реализации интерфейса ISearchEngine вывести информацию как часто встречаются слова "война", "и" (как союз),
"мир" вне зависимости от регистра.
 */
public class ReadFileToStringMain {

    public static void main(String[] args) {
        String filePath = "d:/IT_Academy/HomeWork/src/HomeWork5/Война и мир_книга.txt";
        String stringFromBook = AllMyMethodsWhatINeed.readAllBytesFromText(filePath);
        stringFromBook = stringFromBook.replaceAll("\\d", " ");
        Set <String> exclusiveWords = new HashSet<>();
        List<String> listOfWords = new ArrayList<>(200_000);
        Map<String, Integer> mapOfWords = new HashMap<>();

        String[] words = AllMyMethodsWhatINeed.getWordsFromBook(stringFromBook);

        for (int i = 0; i < words.length; i++){
            listOfWords.add(words[i]);
            exclusiveWords.add(words[i]);
        }

        for (int j = 0; j < words.length; j++){
            int countForMap = 0;

            for (int x = 0; x < mapOfWords.size(); x++){
                if (!mapOfWords.containsKey(words[j])){
                    mapOfWords.put(words[j],countForMap);
                }else
                    ++countForMap;
            }
        }
        
        List<Integer> listForMapSort = new ArrayList<>(mapOfWords.values());
        Collections.sort(listForMapSort);

        for ()


        System.out.println("Размер коллекции Set: " + exclusiveWords.size());
        System.out.println("Кол-во слов Война: " + AllMyMethodsWhatINeed.countOfWordForList(listOfWords, "Война"));
        System.out.println("Кол-во слов Мир: " + AllMyMethodsWhatINeed.countOfWordForList(listOfWords, "Мир"));

        EasySearch obj = new EasySearch();
        System.out.println("Кол-во слов Война в тексте через метод search: " + obj.search(stringFromBook, "Война"));
        System.out.println("Кол-во слов И в тексте через метод search: " + obj.search(stringFromBook, "И"));
        System.out.println("Кол-во слов Мир в тексте через метод search: " + obj.search(stringFromBook, "Мир"));
    }
}
