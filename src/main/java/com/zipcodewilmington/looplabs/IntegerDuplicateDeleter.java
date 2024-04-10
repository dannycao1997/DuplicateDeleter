package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

//Arrays.stream() method
    @Override  //removeDuplicates which removes all values in the array which occur at least the specified number of times.
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(j -> Collections.frequency(Arrays.asList(array), j) < maxNumberOfDuplications)
                .toArray(Integer[]:: new);
    }

    @Override //removeDuplicatesExactly which removes all values in the array which occur exactly the specified number of times.
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(j -> Collections.frequency(Arrays.asList(array), j) != exactNumberOfDuplications)
                .toArray(Integer[]:: new);
    }
}



