package com.wzq;

public class PLBench1 {
    private static final int TEST_SIZE = 10000000;
    private static final int TEST_MAX_VALUE = 1000000000;

    public static void main(String[] args) {
        sort();
    }

    public static void sort() {
        int[] testVec = generateTestVec();
        myMergeSort(testVec);
        System.out.println(computeOutputHash(testVec));
    }

    private static int[] generateTestVec() {
        int[] testVec = new int[TEST_SIZE];
        long rand = 0;

        for (int i = 0; i < TEST_SIZE; i++) {
            testVec[i] = (int) rand;
            rand *= 131313131;
            rand += 13131;
            rand %= TEST_MAX_VALUE;
        }
        return testVec;
    }

    private static int computeOutputHash(int[] testVec) {
        long hash = testVec.length;
        for (int v: testVec) {
            hash = (hash * 131313131 + v) % TEST_MAX_VALUE;
        }
        return (int) hash;
    }

    private static < T extends Comparable<T>> void myMergeSort(int[] elements) {
        if (elements.length > 1) {
            int mid = elements.length / 2;
            int[] subSlice1 = new int[mid];
            int[] subSlice2 = new int[elements.length - mid];

            System.arraycopy(elements, 0, subSlice1, 0, mid);
            System.arraycopy(elements, mid, subSlice2, 0, elements.length - mid);

            myMergeSort(subSlice1);
            myMergeSort(subSlice2);

            int elementLen = elements.length;
            int subLen1 = subSlice1.length;
            int subLen2 = subSlice2.length;

            while (subLen1 > 0 && subLen2 > 0) {
                if ((subSlice1[subLen1 - 1] - subSlice2[subLen2 - 1]) < 0) {
                    elements[--elementLen] = subSlice2[--subLen2];
                } else {
                    elements[--elementLen] = subSlice1[--subLen1];
                }
            }
            while (subLen1 > 0) elements[--elementLen] = subSlice1[--subLen1];
            while (subLen2 > 0) elements[--elementLen] = subSlice2[--subLen2];
        }
    }
}