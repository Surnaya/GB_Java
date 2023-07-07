package org.example.homework6;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Set<Notebooks> set = new HashSet<>();
        set.add(new Notebooks("Notebook 1", 8, "Windows10", 80000, "HP"));
        set.add(new Notebooks("Notebook 2", 16, "Windows10", 85000, "Asus"));
        set.add(new Notebooks("Notebook 3", 32, "linux", 85000, "Lenovo"));
        set.add(new Notebooks("Notebook 4", 64, "linux", 90000, "Lenovo"));

        Operations operation = new Operations(set);
        operation.start();

    }
}
