package com.geekbrains.exersise1_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HW1 {
    public static void main(String[] args) {
        ArrayExample<Integer> arr1 = new ArrayExample<>(new Integer[]{123, 456, 589, 756});
        arr1.showArray();
        arr1.shiftArray(1, 3);
        arr1.showArray();

        List<Integer> arrToList = new ArrayList<>();

        arr1.arrayToList(arrToList);
        arrToList.add(895);

        arr1.printArrayList(arrToList);
        arrToList.add(0, 1589);

        arr1.printArrayList(arrToList);

    }

    public static class ArrayExample<T> {
        private T[] array;

        public ArrayExample(T[] array) {
            this.array = array;
        }

        public void arrayToList(List<T> listForArray) {
            Collections.addAll(listForArray, array);
        }

        public void printArrayList(List<T> listForArray) {
            for (T arrList : listForArray) {
                System.out.print(" " + arrList);
            }
            System.out.println();
        }

        public void shiftArray(int idx1, int idx2) {
            T temp;
            temp = array[idx1];
            array[idx1] = array[idx2];
            array[idx2] = temp;
        }

        public void showArray() {
            for (T arr : array) {
            System.out.print(" " + arr);
            }
            System.out.println();
        }

        public T[] getArray() {
            return array;
        }

        public void setArray(T[] array) {
            this.array = array;
        }
    }
}
