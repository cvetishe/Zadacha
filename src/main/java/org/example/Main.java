package org.example;

import java.io.FileNotFoundException;

import java.util.List;

import static org.example.FileLoad.fileRead;

public class Main {
    public static void main(String[] args) throws Exception, FileNotFoundException {
        List<Tenants> tenants = fileRead("src/test/resources/input0.txt");
        tenants.forEach(System.out::println);
    }
}