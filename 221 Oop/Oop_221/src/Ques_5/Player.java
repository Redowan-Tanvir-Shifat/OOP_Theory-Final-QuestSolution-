package Ques_5;

import java.util.ArrayList;
import java.util.Collections;

public class Player implements Comparable<Player>{
    int jersey;
    String name, type;
    public Player(int jersey, String name, String type) {
        this.jersey = jersey;
        this.name = name;
        this.type = type;
    }
    public int compareTo(Player p) {
        if (this.jersey > p.jersey) return 1;
        else if (this.jersey < p.jersey) return -1;
        return  0;
    }
    public String toString() {
        return this.jersey + ", " + this.name + ", " + this.type;
    }
}
class comparator_main {
    public static void main(String[] args) {
        ArrayList<Player> al = new ArrayList<>();
        al.add(new Player(55, "Karim", "Bangladesh"));
        al.add(new Player(14, "Ponting", "Australia"));

        System.out.println("Befor Sorting: ");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i) + ", ");
        }

        Collections.sort(al);
        System.out.println("After sorting");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i) + ", ");
        }
    }
}
