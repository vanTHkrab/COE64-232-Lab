package Object.Homework.A_18_2;

import java.io.*;
import java.util.*;

public class Pair implements Comparable<Pair>{
    String x;
    int y;

    public Pair(String x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override public int compareTo(Pair a) {
        if (this.x.compareTo(a.x) != 0) {
            return this.x.compareTo(a.x);
        } else {
            return this.y - a.y;
        }
    }
}
