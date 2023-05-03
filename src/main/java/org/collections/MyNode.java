package org.collections;

public class MyNode<T> {
    private T data;

    public MyNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
