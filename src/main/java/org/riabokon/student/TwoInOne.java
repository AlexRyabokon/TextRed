package org.riabokon.student;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class TwoInOne {
    final File FILE11 = new File("C:\\Users\\leoni\\Desktop\\TextRed\\src\\main\\java\\org\\riabokon\\student\\11.txt");
    final File FILE22 = new File("C:\\Users\\leoni\\Desktop\\TextRed\\src\\main\\java\\org\\riabokon\\student\\22.txt");
    /*
4.  Создать два текстовых файла("11.txt и 22.txt"). Наполнить целыми числами. Создать файл из различных чисел, которые содержатся:
    -  в каждом исходном файле.
    -  только в одном из двух исходных файлов.
    -  только в первом исходном файле.
*/

    public void writeIn(Integer... integers) {

        try {
            PrintWriter pw = new PrintWriter(FILE11);
            ArrayList<Integer> integerArrayList11 = new ArrayList<>();
            Collections.addAll(integerArrayList11, integers);

            for (int i = 0; i < integerArrayList11.size(); i++) {
                pw.write(integerArrayList11.get(i)* 1 + " ");
                pw.print(integerArrayList11.get(i) + " ");
                pw.print(integerArrayList11.get(i) * 3 + " ");
                pw.print(integerArrayList11.get(i)  + " ");
                pw.print(integerArrayList11.get(i) * 5 + " ");

            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            PrintWriter pw = new PrintWriter(FILE22);
            ArrayList<Integer> integerArrayList22 = new ArrayList<>();
            Collections.addAll(integerArrayList22, integers);

            for (int i = 0; i < integerArrayList22.size(); i++) {
                pw.write(integerArrayList22.get(i) * 2 + " ");
                pw.print(integerArrayList22.get(i) + " ");
                pw.print(integerArrayList22.get(i) * 4 + " ");
                pw.print(integerArrayList22.get(i)  + " ");
                pw.print(integerArrayList22.get(i) * 6 + " ");

            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeIn(File file, String str) throws IOException {

            PrintWriter pw = new PrintWriter(file);
            pw.write(str);
            pw.close();

    }

    public String readFiles(File file) throws IOException{

            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            if (reader != null) {
                String s = reader.readLine();
                return s;
            } else {
                return "Mistake";
            }

    }


}

class RealizeTwoInOne {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\leoni\\Desktop\\TextRed\\src\\main\\java\\org\\riabokon\\student\\33.txt");
        TwoInOne tio = new TwoInOne();
       // tio.writeIn(11, 12, 13, 14, 15, 16, 1888, 115, 114, 114, 11, 4);
        String str = tio.readFiles(tio.FILE11);

        tio.writeIn(file, str);

    }
}



