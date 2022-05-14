package org.riabokon.student;

import java.io.*;

public class Text1 {
    File file = new File("C:\\Users\\leoni\\Desktop\\TextRed\\src\\main\\java\\org\\riabokon\\student\\t1.txt");

/*
1.  Создать файл. Записать туда целые числа. Удалить из него все четные числа.
*/

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
            for (int i = 0; i < stringNum.length; i++) {
                int num = Integer.parseInt(stringNum[i]);
                if (num % 2 != 0) {
                    System.out.print(num + " ");

                }
            }
        }
    }

}


class Realize {

    public static void main(String[] args) {
        Text1 t = new Text1();


        t.writeIn(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1885);

        try {
            t.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}