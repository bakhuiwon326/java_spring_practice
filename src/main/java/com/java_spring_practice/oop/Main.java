package com.java_spring_practice.oop;

import com.java_spring_practice.Config.Config;
import com.java_spring_practice.logic.BubbleSort;
import com.java_spring_practice.logic.Sort;
import com.java_spring_practice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        //Sort<String> sort = new BubbleSort<>();
        SortService sortService = context.getBean(SortService.class);
        System.out.println("[result] " + sortService.doSort(Arrays.asList(args)));
    }
}
