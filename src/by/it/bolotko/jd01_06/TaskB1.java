package by.it.bolotko.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(Poem.text);
        Pattern allWords = Pattern.compile("[а-яА-ЯёЁ]+");
        Pattern sogl = Pattern.compile("[бвгджзйклмнпрстфхцчшщ]+");
        Pattern glasn = Pattern.compile("[аоиеёэыуюя]+");
        Matcher m = allWords.matcher(sb);
        while (m.find()) {
            String word=m.group();
        }
    }
}
