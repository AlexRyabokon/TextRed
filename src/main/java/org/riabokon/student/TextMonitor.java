package org.riabokon.student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class TextMonitor {

    static ArrayList <String> arList = new ArrayList<>();

    static ArrayList <Integer> integerArrayList = new ArrayList<>();


    public static ArrayList<String> arListContent(String... strings ){

        Collections.addAll(arList, strings);
        return arList;
    }

    public static void writeFile(Integer... integers) {
        File file = new File("C:\\Users\\leoni\\Desktop\\TextRed\\src\\main\\java\\org\\riabokon\\student\\text.txt");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

      //  pw.println(arListContent(integers));


        pw.close();
    }

    public static void writeFile(String... strings) {
        File file = new File("C:\\Users\\leoni\\Desktop\\TextRed\\src\\main\\java\\org\\riabokon\\student\\text.txt");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        pw.println(arListContent(strings));


        pw.close();
    }


}
