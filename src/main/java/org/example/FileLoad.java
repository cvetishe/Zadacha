package org.example;

import java.io.File;

import java.util.Scanner;

public class FileLoad {

    public static void main(String[] args) {
        fileRead("input.txt");
    }
    public static void fileRead(String file){
        try{
            Scanner read = new Scanner(new File(file));
            while(read.hasNext()){
                String str = read.next();

                System.out.println(str);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}

