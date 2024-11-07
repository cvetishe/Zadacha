package tenants;

import org.example.Tenants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TenantsTest {

    @Test
    void TestConstructor1() {
        Assertions.assertDoesNotThrow(()->
                new Tenants(2, new int[]{25,25},new int[]{0,1}));

    }
    @Test
    void TestConstructor2() {
        Assertions.assertDoesNotThrow(()->
                new Tenants(2, new int[]{25,25},new int[]{0,0}));

    }
    @Test
    void TestConstructor3() {
        Assertions.assertThrows(Exception.class,
                ()-> new Tenants(0, new int[]{25,25},new int[]{0,1}));

    }
    @Test
    void TestConstructor4() {
        Assertions.assertThrows(Exception.class,
                ()-> new Tenants(2, new int[]{0,0},new int[]{1,1}));
    }
    @Test
    void TestConstructor5() {
        Assertions.assertThrows(Exception.class,
                ()-> new Tenants(3, new int[]{10,100,45},new int[]{-1,2,3}));

    }

    @Test
    void TestDistribution1() throws Exception{
        Tenants tenants = new Tenants(3, new int[]{10,100,45},new int[]{1,1,1});
        Assertions.assertEquals(2,tenants.distribution());
    }
    @Test
    void TestDistribution2() throws Exception{
        Tenants tenants = new Tenants(5, new int[]{10,17,45,7,89},new int[]{1,1,0,0,1});
        Assertions.assertEquals(5,tenants.distribution());
    }
    @Test
    void TestDistribution3() throws Exception{
        Tenants tenants = new Tenants(3, new int[]{10,100,45},new int[]{0,0,0});
        Assertions.assertEquals(-1,tenants.distribution());
    }
}

