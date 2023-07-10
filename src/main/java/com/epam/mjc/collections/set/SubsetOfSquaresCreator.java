package com.epam.mjc.collections.set;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> newSet = new TreeSet<>();
        if (sourceList.isEmpty()) return newSet;

        NavigableSet<Integer> set = new TreeSet<>(
                sourceList.stream()
                .map(n -> n * n)
                .collect(Collectors.toSet())
        );


        Integer n = set.ceiling(lowerBound);
        do{
          newSet.add(n);
          n = set.higher(n);

        } while(n <= set.floor(upperBound));

        return newSet;
    }

    public static void main(String[] args) {
        SubsetOfSquaresCreator subSetCreator = new SubsetOfSquaresCreator();
        System.out.println(
            subSetCreator.createSubsetOfSquares(List.of(-1, 5, 3, -3, 6, -7, -4, 2),4,25)
        );
    }
}
