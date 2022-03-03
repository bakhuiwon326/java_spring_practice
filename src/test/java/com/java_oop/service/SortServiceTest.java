package com.java_oop.service;

import com.java_oop.logic.BubbleSort;
import com.java_oop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
    private SortService sortService = new SortService(new JavaSort<String>());
    @Test
    void test(){

        List<String> result = sortService.doSort(List.of("3","2","1"));
        assertEquals(List.of("1","2","3"), result);
    }

}