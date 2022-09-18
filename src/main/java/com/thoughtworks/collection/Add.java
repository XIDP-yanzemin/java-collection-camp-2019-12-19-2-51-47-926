package com.thoughtworks.collection;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if (leftBorder < rightBorder) {
            return IntStream.range(leftBorder, rightBorder + 1).boxed().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
        } else {
            return IntStream.range(rightBorder, leftBorder + 1).boxed().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
        }
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if (leftBorder < rightBorder) {
            return IntStream.range(leftBorder, rightBorder + 1).boxed().filter(i -> i % 2 != 0).mapToInt(Integer::intValue).sum();
        } else {
            return IntStream.range(rightBorder, leftBorder + 1).boxed().filter(i -> i % 2 != 0).mapToInt(Integer::intValue).sum();
        }
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(i -> i * 3 + 2).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(integer -> integer % 2 == 0 ? integer : integer * 3 + 2).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(i -> i % 2 != 0).mapToInt(i -> i * 3 + 5).sum();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        List<Integer> evenList = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        int size = evenList.size();
        return size % 2 == 0 ? (evenList.get(size / 2 - 1) + evenList.get(size / 2)) >> 1 : evenList.get(size >> 1);
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return (float) arrayList.stream().mapToInt(i -> i).sum() / arrayList.size();
    }

    public boolean isIncludedInEven(List<Integer> arrayList, Integer specialElement) {

        List<Integer> evenList = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        return evenList.stream().anyMatch(i -> evenList.contains(specialElement));
    }

    public List<Integer> getUnrepeatedFromEven(List<Integer> arrayList) {
        return arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<>();
        resultList.addAll(arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));
        resultList.addAll(arrayList.stream().filter(i -> i % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        return resultList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> tripledList = arrayList.stream().map(i -> i * 3).collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < tripledList.size() - 1; i++) {
            resultList.add(tripledList.get(i) + tripledList.get(i + 1));
        }
        return resultList;
    }
}
