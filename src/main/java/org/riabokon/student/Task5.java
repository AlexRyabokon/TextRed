package org.riabokon.student;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Task5 {

    /*
      5. Создать и заполнить файл случайными целыми значениями. Выполнить сортировку содержимого файла по возрастанию.
    */

    final File file = new File("C:\\Users\\leoni\\Desktop\\TextRed\\src\\main\\java\\org\\riabokon\\student\\exampleClass.txt");

    public void writeIn(Integer... intArr) {

        try {
            PrintWriter pw = new PrintWriter(file);
            for (int i = 0; i < intArr.length; i++) {
                pw.write(String.valueOf(intArr[i]) + " ");
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readFile() throws IOException {

        BufferedReader fr = new BufferedReader(new FileReader(file));
        String string;

        while ((string = fr.readLine()) != null) {
            String[] stringNum = string.split(" ");
            ArrayList <Integer> sortedArrayListint = new ArrayList<>();
            for (int i = 0; i < stringNum.length; i++) {
               sortedArrayListint.add(Integer.parseInt(stringNum[i]));
               Collections.sort(sortedArrayListint);

            }System.out.println(sortedArrayListint);
        }
        fr.close();
    }
}


class Task5Realize {
    public static void main(String[] args) throws IOException {
        Task5 example = new Task5();
        example.writeIn(10,11, 3432, 4324, 234234,4223423,4234234,4323423,234234);
        example.readFile();
    }
}