import java.util.NoSuchElementException;

class SimpleLinkedList<T> {
    private Node<T> head;
    private int size;
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }

    }
    SimpleLinkedList() {
        this.head=null;
        this.size=0;
    }

    SimpleLinkedList(T[] values) {
        this();
        for(T value:values)
        push(value);
    }

    void push(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
           
        }

        size++;
    }

    T pop() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException();
            
        }
    
        if (head.next == null) {
            // If there's only one element in the list
            T poppedValue = head.data;
            head = null; // Set head to null as the list is now empty
            size--;
            return poppedValue;
        }
    
        Node<T> current = head;
        Node<T> prev = null;
    
        // Traverse until the second-to-last node
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
    
        // Now 'prev' is the second-to-last node, and 'current' is the last node
        T poppedValue = current.data;
        prev.next = null; // Remove the last node
        size--;
    
        return poppedValue;
        
    
        

    }

    void reverse() {
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    T[] asArray(Class<T> clazz) {
        this.reverse();
        T[] array = (T[]) java.lang.reflect.Array.newInstance(clazz, size);

        Node<T> current = head;
        int index = 0;

        while (current != null) {
            array[index++] = current.data;
            current = current.next;
        }

        return array;
    }

    int size() {
        return size;
    }
}
