package tenants;

import org.example.FileLoad;
import org.example.Tenants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.example.FileLoad.fileRead;

public class FileLoadTest {

    @Test
    void testFileRead1() throws Exception {
        String str = "src/test/resources/input_1.txt";
        List<Tenants> actual = fileRead(str);
        List<Tenants> expected = new ArrayList<>();
        expected.add(new Tenants(2, new int[]{25,25},new int[]{0,1}));
        Assertions.assertIterableEquals(expected,actual);
    }

    @Test
    void testFileRead2() throws Exception {
        String str = "src/test/resources/input_2.txt";
        List<Tenants> actual = fileRead(str);
        List<Tenants> expected = new ArrayList<>();
        expected.add(new Tenants(3, new int[]{34,23,11},new int[]{0,0,0}));
        Assertions.assertIterableEquals(expected,actual);
    }
    @Test
    void testFileRead3() throws Exception {
        String str = "src/test/resources/input.txt";
        List<Tenants> actual = fileRead(str);
        List<Tenants> expected = new ArrayList<>();
        expected.add(new Tenants(4, new int[]{25,70,100,3},new int[]{1,1,0,1}));
        Assertions.assertIterableEquals(expected,actual);
    }
    @Test
    void testFileRead4() {
        String str = "src/test/resources/input0.txt";
        Assertions.assertThrows(FileNotFoundException.class,
                ()-> FileLoad.fileRead(str));
    }
    @Test
    void testFileRead5() {
        String str = "src/test/resources/text3.txt";
        Assertions.assertThrows(Exception.class,
                ()-> FileLoad.fileRead(str));
    }
    @Test
    void testFileRead6() {
        String str = "src/test/resources/text2.txt";
        Assertions.assertThrows(Exception.class,
                ()-> FileLoad.fileRead(str));
    }
    @Test
    void testFileRead7() {
        String str = "src/test/resources/text1.txt";
        Assertions.assertThrows(Exception.class,
                ()-> FileLoad.fileRead(str));
    }

}
