package Ques_4c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedMap;

class Student implements Comparable<Student>{
    String name;
    double height;
    Student(String name, double height) {
        this.name = name;
        this.height = height;
    }
    public int compareTo(Student s) {
        if (this.height > s.height) return -1;
        if (this.height < s.height) return 1;
        return 0;
    }
    public String toString() {
        return this.name + ", " + this.height;
    }
}
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("Redowan", 180));
        al.add(new Student("Tanvir", 175));
        al.add(new Student("Shifat", 150));
        al.add(new Student("Nashrah", 140));
        al.add(new Student("Mehrin", 155));

        System.out.println("#Before Sorting: ");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i) + ", ");
        }
        Collections.sort(al);
        System.out.println();
        System.out.println("#After Sorting: ");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i) + ", ");
        }
    }
}
