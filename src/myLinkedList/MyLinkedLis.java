package myLinkedList;

public class MyLinkedLis<T> {
    Node<T> last;
    Node<T> first;

    private int size;

    public void add(T obj) {
        if(first == null) {
            first = new Node<>(null, null, obj);

        } else if (last == null) {
            last = new Node<>(first, null, obj);
            first.setNextElement(last);
        } else {
            Node<T> tNode = new Node<>(last, null, obj);
            last.setNextElement(tNode);
            last = tNode;
        }
        size++;
    }

    public Node remove(int index) {
        if(size<index){
            return null;
        }
        Node node= first;
        for (int i = 0; i < index; i++) {
            node= node.getNextElement();
        }
        Node nodenext =  node.getNextElement();
        Node nodepr =  node.getPreviousElement();
        nodepr.setNextElement(nodenext);
        nodenext.setPreviousElement(nodepr);
        size--;
        return node;
    }

    public Node<T> get(int index){
        if(size<index){
            return null;
        }
        Node node= first;
        for (int i = 0; i < index; i++) {
            node= node.getNextElement();
        }
        return node;
    }
    public int size(){
        return size;

    }
     public void clear(){
        first = last = null;
        size = 0;

     }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node currentNode = first;
        for (int i = 0; i<size; i++) {
            sb.append(currentNode.toString() + ", ");
            currentNode = currentNode.nextElement;
        }

        return "myLinkedList.MyLinkedLis{" +
                sb.toString() +
                '}';
    }

    public class Node <T> {

        private Node<T> previousElement;

        private Node<T> nextElement;

        private T currentElement;

        public Node(Node<T> previousElement, Node<T> nextElement, T currentElement) {
            this.previousElement = previousElement;
            this.nextElement = nextElement;
            this.currentElement = currentElement;
        }

        public Node<T> getPreviousElement() {
            return previousElement;
        }

        public void setPreviousElement(Node<T> previousElement) {
            this.previousElement = previousElement;
        }

        public Node<T> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<T> nextElement) {
            this.nextElement = nextElement;
        }

        public T getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(T currentElement) {
            this.currentElement = currentElement;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + currentElement +
                    '}';
        }
    }
}
