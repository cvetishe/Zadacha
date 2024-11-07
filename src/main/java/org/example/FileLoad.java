package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileLoad {

    public static List<Tenants> fileRead(String file) throws Exception,FileNotFoundException {
        List<Tenants> list = new ArrayList<>();
        try (Scanner read = new Scanner(new File(file))) {
            int numbTenants = read.nextInt();
            int[] age = new int[numbTenants];
            int[] gender = new int[numbTenants];
            while (read.hasNext()) {
                for (int i = 0; i < numbTenants; i++) {
                    age[i] = read.nextInt();
                    gender[i] = read.nextInt();
                }
                Tenants t = new Tenants(numbTenants, age, gender);
                list.add(t);
            }
            return list;
        }
    }
}


