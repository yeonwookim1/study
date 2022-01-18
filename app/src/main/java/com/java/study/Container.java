package com.java.study;

public class Container<T, V> {
    private T name;
    private V job;

    public void set(T t, V v){
        this.name = t;
        this.job = v;
    }

    public T getName() {
        return name;
    }

    public V getJob() {
        return job;
    }
}

// public class Container<T> {
//     private T name;

//     public T getName(){
//         return name;
//     }
//     public void setName(T t){
//         this.name = t;
//     }
    
// }
