package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tenants {

    int numbTenants;
    int age;
    String gender;

    public Tenants(String gender, int age, int numbTenants) {
        this.gender = gender;
        this.age = age;
        this.numbTenants = numbTenants;
    }

    public void distribution(ArrayList<String> str,int numbTenants,int age, String gender){
        numbTenants = Integer.parseInt(str.get(0));


    }


}
