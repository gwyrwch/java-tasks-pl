package org.san.zadania.main.Task4;

import java.util.*;

public class Main {
    private static void medianAndAverage(Collection<Double> c) {
        Double average = c.stream().mapToDouble(i -> i).average().orElse(0.);

        List<Double> cList = new ArrayList<>(c);
        Collections.sort(cList);
        int middle = cList.size() / 2;
        Double median = cList.get(middle);

        System.out.printf("Average = %f, median = %f\n\n", average, median);
    }

    public static void main(String[] args) {
        Set<Double> a = new HashSet<>();
        a.add(1d);
        a.add(0.5d);
        a.add(2d);
        a.add(33.13d);
        medianAndAverage(a);

        List<Double> b = new ArrayList<>();
        b.add(1d);
        b.add(0.5d);
        b.add(2d);
        b.add(33.13d);
        medianAndAverage(b);
    }
}
