package Ques_5a;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    ArrayList<Character> ch = new ArrayList<>();
    public Arraylist(String str) {
        int i =0;
        while (i < str.length()) {
            ch.add(str.charAt(i));
            i++;
        }
        if (ch.size() > 2) {
            ch.set(2, 'z');
        }
        System.out.println(ch);
    }

    public static void main(String[] args) {
        new Arraylist("Redowan Tanvir Shifat");
    }
}
