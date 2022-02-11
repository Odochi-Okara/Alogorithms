package com.algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapAlgo {

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(5);
        cache.mapper.put("b",2);
        cache.mapper.put("c", 5);
        System.out.println(cache.mapper.get("a"));


    }
    static class LRUCache {
        int maxSize;
        Map<String, Integer> mapper = new HashMap<>();

        public LRUCache(int maxSize) {
            this.maxSize = maxSize > 1 ? maxSize : 1;
        }

        public void insertKeyValuePair(String key, int value) {
            // Write your code here.
            Iterator m = mapper.keySet().iterator();
            if(mapper.containsKey(key)){
                mapper.replace(key,value);
            }
            else{mapper.put(key,value);}

        }

        public LRUResult getValueFromKey(String key) {
            // Write your code here.
            boolean found = false;
            int value = mapper.get(key);
            if(mapper.containsValue(value)){
                found = true;
                return new LRUResult(found,value);
            }

            return new LRUResult(found, value);
        }

        public String getMostRecentKey() {
            // Write your code here.
            Iterator m = mapper.keySet().iterator();
            while (m.hasNext()){

            }
            return null;
        }
    }

    static class LRUResult {
        boolean found;
        Integer value;

        public LRUResult(boolean found, Integer value) {
            this.found = found;
            this.value = value;
        }
    }
}

