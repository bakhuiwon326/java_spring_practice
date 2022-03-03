package com.java_oop.oop;

import com.java_oop.logic.BubbleSort;
import com.java_oop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Sort<String> sort = new BubbleSort<>();
        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}
