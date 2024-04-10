package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] strArray) {
        super(strArray);
    }


    @Override //removeDuplicatesExactly which removes all values in the array which occur exactly the specified number of times.
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return new String[0];
    }

    @Override //removeDuplicates which removes all values in the array which occur at least the specified number of times.
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return new String[0];
    }

}
