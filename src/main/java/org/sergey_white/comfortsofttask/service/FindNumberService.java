package org.sergey_white.comfortsofttask.service;

import org.sergey_white.comfortsofttask.utill.ExcelReader;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FindNumberService {
    private static final Random random = new Random();

    public Integer findNthMinNumber(String filePath, Integer n) throws Exception {
        List<Integer> numbers = ExcelReader.readNumbers(filePath);

        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("File is empty");
        }

        if (n < 1 || n > numbers.size()) {
            throw new IllegalArgumentException("n must be between 1 and " + numbers.size());
        }

        return quickSelect(new ArrayList<>(numbers), 0, numbers.size() - 1, n - 1);
    }

    private Integer quickSelect(List<Integer> list, int low, int high, int n) {
        if (low == high) {
            return list.get(low);
        }

        int pivotIndex = partition(list, low, high);

        if (n == pivotIndex) {
            return list.get(n);
        } else if (n < pivotIndex) {
            return quickSelect(list, low, pivotIndex - 1, n);
        } else {
            return quickSelect(list, pivotIndex + 1, high, n);
        }
    }

    private int partition(List<Integer> list, int low, int high) {
        int pivotIndex = low + random.nextInt(high - low + 1);
        Integer pivot = list.get(pivotIndex);

        swap(list, pivotIndex, high);

        int storeIndex = low;
        for (int i = low; i < high; i++) {
            if (list.get(i) < pivot) {
                swap(list, i, storeIndex);
                storeIndex++;
            }
        }

        swap(list, storeIndex, high);
        return storeIndex;
    }

    private void swap(List<Integer> list, int i, int j) {
        Collections.swap(list, i, j);
    }
}