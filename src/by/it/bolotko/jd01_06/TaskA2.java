package by.it.bolotko.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {

    private static String[] words=new String[0];
    private static int[] counters=new int[0];

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(Poem.text);
        Pattern pattern=Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher = pattern.matcher(sb);
        while (matcher.find()){
            String world=matcher.group();
            process(world);
        }
    }

    private static void process(String word){
        for (int i = 0; i <words.length; i++) {
            if (words[i].equals(word))
                counters[i]++;
            return;
        }

        words= Arrays.copyOf(words, words.length+1);
        words [words.length-1]=word;

        counters=Arrays.copyOf(counters, counters.length+1);
        counters[words.length-1]=1;
    }

}
