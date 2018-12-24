package com.wuyi.bigworld;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private static final long serialVersionUID = -1882071901467368406L;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private static final int DEFAULT_CACHE_SIZE = 1024;

    private  int cacheSize;

    public LRUCache() {
        this(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR, DEFAULT_CACHE_SIZE);
    }

    public LRUCache(int capacity, float loadFactor, int cacheSize) {
        super(capacity, loadFactor, true);
        this.cacheSize = cacheSize;
    }

    public LRUCache(int capacity) {

        new LRUCache<K, V>(capacity, DEFAULT_LOAD_FACTOR, DEFAULT_CACHE_SIZE);
    }

    /*
     * (non-Javadoc)
     * @see java.util.LinkedHashMap#removeEldestEntry(java.util.Map.Entry)
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > cacheSize;
    }

    public static void main(String[] args) {

        LRUCache<Integer, Integer> cache = new LRUCache<>(10);
        cache.put(1, 1);
        cache.put(2, 2);
        Integer a = cache.get(1);// returns 1
        System.out.println(cache.size());

//        cache.put(3, 3);    // evicts key 2
//        cache.get(2);       // returns -1 (not found)
//        cache.put(4, 4);    // evicts key 1
//        cache.get(1);       // returns -1 (not found)
//        cache.get(3);       // returns 3
//        cache.get(4);       // returns 4
    }
}