package com.SpringIn28Minutes.Springin28;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    //do sorting/ either bubble or quick sort

    //bydefault autored happened wth -> setter

    @Autowired
    @Qualifier("bubbleSort")
    //qualifier has more precedence thn primary
   private  SortAlgorithm sortAlgo;

    //Dependency Injection  of beans
    // 1. autowiring via constructor by type.
    public BinarySearchImpl(SortAlgorithm sortAlgo){
        this.sortAlgo=sortAlgo;
    }

    public void search(int[] intArray, int number) {
       int sortnum= sortAlgo.sort(intArray);
       System.out.println("sort algo->"+sortAlgo);
    }


}
