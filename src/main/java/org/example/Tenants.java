package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class Tenants {
    private final int men = 1;
    int numbTenants;
    int[] age;
    int[] gender;
    int max;

    public Tenants(int numbTenants, int[] age, int[] gender) throws Exception {
        if(numbTenants == 0){
            throw new Exception("Не указано кол-во жильцов");
        }
        if(age[0] == 0){
            throw new Exception("Не корректно заполнены данные");
        }
        if(gender[0] != 0 && gender[0] != 1){
            throw new Exception("Не корректно заполнены данные");
        }
        this.age = age;
        this.numbTenants = numbTenants;
        this.gender = gender;
    }

    public int distribution() {
        int max = 0;
        int num = 0;
        for (int i = 0; i < numbTenants; i++) {
            if (gender[i] == men) {
                if (max < age[i]) {
                    max = age[i];
                    num = i + 1;
                }
            }
        }
        if(num == 0){
            return -1;
        }
        return num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tenants tenants = (Tenants) o;
        return numbTenants == tenants.numbTenants && max == tenants.max && Objects.deepEquals(age, tenants.age) && Objects.deepEquals(gender, tenants.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(men, numbTenants, Arrays.hashCode(age), Arrays.hashCode(gender), max);
    }

    @Override
    public String toString() {
        return Integer.toString(distribution());
    }

}
