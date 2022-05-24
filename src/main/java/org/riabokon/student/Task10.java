package org.riabokon.student;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Task10 {

/*
* 10.  Создать файл. Записать туда последовательность чисел. Например: 1 2 3 4 5 6 537.
*  Написать код который считает содержимое файла и посчитает сумму всех цифр.
*  Результат записать в файл.*/

    public static void createFile(String name) {
        try {
            File FILE = new File("C:\\Users\\leoni\\Desktop\\TextRed\\src\\main\\java\\org\\riabokon\\student\\" + name + ".txt");
            if (FILE.createNewFile()) {
                System.out.println("File created: " + FILE.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void writeIn(File file, Object... intArr) {

        try {
            PrintWriter pw = new PrintWriter(file);
            for (int i = 0; i < intArr.length; i++) {
                pw.write((intArr[i]) + " ");
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String readFile(File file) throws IOException {

        BufferedReader fr = new BufferedReader(new FileReader(file));
        String string;
        int sum = 0;
        String SUM = "";

        while ((string = fr.readLine()) != null) {
            String[] stringNum = string.split(" ");
            ArrayList<Integer> sortedArrayListint = new ArrayList<>();
            for (int i = 0; i < stringNum.length; i++) {
                sortedArrayListint.add(Integer.parseInt(stringNum[i]));
                sum +=sortedArrayListint.get(i);

            }return ("Sum of numbers in file"+file.getName()+" is : "+sum);
        }
        fr.close();
        return null;
    }


}

class Task10R{
    public static void main(String[] args) throws IOException {
        Task10 t10 = new Task10();

        File file = new File("C:\\Users\\leoni\\Desktop\\TextRed\\src\\main\\java\\org\\riabokon\\student\\Task10.txt");
        File file1 = new File("C:\\Users\\leoni\\Desktop\\TextRed\\src\\main\\java\\org\\riabokon\\student\\Task10SUM.txt");
        t10.writeIn(file, 1,2,3,6,452);
        t10.readFile(file);
        t10.writeIn(file1, t10.readFile(file));

    }
}
