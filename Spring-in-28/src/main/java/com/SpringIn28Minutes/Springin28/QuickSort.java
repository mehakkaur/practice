package com.SpringIn28Minutes.Springin28;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgorithm{

    @Override
    public int sort(int[] arr) {
        return 222;
    }
}
