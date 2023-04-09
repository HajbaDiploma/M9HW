package myStack;

import java.util.Arrays;

public class MyStack<T> {
    Object[] s = new Object[10];

    int lastElementIndex = 0;

    public void push(T obj) {
        s [lastElementIndex] = obj;
        lastElementIndex++;
        checkEndIncreaseIfNeed();

    }
    public T peek(){
        return (T) s[lastElementIndex -1];
    }

    public T pop(){
        Object res = s[lastElementIndex-1];
        s[lastElementIndex] = null;
        lastElementIndex--;
        return (T) res;
    }



    public int size(){
        return lastElementIndex;
    }

    public void clear(){
        for (int i = 0; i<lastElementIndex;i++){
          s[i] = null;
        }
    }

    private void checkEndIncreaseIfNeed(){
        if(lastElementIndex == s.length -1){
            s = Arrays.copyOf(s, s.length + 10);
        }
    }

}
