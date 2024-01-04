package Ques_2;

import java.io.*;

public class File_System {
    public static void main(String[] args) {
      try {
          BufferedReader br = new BufferedReader(new FileReader("id.txt"));
          BufferedWriter odd = new BufferedWriter(new FileWriter("odd.txt"));
          BufferedWriter even = new BufferedWriter(new FileWriter("even.txt"));
          String line  = "";
          while ((line = br.readLine()) != null) {
              int ID = Integer.parseInt(line);
              if (ID % 2 == 0) {
                  even.write(line + "\n");
              } else {
                  odd.write(line + "\n");
              }
          }
          br.close();
          even.close();
          odd.close();

      }catch (IOException e) {
          System.out.println(e.getMessage());
      }
    }
}
