package ru.tlcfr.stepik.java187.module_2.step_2_4_9;

public class MergeArrays {

    private MergeArrays() {
    }

    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] merged = new int[a1.length + a2.length];

        int i1 = 0;
        int i2 = 0;
        int i3 = 0;

        while (i1 < a1.length && i2 < a2.length) {
            if (a1[i1] < a2[i2]) {
                merged[i3++] = a1[i1++];
            } else {
                merged[i3++] = a2[i2++];
            }
        }

        while (i1 < a1.length) {
            merged[i3++] = a1[i1++];
        }
        while (i2 < a2.length) {
            merged[i3++] = a2[i2++];
        }

        return merged;
    }
}
