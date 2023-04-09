package myArrayList;

import java.util.Arrays;

public class ArrayList<T> {
    private Object[] value = new Object[100];
    private int lastIndex = 0;
    public void add(T obj) {
        value[lastIndex] = obj;
        lastIndex++;
        checkEndIncreaseIfNeed();

    }
    public void remove(int i) {
        value[i] = null;
    }
    public int size() {
        return lastIndex;
    }
    public T get(int i) {
        return (T) value[i];
    }
    public void clear() {
        value = new Object[value.length];
    }

    private void checkEndIncreaseIfNeed(){
        if(lastIndex == value.length -1){
            value = Arrays.copyOf(value, value.length + 10);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(value);

    }

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Bye");
        list.add("Good morning");
        list.add("Hi");


        System.out.println();

        System.out.println(list.size());

        System.out.println(list.get(1));

        list.remove(0);

        System.out.println(list);

        list.clear();

        System.out.println(list);


    }




}

