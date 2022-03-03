package com.java_oop.service;

import com.java_oop.logic.JavaSort;
import com.java_oop.logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String> sort){
        this.sort = sort;
        System.out.println("class name: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list){
        return sort.sort(list);
    }
}
