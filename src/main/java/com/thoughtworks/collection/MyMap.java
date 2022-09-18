package com.thoughtworks.collection;

import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        throw new UnsupportedOperationException();
    }

    public List<String> mapLetter() {
        throw new UnsupportedOperationException();
    }

    public List<String> mapLetters() {
        throw new UnsupportedOperationException();
    }

    public List<Integer> sortFromBig() {
        throw new UnsupportedOperationException();
    }

    public List<Integer> sortFromSmall() {
        throw new UnsupportedOperationException();
    }
}
