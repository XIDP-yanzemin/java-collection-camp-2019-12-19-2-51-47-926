package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private final String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private final List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(i -> i * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return array.stream().map(i -> letterList.get(i - 1)).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        List<String> resultList = new ArrayList<>();
        for (Integer integer : array) {
            if (integer <= 26) {
                resultList.add(letters[integer - 1]);
            } else {
                if (integer % 26 == 0) {
                    resultList.add(letters[integer / 26 - 2] + "z");
                } else {
                    resultList.add(letters[(integer / 26) - 1] + letters[integer % 26 - 1]);
                }
            }
        }
        return resultList;
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().collect(Collectors.toList());
    }
}
