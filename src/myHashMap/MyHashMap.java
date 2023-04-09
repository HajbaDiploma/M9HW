package myHashMap;

import java.security.Key;
import java.util.LinkedList;

public class MyHashMap<K, V> {

    private Object[] backets;
    //LinkedList<Entry<K, V>>
    public MyHashMap() {
        backets = new Object[10];
        for (int i = 0; i < 10; i++) {
            backets[i] = new LinkedList<Entry<K, V>>();
        }
    }

    public void put(K key, V value) {
        int hs = key.hashCode();
        int bs = hs % backets.length;
        ((LinkedList<Entry<K, V>>)backets[bs]).add(new Entry<K, V>(key, value));
    }

    public V get(K key) {
        int hs = key.hashCode();
        int bs = hs % backets.length;
        for (Entry<K, V> kvEntry : ((LinkedList<Entry<K, V>>)backets[bs])) {
            if (key.equals(kvEntry.getKey())) {
                return kvEntry.getValue();
            }
        }
        return null;
    }

    public void remove(K key) {
        int hs = key.hashCode();
        int bs = hs % backets.length;
        for (int i = 0; i < ((LinkedList<Entry<K, V>>)backets[bs]).size(); i++) {
            Entry kvEntry = ((LinkedList<Entry<K, V>>)backets[bs]).get(i);
            if (key.equals(kvEntry.getKey())) {
                ((LinkedList<Entry<K, V>>)backets[bs]).remove(i);
            }
        }
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < backets.length; i++) {
            size = ((LinkedList<Entry<K, V>>)backets[i]).size() + size;
        }

        return size;
    }

    public void clear(){
        for (int i = 0; i < backets.length; i++) {
            ((LinkedList<Entry<K, V>>)backets[i]).clear();
        }
    }

    public class Entry<K, V> {
        private K key;
        private V value;

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        MyHashMap<String,Integer> t = new MyHashMap();

        t.put("Mihas",8);
        t.put("Sasa",34);
        t.put("Vova",89);
        t.put("Lesa",14);
        System.out.println("t.size() = " + t.size());
        System.out.println("t.get() = " + t.get("Sasa"));
        t.clear();
        System.out.println("t.size() = " + t.size());
    }

}
