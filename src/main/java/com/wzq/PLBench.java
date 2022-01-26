package com.wzq;

import java.util.ArrayList;
import java.util.List;

public class PLBench {
    private static final int TEST_SIZE = 10000000;
    private static final int TEST_MAX_VALUE = 1000000000;

    public static void main(String[] args) {
        sort();
    }

    public static void sort() {
        List<Integer> testVec = generateTestVec();
        myMergeSort(testVec);
        System.out.println(computeOutputHash(testVec));
    }

    private static List<Integer> generateTestVec() {
        List<Integer> testVec = new ArrayList<>();
        long rand = 0;

        for (int i = 0; i < TEST_SIZE; i++) {
            testVec.add((int) rand);
            rand *= 131313131;
            rand += 13131;
            rand %= TEST_MAX_VALUE;
        }
        return testVec;
    }

    private static int computeOutputHash(List<Integer> testVec) {
        long hash = testVec.size();
        for (int v: testVec) {
            hash = (hash * 131313131 + v) % TEST_MAX_VALUE;
        }
        return (int) hash;
    }

    private static < T extends Comparable<T>> void myMergeSort(List<T> elements) {
        if (elements.size() > 1) {
            int mid = elements.size() / 2;
            List<T> subSlice1 = new ArrayList<>(elements.subList(0, mid));
            List<T> subSlice2 = new ArrayList<>(elements.subList(mid, elements.size()));

            myMergeSort(subSlice1);
            myMergeSort(subSlice2);

            int elementLen = elements.size();
            int subLen1 = subSlice1.size();
            int subLen2 = subSlice2.size();

            while (subLen1 > 0 && subLen2 > 0) {
                if (subSlice1.get(subLen1 - 1).compareTo(subSlice2.get(subLen2 - 1)) < 0) {
                    elements.set(--elementLen, subSlice2.get(--subLen2));
                } else {
                    elements.set(--elementLen, subSlice1.get(--subLen1));
                }
            }
            while (subLen1 > 0) elements.set(--elementLen, subSlice1.get(--subLen1));
            while (subLen2 > 0) elements.set(--elementLen, subSlice2.get(--subLen2));
        }
    }
}