package org.example;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.example.FileLoad.fileRead;

public class Main {
    public static void main(String[] args) {
        fileRead("input.txt");
//        String text = "4\n" +
//                "25 1\n" +
//                "70 1\n" +
//                "100 0\n" +
//                "3 1";            // записываем текст my text  в файл NewFile.txt
//        try (FileOutputStream fileForOut = new FileOutputStream("input.txt")) {
//            byte[] massivByte = text.getBytes();// строковую переменную преаратит в массив байтов
//            fileForOut.write(massivByte, 0, massivByte.length);
//            System.out.println("Файл записан");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//
//        }
    }
}