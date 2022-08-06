package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
        int len = array.length;

        if(array == null || len == 0) {
            System.out.println();
        } else {
            int last = array[len - 1];
            for (int i = len - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }

            array[0] = last;

            System.out.println(Arrays.toString(array));
        }
    }

    static void cycleSwap(int[] array, int shift) {

        for (int k = 0; k < shift; k++) {
            cycleSwap(array);
        }

    }
}
