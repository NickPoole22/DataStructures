package com.company;

public class Array {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public int[] reverse(int[] array){
    int[] tempArray = new int[10];
    int j = 9;
    for (int i = 0; i <= array.length; i++){
    tempArray[i] = array[j];
    j--;

    }
    return tempArray;
    }

}


