package by.it.narushevich.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {

    private static String[] words=new String[0];
    private static int[] counters = new int[0];

    public static void main(String[] args) {
        Pattern pattern =Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher = pattern.matcher(Poem.text);
        while(matcher.find()){
            String word = matcher.group();
            process(word);
        }

    }

    private static void process(String word) {
    }
}
