package Ques_3a;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class File_System {
    static public int checkAge(FileReader file) throws IOException{
        int max = 0;
        BufferedReader br = new BufferedReader(file);
        String str = "";
        while ((str = br.readLine()) != null) {
            String[] parts = str.split("/");
            int age = Integer.parseInt(parts[1]);

            if (age > 0) {
                max = age;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        try {
            System.out.println(checkAge(new FileReader("person.txt")));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
