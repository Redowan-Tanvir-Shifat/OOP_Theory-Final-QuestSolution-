package Ques_2a;

import java.io.*;

public class File_System {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/in.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));

            String line = "";
            int count = 0;
            while ((line = br.readLine()) != null) {
                bw.write(line + "\n");
                count++;
            }
            bw.write(String.valueOf(count));
            br.close();
            bw.close();
            System.out.println("Success");
            System.out.println("Number of line: " + count);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
