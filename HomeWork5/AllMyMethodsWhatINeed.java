package HomeWork5;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AllMyMethodsWhatINeed {

    public static String[] getWordsFromBook(String str){
        List<String> newWordsContainer = new ArrayList<>();
        String[] words = str.split("\n");

        for (int i = 0; i < words.length; i++){
            String[] arr1 = words[i].split(" ");
            for (int j = 0; j < arr1.length; j++){
                if (arr1[j].equals("") || arr1[j].equals("--") || arr1[j].equals("-")){
                    continue;
                }
                String[] arr2 = arr1[j].split("\\b");
                for (int x = 0; x < arr2.length; x++){
                    if (arr2[x].equals(";")
                            || arr2[x].equals(":")
                            || arr2[x].equals(",")
                            || arr2[x].equals(".")
                            || arr2[x].equals("!")
                            || arr2[x].equals("?")
                            || arr2[x].equals("-")
                            || arr2[x].equals("\"")){
                        continue;
                    }
                    newWordsContainer.add(arr2[x]);
                }
            }
        }
        return newWordsContainer.toArray(new String[newWordsContainer.size()]);
    }

    public static int countOfWordForList(List<String> list,String word){
        int count = 0;
        for (int i = 0; i < list.size(); i++){
            if (word.equalsIgnoreCase(list.get(i)) == true){
                ++count;
            }
        }
        return count;
    }


    public static String readAllBytesFromText(String filePath){
        String content = "";

        try
        {
            content = new String (Files.readAllBytes(Paths.get(filePath)));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return content;
    }

}
