package Object.Homework.A_18_2;


import java.io.*;
import java.util.*;

public class TestPair {
    public static void main(String[] args) {

        int n = 4;
        Pair[] arr = new Pair[n];

        arr[0] = new Pair("abc", 3);
        arr[1] = new Pair("a", 4);
        arr[2] = new Pair("bc", 5);
        arr[3] = new Pair("a", 2);

        Arrays.sort(arr);
        print(arr);
    }

    public static void print(Pair[] arr) {
        for (Pair p : arr) {
            System.out.println(p);
        }
    }
}
