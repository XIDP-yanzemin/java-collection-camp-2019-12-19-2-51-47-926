package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        int i = random.nextInt(3);
        ArrayList<Integer> integers = new ArrayList<>();
        while (number > i) {
            number = number - i;
            integers.add(number);

        }
        return integers;
    }
}
