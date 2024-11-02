package org.example;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileLoad {


    public static void fileRead(String file){
        List<String> list = new ArrayList<>();
        try{
            Scanner read = new Scanner(new File(file));
            while(read.hasNext()){
                list.add(read.next());

            }
        }
        catch(Exception e){
            System.out.println(e.getMessage() + "не видит файл");
        }
        System.out.println(list);
    }


}

