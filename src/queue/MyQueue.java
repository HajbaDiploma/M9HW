package queue;

import java.util.Arrays;

public class MyQueue<T> {

    Object[] q = new Object[10];
    int firstElementIndex = 0;
    int lastElementIndex = 0;

    public void add(T obj) {
        q [lastElementIndex] = obj;
        lastElementIndex++;
        checkEndIncreaseIfNeed();

    }

    public T peek(){
        return (T) q[firstElementIndex];
    }

    public T poll(){
        Object res = q[firstElementIndex];
        q[firstElementIndex] = null;
        firstElementIndex++;
        return (T) res;
    }
    public int size(){
        return lastElementIndex - firstElementIndex;
    }

    public void clear(){
        for (int i = firstElementIndex; i<lastElementIndex;i++){
            q[i] = null;
        }
        firstElementIndex = 0;
        lastElementIndex = 0;
    }

    private void checkEndIncreaseIfNeed(){
        if(lastElementIndex == q.length -1){
            q = Arrays.copyOf(q, q.length + 10);
        }
    }


}
