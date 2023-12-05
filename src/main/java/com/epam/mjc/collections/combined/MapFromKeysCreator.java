package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();

        Set<String> origKeys = sourceMap.keySet();
        Set<Integer> newKeys = new HashSet<>();

        for (String s: origKeys) {
            newKeys.add(s.length());
        }

        for (int i: newKeys) {
            Set<String> newValues = new HashSet<>();
            for (String s: origKeys) {
                if (s.length() == i) {
                    newValues.add(s);
                }
            }
            result.put(i, newValues);
        }

        return  result;
    }
}
