package HomeWork5;
/*
4. Реализовать интерфейс ISearchEngine:
	4.1 Написать класс EasySearch. Реализовать поиск используя метод indexOf из класса String. В данной реализации
запрещено использовать регулярные выражения в любом виде, для любых задач. Данный класс ищет слова с учётом регистра.
	4.2* Написать класс RegExSearch реализующий интерфейс ISearchEngine. Реализовать поиск при помощи класса Matcher.
Данный класс ищет слова с учётом регистра.
	4.3* Написать декоратор SearchEnginePunctuationNormalizer для ISearchEngine который будет удалять нежелательные
символы. Любые знаки препинания, лишние пробелы и например переводы строк.
	4.4* Написать декоратор для ISearchEngine который будет позволять искать данные без учёта регистра.
Более подробное описание задачи, для понимания чего я хочу:  Тут можно пойти на хитрость, данный класс может
просто приводить весь текст и передаваемое слово к нижнему регистру но тут возникает вопрос как данный класс
может помочь для RegExSearch. Класс RegExSearch в своей реализации использует регулярные выражения и в случае
с регулярными выражениями есть возможность указать свойство CASE_INSENSITIVE для выражение и оно и так станет
не чувствительно к регистру. Для того чтобы тут что-то оптимизировать можно воспользоваться оператором instanceof
и вычислить таки какого класса нам передали объект ISearchEngine. Данная практика является нежелательной но при
этом в некоторых случаях очень эффективной.
	4.5** Написать декоратор SearchEngineCaseNormalizer для ISearchEngine который будет приводит все слова к единому падежу.
Что позволит учитывать их как одинаковые слова. Например после работы данного класса текст "бабушка бабушке бабушку"
уже будет выдавать: "бабушка - 3". Падеж можно настроить при помощи конструктора.

5. Используя реализации интерфейса ISearchEngine вывести информацию как часто встречаются слова "война", "и" (как союз),
"мир" вне зависимости от регистра.
 */

public class EasySearch implements ISearchEngine{

//    public long search(String text, String word){
//        long index = text.indexOf(word);
//        return index;
//    }

    public long search(String text, String word){
        long count = 0;
        if (word.equalsIgnoreCase("и") == true){
            word = new String(" и ");
        }else if(word.equalsIgnoreCase("а") == true){
            word = new String(" а ");
        }else if(word.equalsIgnoreCase("о") == true){
            word = new String(" о ");
        }
        int index = text.toLowerCase().indexOf(word.toLowerCase());
        if (index < 0){
            return index;
        }
        ++count;

        while (index != -1){
            index = text.toLowerCase().indexOf(word.toLowerCase(), index + 1);
            ++count;
        }
        return count;
    }
}
