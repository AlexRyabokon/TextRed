package org.riabokon.student;

/*
 * 6.  Создать файл. Записать туда произвольный текст. Из текстового файла удалить все слова,
 *  содержащие от трех до пяти символов, но при этом из каждой строки должно быть удалено
 * только четное количество таких слов.
 * */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task6 {

    final File FILE = new File("C:\\Users\\leoni\\Desktop\\TextRed\\src\\main\\java\\org\\riabokon\\student\\task6file.txt");
    String[] strings = {"Well said, my noble Scot: if speaking truth\n",
            "In this fine age were not thought flattery,\n",
            "Such attribution should the Douglas have,\n",
            "As not a soldier of this season's stamp\n",
            "Should go so general current through the world.\n",
            "By God, I cannot flatter; I do defy\n",
            "The tongues of soothers; but a braver place\n",
            "In my heart's love hath no man than yourself:\n",
            "Nay, task me to my word; approve me, lord."};
    ArrayList<String> stringToWrite = new ArrayList<>();

    // берет массив строк и возвращает их как ArrayList
    public ArrayList<String> getArrayList(String[] strings) {
        Collections.addAll(stringToWrite, strings);
        return stringToWrite;
    }

    // creates file
    public void createFile() {
        try {
            File myObj = new File("task6file.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //обрабатывает элементы ArrayList<String> и возвращает обработанный нужным образом String ArrayList
    public String processedText(String[] strings) {
        String[] dividedWords = {};
        ArrayList<String> finalStringArray = new ArrayList<>();



        for (int i = 0; i < strings.length; i++) {
            dividedWords = strings[i].split(" ");
            Collections.addAll(finalStringArray,dividedWords);
            for (int j = 0; j < dividedWords.length; j++) {
                if (dividedWords[j].length() >= 3 && dividedWords[j].length() <= 5) {
                    finalStringArray.remove(dividedWords[j]);
                }
            }
        }
        for (int k = 0; k < finalStringArray.size(); k++) {
            return (finalStringArray.toString());
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
        }
    }


}


class Task6Realize {
    public static void main(String[] args) {
        Task6 t6 = new Task6();
        String str = t6.processedText(t6.strings);
        t6.writeToFile(t6.FILE, str);


    }
}