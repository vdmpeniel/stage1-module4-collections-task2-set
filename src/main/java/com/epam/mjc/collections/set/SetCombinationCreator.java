package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);

        Set<String> subtraction = new HashSet<>(thirdSet);
        subtraction.removeAll(firstSet);
        subtraction.removeAll(secondSet);

        intersection.addAll(subtraction);
        return intersection;
    }
}
