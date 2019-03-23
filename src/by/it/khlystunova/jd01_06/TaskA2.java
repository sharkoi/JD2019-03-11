package by.it.khlystunova.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Определить, сколько раз повторяется в тексте каждое слово,
 которое встречается в нем, используя массивы.
 Вывести результаты на консоль в формате слово=повторы*/
public class TaskA2 {
    private  static String[] words = new String[0];
    private static int[] counters = new int[0];

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]+");//создали шаблон со ссылкой pattern
        Matcher matcher = pattern.matcher(Poem.text);//т.к у класса Matcher нет своего конструктора,создаем его через pattern.matcher(Последовательность символов для сопоставления).
        while(matcher.find()){//find находим начало слова удв. шаблону
            String word  = matcher.group();//group возвращает всю посдедовательность(слово целиком) удв. шаблону.
            
        }

    }




}
