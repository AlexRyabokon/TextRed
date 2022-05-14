package org.riabokon.student;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class Task2 {
    final File FILE = new File("C:\\Users\\leoni\\Desktop\\TextRed\\src\\main\\java\\org\\riabokon\\student\\Task2.txt");

/*
2.  Создать файл. Записать туда произвольный текст. В файле содержится совокупность текстовых строк. Изменить первую букву каждого слова на заглавную.
*/

    public void writeIn(String... strings) {

        try {
            PrintWriter pw = new PrintWriter(FILE);
            for (int i = 0; i < strings.length; i++) {
                pw.write(strings[i]);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void makeUpperCaseIO() throws IOException {

        BufferedReader fr = new BufferedReader(new FileReader(FILE));
        String stringToRead;


        while ((stringToRead = fr.readLine()) != null) {
            String[] stringWord = stringToRead.split(" ");
            for (int i = 0; i < stringWord.length; i++) {

                System.out.println(stringWord[i].replace(stringWord[i].charAt(0), Character.toUpperCase(stringWord[i].charAt(0))));

            }

        }

        fr.close();

    }

   /* 3.  Создать файл. Записать туда произвольный текст. Создать новый файл, каждая строка которого получается
    из соответствующей строки исходного файла  перестановкой слов в обратном порядке.*/

    public void makeTextReverseIO() throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader(FILE));
        String stringToRead;
        ArrayList<String> arrListStr = new ArrayList<>();


        while ((stringToRead = fr.readLine()) != null) {
            String[] stringWord = stringToRead.split(" ");
            Collections.addAll(arrListStr, stringWord);
            Collections.reverse(arrListStr);
            System.out.println(arrListStr);

        }

        fr.close();
    }


}


class RealizeTask2 {

    public static void main(String[] args) {
        Task2 t2 = new Task2();

       /* t2.writeIn("Some text which i like to type anytime");
        try {
            t2.makeUpperCaseIO();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        try {
            t2.makeTextReverseIO();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

