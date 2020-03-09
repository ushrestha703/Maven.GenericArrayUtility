package com.zipcodewilmington.arrayutility;

import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <T> {
    T[] inputArray;

    public ArrayUtility(T[] inputArray) { this.inputArray = inputArray; }

    public Integer countDuplicatesInMerge(T[] array, T value) {

        Integer count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        for (int i = 0; i < this.inputArray.length; i++) {
            if (this.inputArray[i] == value) {
                count++;
            }
        }
        return count;
    }

    public T[] removeValue(T valueToRemove){

        Integer arraySize =0;
        for (int i = 0; i <inputArray.length ; i++) {
            if((inputArray[i] != valueToRemove)){
                arraySize++;
            }
        }
        T[] result;
        result = Arrays.copyOf(inputArray, arraySize);
        Integer count =0;
        for (int i = 0; i <inputArray.length ; i++) {
            if(inputArray[i] != valueToRemove){
                result[count] = inputArray[i];
                count++;
            }
        }
        return result;
    }

    public T getMostCommonFromMerge(T[] array){

        T result = array[0];
        Integer count = 1;
        Integer countTwo = 0;

        for (int i = 1; i <array.length ; i++) {
            for (int j = 0; j <array.length-1 ; j++) {
                if(array[i] == array[j]){
                    count++;
                }
            }
            if(count > countTwo){
                result = array[i];
                countTwo = count;
                count = 0;
            }
        }
        return result;
    }

    public Integer getNumberOfOccurrences(T value){

        Integer count = 0;
        for (int i = 0; i <inputArray.length ; i++) {
            if(inputArray[i] == value){
                count++;
            }
        }
        return count;
    }
}

