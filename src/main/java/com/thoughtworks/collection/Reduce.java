package com.thoughtworks.collection;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {

        Optional<Integer> max = arrayList.stream().max(Integer::compare);
        return max.orElse(Integer.MAX_VALUE);
    }

    public double getMinimum() {
        Optional<Integer> min = arrayList.stream().min(Integer::compare);
        return min.orElse(Integer.MIN_VALUE);
    }

    public double getAverage() {
        return arrayList.stream().mapToInt(i -> i).average().orElse(0);
    }

    public double getMedian() {
        if (arrayList.size() % 2 != 0) {
            return arrayList.get(arrayList.size() >> 1);
        }
        return (double) (arrayList.get((arrayList.size() / 2)) + arrayList.get(arrayList.size() / 2 - 1)) / 2;
    }

    public double getOrderedMedian() {
        return getMedian();
    }

    public int getFirstEven() {
        return arrayList.stream().filter(i -> i % 2 == 0).findFirst().orElse(0);
    }

    public int getIndexOfFirstEven() {
        int firstEven = getFirstEven();
        return arrayList.indexOf(firstEven);
    }

    public boolean isEqual(List<Integer> arrayList) {
        return this.arrayList.equals(arrayList);
    }


    public int getLastOdd() {
        List<Integer> evenList = arrayList.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        return evenList.get(evenList.size() - 1);
    }

    public int getIndexOfLastOdd() {
        int lastOdd = getLastOdd();
        return arrayList.indexOf(lastOdd);
    }
}
