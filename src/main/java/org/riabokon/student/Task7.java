package org.riabokon.student;


/*
* 7.  Текстовый файл содержит квадратную матрицу, которая записана по принципу: одна строка файла – одна строка матрицы.
* Необходимо построить двухмерный массив и вывести на экран исходную матрицу и результат ее транспонирования.
8.  Текстовый файл содержит квадратную матрицу, которая записана по принципу: одна строка – один элемент матрицы.
* Необходимо определить размерность матрицы и построить двухмерный массив. Вывести на экран исходную матрицу
*  и результат ее поворота на 90º по часовой стрелке.
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task7 {
    final File FILE = new File("C:\\Users\\leoni\\Desktop\\TextRed\\src\\main\\java\\org\\riabokon\\student\\matrix.txt");

    public void readFile() throws IOException {

        BufferedReader fr = new BufferedReader(new FileReader(FILE));
        String string;

        while ((string = fr.readLine()) != null) {
            String[] stringNum = string.split(" ");
            int [][] intArray = new int[1][1];
            for (int i = 0; i < stringNum.length; i++) {
                for (int j = 0; j < intArray.length; j++) {
                    for (int k = 0; k < intArray[j].length; k++) {
                    intArray[j][k] = Integer.parseInt(stringNum[i]);
                        System.out.print(intArray[j][k] + " ");

                    }
                }
            }


        }
        fr.close();
    }
}

class Task7realization {
    public static void main(String[] args) throws IOException{
        Task7 t7 = new Task7();
        t7.readFile();
    }
}
