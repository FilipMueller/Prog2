package Lektion17.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;

public class Exceptions {

    public static void numberFormatExceptionBeispiel() {
        int a = Integer.parseInt("abc");
        System.out.println(a);
    }

    public static void arrayIndexOutOfBoundsExceptionBeispiel() {
        int[] array = {5, 6, 1, 19, 5};
        int x = array[2];
        int y = array[6];
    }

    public static void nullPointerExceptionBeispiel() {
        String x = null;
        x.length();
    }

    public static void outOfMemoryErrorBeispiel() {
        String str = "hello";
        LinkedList<String> List = new LinkedList<String>();
        while (true){
            str = str + "bye";
            List.add(str);
        }
    }

    public static void fileNotFoundExceptionBeispiel() throws FileNotFoundException {
        File file = new File("D:\\Studium\\BIN2\\Programmieren II\\Prog2\\asd.xml");
        FileReader fL = new FileReader(file);
//        try {
//            FileReader fL = new FileReader(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }

    public static void arithmeticExceptionBeispiel() {
        int i = 10;
        int x = 0;
        int z = i / x;
    }
}
