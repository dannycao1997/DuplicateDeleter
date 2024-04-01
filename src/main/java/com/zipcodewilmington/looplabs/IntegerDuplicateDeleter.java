package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override  //removing integers that appear at least a specified number of times
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return removeBasedOnResultCount(maxNumberOfDuplications, false);
    }

    @Override //removing integers that appear exactly a specified number of times
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return removeBasedOnResultCount(exactNumberOfDuplications, true);
    }
}



