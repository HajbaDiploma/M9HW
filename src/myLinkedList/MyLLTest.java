package myLinkedList;

import myLinkedList.MyLinkedLis;

public class MyLLTest {

    public static void main(String[] args) {
        MyLinkedLis<String> ownLL = new MyLinkedLis();

        ownLL.add("apple");
        ownLL.add("banana");
        ownLL.add("melon");
        ownLL.add("lemon");
        ownLL.remove(2);
        System.out.println("ownLL.get(2) = " + ownLL.get(2));

        System.out.println("ownLL = " + ownLL);


    }
}
