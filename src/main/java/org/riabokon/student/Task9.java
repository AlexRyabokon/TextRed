package org.riabokon.student;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*
*Создать файл. Записать туда произвольный текст. Написать код который будет считывать содержимое файла, считать
* количество символов в тексте и записывать результат в файл. Файл с результатом должен находиться рядом с файлом
* откуда производилось чтение текста.
* */


public class Task9 {

    public int countOfWords = 0;
    int sum = 0;

    // creates file
    public File createFile(String name) {
        try {
            File FILE = new File("C:\\Users\\leoni\\Desktop\\TextRed\\src\\main\\java\\org\\riabokon\\student\\" + name + ".txt");
            if (FILE.createNewFile()) {
                System.out.println("File created: " + FILE.getName());
                return FILE;
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }

    public void writeToFile(File file, String str) {
        try {
            FileWriter myWriter = new FileWriter(file);
            myWriter.write(str);
            myWriter.close();
            //System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println(" Null mistake");
            e.printStackTrace();
        }
    }

    public void readFile(File file) throws IOException {

        BufferedReader fr = new BufferedReader(new FileReader(file));
        String string;

        while ((string = fr.readLine()) != null) {
            String[] stringNum = string.split(" ");

            for (int i = 0; i < stringNum.length; i++) {
                countOfWords++;
                sum = sum+stringNum[i].length();
            }
            System.out.println(string);
        }

        fr.close();
    }

    public String countOfElementsInfo(File file) throws IOException {

        BufferedReader fr = new BufferedReader(new FileReader(file));
        String string;

        while ((string = fr.readLine()) != null) {
            String[] stringNum = string.split(" ");
            for (int i = 0; i < stringNum.length; i++) {
                countOfWords++;
                sum = sum+stringNum[i].length();
            }

        }
        fr.close();

        return "Количество букв в тексте: " + sum + "\n" +
                "Количество слов:  " + countOfWords;

    }
}


class Task9realization {
    public static void main(String[] args) throws IOException {
       String stringToWrite = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. \n" +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown \n" +
                "printer took a galley of type and scrambled it to make a type specimen book. It has survived not \n" +
                "only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.";
        Task9 task9 = new Task9();
        //File file1 = task9.createFile("CountFileTask9");

        File task9fi = new File("C:\\Users\\leoni\\Desktop\\TextRed\\src\\main\\java\\org\\riabokon\\student\\task9fi.txt");
        File CountFileTask9 = new File("C:\\Users\\leoni\\Desktop\\TextRed\\src\\main\\java\\org\\riabokon\\student\\CountFileTask9.txt");
        task9.writeToFile(task9fi, stringToWrite);
        task9.writeToFile(CountFileTask9, task9.countOfElementsInfo(task9fi));


    }
}