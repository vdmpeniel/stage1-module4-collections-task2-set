package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        Set<Integer> numberSet = new HashSet<>();
        sourceList.stream().forEach(n -> {
            numberSet.add(n);
            if(n % 2 == 0){
                do{
                    n = n / 2;
                    numberSet.add(n);
                } while(n % 2 == 0);
            } else {
                numberSet.add(2 * n);
            }
        });
        return (HashSet<Integer>) numberSet;
    }

    public static void main(String[] args) {
        HashSetCreator hashSetCreator = new HashSetCreator();
        System.out.println(hashSetCreator.createHashSet(List.of(5)));

    }
}
